package takeScreenShotDynamically;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;
import org.testng.thread.ITestNGThreadPoolExecutor;

public class CommanListener extends BaseTest implements ITestListener {
  @Override
	public void onTestStart(ITestResult result) {
		
	}

	@Override
	public void onTestSuccess(ITestResult result)
	{
	
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		String methodname=result.getMethod().getMethodName();
		Failed(methodname);
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
	{
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) 
	{
	
	}

	@Override
	public void onStart(ITestContext context) 
	{
		
	}

	@Override
	public void onFinish(ITestContext context) 
	{
		
	}

@Test
  public void f() {
  }
}
