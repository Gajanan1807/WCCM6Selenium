package xPath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAssignment {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles",Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Smartphones']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='MI']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='low-price']")).sendKeys("10000");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='high-price']")).sendKeys("30000");
		Thread.sleep(3000);
		driver.findElement(By.className("a-button-input")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='10% Off or more']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='64 GB']")).click();
		Thread.sleep(3000);
		driver.findElement(By.className("colorsprite aok-float-left")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='4000 mAh & More']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Dual SIM']")).click();
		Thread.sleep(3000);
		
    
	}
	
}
