package testNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag6 {
	@Test(enabled = false)
	  public void f() 
	  {
		
		  Reporter.log("test case got executed",true);
	  }
	 @Test( enabled =  true)
	 public void g()
	 {
		 Reporter.log("test case got executed",true);
	 }

}
