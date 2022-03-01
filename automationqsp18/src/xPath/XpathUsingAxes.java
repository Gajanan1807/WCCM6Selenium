package xPath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathUsingAxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("laptop",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='TVs & Appliances']/following-sibling::span[.='Women']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[.='Women']//preceding-sibling::span[.='Electronics']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[.='Women']/ancestor::div[@class='_331-kn']")).click();
		Thread.sleep(3000);

	}

}
