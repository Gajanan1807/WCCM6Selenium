package xPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UniqueAttributeXpath1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("manager");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='sqdOP  L3NKy   y3zKF     ']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@class='_2Lks6']")).click();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//span[@class='_7UhW9   xLCgt       qyrsm      gtFbE      se6yk        ']")).click();
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@class='sqdOP yWX7d     _8A5w5   ZIAjV ']")).click();
		Thread.sleep(5000);
		
		driver.close();

	}

}
