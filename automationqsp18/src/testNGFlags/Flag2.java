package testNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag2 {
	 @Test(invocationCount = 18)
	  public void c() 
	  {
		  Reporter.log("generates the invocation bug",true);
	  }

}
