package keyWordDrivenFrameWork;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
	
	static WebDriver driver;
	
		public void openBrowser() throws IOException, InterruptedException
		{
			Flib flib=new Flib();
			String browserValue=flib.readPropertyData("./data/Config.properties", "browser");
			String url = flib.readPropertyData("./data/Config.properties", "url");
			
			if (browserValue.equalsIgnoreCase("chrome")) 
			{
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");//set the path of chromedriver executables(Avoid IllegalStateException)
				driver=new ChromeDriver();//open browser
				driver.manage().window().maximize();//maximize the browser
				driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
				driver.get(url);
			}
			else if (browserValue.equalsIgnoreCase("firefox")) 
			{
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");//set the path of geckodriver executables(Avoid IllegalStateException)
				driver=new FirefoxDriver();//open browser
				driver.manage().window().maximize();//maximize the browser
				driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
				driver.get(url);

			}
			else 
			{
				System.out.print("enter either chrome/firefox");
			}

        }
		public void closeBrowser()
		{
			driver.quit();
		}
}
