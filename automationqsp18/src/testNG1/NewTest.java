package testNG1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class NewTest {
  WebDriver driver;
  

  @BeforeMethod
  public void SetUp() 
  {
	  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
		driver.get("http://opensource-demo.orangehrmlive.com");
	  
  }

  @AfterMethod
  public void tearDown()
  {
	  driver.close();
  }
  @Test(dataProvider = "actiTimeInValidLogin")
  public void testOrangeHRM(String un,String pwd)
  {
	 driver.findElement(By.id("txtUsername")).sendKeys(un);
	 driver.findElement(By.id("txtPassword")).sendKeys(pwd);
	 driver.findElement(By.id("btnLogin")).click();
  }
  
  @DataProvider(name="actiTimeInValidLogin")
  public Object[][] dataPrivider()
  {
	  Object[][]data =new Object[5][2];
	  data[0][0]="admin";
	  data[0][1]="manager123";
	  
	  data[1][0]="123admin";
	  data[1][1]="manager";
	  
	  data[2][0]="admin$123";
	  data[2][1]="manager123";
	  
	  data[3][0]="a123";
	  data[3][1]="manager123";
	  
	  data[4][0]="ad min";
	  data[4][1]="manager";
	return data;
	  
  }

}
