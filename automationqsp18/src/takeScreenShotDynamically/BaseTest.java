package takeScreenShotDynamically;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.google.common.io.Files;
@Listeners(CommanListener.class)
public class BaseTest {
	static WebDriver driver;
	
 
  public  static void intialization()
  {
	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://opensource-demo.orangehrmlive.com");
  }
  public void Failed(String methodname)  
  {
	  try {
	 TakesScreenshot ts = (TakesScreenshot)driver;
	 File src = ts.getScreenshotAs(OutputType.FILE);
	 File dest = new File("./screenshoots/"+methodname+".png");
	 Files.copy(src,dest);
	  
	  
  }
	  catch (Exception e) 
	  {
		
	}
  }
  }
