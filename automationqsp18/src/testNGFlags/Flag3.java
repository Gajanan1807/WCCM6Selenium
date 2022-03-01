package testNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag3 {
	 @Test()
	  public void Signin() 
	  {
		  Reporter.log("login Feature",true);
	  }
	 @Test(dependsOnMethods = "Signin")
	 public void Logout()
	 {
		 Reporter.log("Logout feature",true);
	 }

}
