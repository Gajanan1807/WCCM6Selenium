package dataDriverFramework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiTimeValidLogin {
	
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("http://127.0.0.1/login.do;jsessionid=1mws6lrn9lam4");
		
		Flib flib = new Flib();
		String username = flib.readExcelData("./data/TestData.xlsx", "ValidCard", 1, 0);
		String password = flib.readExcelData("./data/TestData.xlsx", "ValidCard", 1, 1);
		
		
		driver.findElement(By.name("username")).sendKeys(username);
		
		driver.findElement(By.name("pwd")).sendKeys(password);
		
		driver.findElement(By.id("loginButton")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.titleContains("Enter"));
		
		flib.writeExcelData("./data/TestData.xlsx", "ValidCard", 1, 2, "pass");
	
		
		
	}

}
