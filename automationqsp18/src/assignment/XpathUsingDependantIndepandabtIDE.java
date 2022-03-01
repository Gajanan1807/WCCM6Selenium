package assignment;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathUsingDependantIndepandabtIDE {

	public static void main(String[] args) throws InterruptedException {
		 
		Scanner sc=new Scanner(System.in);
		System.out.println("enter thelanuge name");
		String nameOfLanuge=sc.nextLine();
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/downloads/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//p[.='java']/ancestor::div[contains(@class,'card-body')]/descendant::a[.='API Docs']")).click();

		driver.findElement(By.xpath("//p[.='"+nameOfLanuge+"']/ancestor::div[contains(@class,'card-body')]/descendant::a[.='API Docs']")).click();
        
	}

}
