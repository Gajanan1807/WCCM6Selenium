package testNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag4 {
	@Test()
	  public void Signin() 
	  {
		int i=0;
		int res=8/i;
		  Reporter.log("login Feature",true);
	  }
	 @Test(dependsOnMethods = "Signin")
	 public void Logout()
	 {
		 Reporter.log("Logout feature",true);
	 }

}
