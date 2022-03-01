package stale;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ActiTimeLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS );
		driver.get("http://127.0.0.1/login.do;jsessionid=kjhrrh8kau9g");
		
		
		WebElement username = driver.findElement(By.name("username"));
username.sendKeys("admin");
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		username.clear();//StateElementReferenceException

	}

}
