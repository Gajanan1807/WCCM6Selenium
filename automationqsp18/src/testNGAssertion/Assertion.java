package testNGAssertion;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion {
  @Test
  public void TestScript() 
  {
	  Reporter.log("open the browser",true);
	  Reporter.log("launch the web app",true);
	  
	  SoftAssert softassert = new SoftAssert();
	  softassert.assertEquals(false, true);
	  
	  Reporter.log("varify the login page title",true);
	  Reporter.log("send password",true);
	  Reporter.log("click on login page title",true);
	  Reporter.log("varify the home page title",true);
	  Reporter.log("create user",true);
	  Reporter.log("delete user",true);
	  
	  softassert.assertAll();
  }
}
