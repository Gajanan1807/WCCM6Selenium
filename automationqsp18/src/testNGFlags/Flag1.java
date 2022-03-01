package testNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag1 {
	
		  @Test(description = "test case is used to display")
		  public void c() 
		  {
			  Reporter.log("login",true);
		  }

}
