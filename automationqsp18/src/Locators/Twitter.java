package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Twitter {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.twitter.com/");
		driver.findElement(By.name("text")).sendKeys("9623819681");
		Thread.sleep(3000);
		
		driver.findElement(By.name("pass")).sendKeys("admin12345");
		Thread.sleep(5000);
		
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);

		driver.close();

	}

}
