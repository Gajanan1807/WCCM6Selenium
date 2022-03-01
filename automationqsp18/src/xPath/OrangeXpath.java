package xPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://opensource-demo.orangehrmlive.com");
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//b[text()='PIM']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Add Employee']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Gajanan");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='middleName']")).sendKeys("S");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Ga");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='employeeId']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='employeeId']")).sendKeys("1818");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='btnSave']")).click();
		Thread.sleep(2000);
	}

}

