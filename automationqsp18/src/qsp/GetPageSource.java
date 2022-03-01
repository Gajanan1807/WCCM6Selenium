package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSource {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https:/www.instagram.com");
		String SourceCodeOfTheWebPage = driver.getPageSource();
		System.out.println(SourceCodeOfTheWebPage);
		Thread.sleep(5000);
		driver.close();

	}

}
