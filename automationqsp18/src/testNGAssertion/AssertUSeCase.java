package testNGAssertion;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertUSeCase {

	@Test
	public void testOrangeHrm() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		 FirefoxDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		String actualLoginPageTitle = driver.getTitle();
		SoftAssert softassert = new SoftAssert();
		softassert.assertEquals(actualLoginPageTitle, "OrangeHRM");
		
		
		WebElement username = driver.findElement(By.name("txtUsername"));
		boolean statusOfUsernameTextBox = username.isDisplayed();
		Assert.assertEquals(statusOfUsernameTextBox, true);
		username.sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		Thread.sleep(4000);
		String actualHomePageTitle = driver.getTitle();
		
		softassert.assertEquals(actualHomePageTitle, "OrangeHRM Dashboard");
		
		
		
		
		Reporter.log("create user",true);
		Reporter.log("delete user",true);

		softassert.assertAll();
	}

}

