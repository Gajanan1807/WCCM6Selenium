package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmAssignmentway2 {

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
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Add Employee']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()=' First Name']")).sendKeys("Gajju");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Middle Name']")).sendKeys("S");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()=' Last Name']")).sendKeys("Ga");
		Thread.sleep(3000);
	}

}
