package xPath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YouTubexpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		Thread.sleep(3000);
		/*
		 * driver.findElement(By.xpath("//input[@name='search_query']")).
		 * sendKeys("marathi song",Keys.ENTER); Thread.sleep(2000);
		 */
		/*
		 * driver.findElement(By.xpath("//yt-icon[@class='style-scope ytd-searchbox']"))
		 * .click(); Thread.sleep(2000);
		 */
		driver.findElement(By.xpath("//img[@src='https://i.ytimg.com/vi/9YSbflKeOZQ/hq720.jpg?sqp=-oaymwEcCNAFEJQDSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLCctZgf4M0asvbnSGx_iWAYG_uuyA']")).click();
		Thread.sleep(2000);
	}//img
	
}
