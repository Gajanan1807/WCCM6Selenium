package parallelExecution;

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ParallelMethodExecution {
  @Test
  public void Method1() 
  {
	  Reporter.log("method1 ",true);
	  Reporter.log(Thread.currentThread().getId()+"",true);
  }
  
 
	  @Test
	  public void Method2() 
	  {
		  Reporter.log("method2 ",true);
		  Reporter.log(Thread.currentThread().getId()+"",true);
	  }
}
