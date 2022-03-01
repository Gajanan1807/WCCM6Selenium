package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Mobile",Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Samsung']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='low-price']")).sendKeys("10000",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='high-price']")).sendKeys("20000",Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='a-button-input']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@class='a-icon a-icon-checkbox']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='colorsprite aok-float-left']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@class=''a-icon a-icon-checkbox]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()=18,999]")).click();
		Thread.sleep(1000);
	}

}
