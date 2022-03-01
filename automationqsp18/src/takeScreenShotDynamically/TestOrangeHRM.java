package takeScreenShotDynamically;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class TestOrangeHRM extends BaseTest {
 
  @BeforeMethod
  public void beforeMethod() 
  {
	  intialization();
  }

  @AfterMethod
  public void afterMethod() 
  {
	  driver.quit();
  }
  @Test
  public void TestOramgeHRM() 
  {
	  String actualLoginPageTitle = driver.getTitle();
		SoftAssert softassert = new SoftAssert();
		softassert.assertEquals(actualLoginPageTitle, "OrangeHRM1234");
		softassert.assertAll();
  }
  @Test
	public void testOrangeHRM0() 
	{
		String actualLoginPageTitle = driver.getTitle();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(actualLoginPageTitle, "OrangeHRM234");
		softAssert.assertAll();
	}
	
	@Test
	public void testOrangeHRM1() 
	{
		String actualLoginPageTitle = driver.getTitle();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(actualLoginPageTitle, "OrangeHRM234");
		softAssert.assertAll();
	}
	
	

}
