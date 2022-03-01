package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://opensource-demo.orangehrmlive.com");
		driver.findElement(By.name("txtUsername")).sendKeys("admin");
		Thread.sleep(3000);
		
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		Thread.sleep(5000);
		
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(2000);

		driver.close();

	}

}
