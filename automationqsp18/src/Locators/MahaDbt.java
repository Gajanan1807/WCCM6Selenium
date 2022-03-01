package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MahaDbt {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mahadbtmahait.gov.in/login/login");
		driver.findElement(By.name("UserName")).sendKeys("Gajanan18");
		Thread.sleep(3000);
		
		driver.findElement(By.name("Password")).sendKeys("admin12345");
		Thread.sleep(5000);
		
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(200000);
		driver.findElement(By.id("CaptchaInputText")).click();
		Thread.sleep(200000);

		driver.close();

	}

}
