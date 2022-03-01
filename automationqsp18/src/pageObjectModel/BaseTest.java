package pageObjectModel;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import dataDriverFramework.Flib;

public class BaseTest implements IAutoConstant  {
	
	
	static WebDriver driver;
	
		public void openBrowser() throws IOException, InterruptedException
		{
			Flib flib=new Flib();
			String browserValue=flib.readPropertyData(PROP_PATH, "browser");
			String url = flib.readPropertyData(PROP_PATH, "url");
			
			if (browserValue.equalsIgnoreCase("chrome")) 
			{
				System.setProperty(CHROME_KEY, CHROME_PATH);//set the path of chromedriver executables(Avoid IllegalStateException)
				driver=new ChromeDriver();//open browser
				driver.manage().window().maximize();//maximize the browser
				driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
				driver.get(url);
			}
			else if (browserValue.equalsIgnoreCase("firefox")) 
			{
				System.setProperty(GECKO_KEY,GECKO_PATH);//set the path of geckodriver executables(Avoid IllegalStateException)
				driver=new FirefoxDriver();//open browser
				driver.manage().window().maximize();//maximize the browser
				driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
				driver.get(url);

			}
			else 
			{
				System.out.print("invalid option");
			}
		}
			public void closeBrowser1()
			{
				driver.quit();
			}

        
		public void closeBrowser()
		{
			driver.quit();
		}
}
 