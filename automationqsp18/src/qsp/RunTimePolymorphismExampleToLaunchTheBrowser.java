package qsp;
import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class RunTimePolymorphismExampleToLaunchTheBrowser {

	public static void main(String[] args) throws InterruptedException
 {
		WebDriver driver;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the browser name");
		String browserValue = sc.nextLine();
		
		if (browserValue.equalsIgnoreCase("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");//set the path of chromedriver executables(Avoid IllegalStateException)
			driver=new ChromeDriver();//open browser
			driver.manage().window().maximize();//maximize the browser
			driver.get("https://www.google.com");//launch the webapp with URL
			Thread.sleep(3000);//dealy 3000 sec
			driver.close();//close the windows
		}
		else if (browserValue.equalsIgnoreCase("firefox")) 
		{
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");//set the path of geckodriver executables(Avoid IllegalStateException)
			driver=new FirefoxDriver();//open browser
			driver.manage().window().maximize();//maximize the browser
			driver.get("https://www.google.com");//launch the webapp with URL
			Thread.sleep(10000);//dealy 10 sec
			driver.close();//close the firefox
		}
		else 
		{
			System.out.print("enter either chrome/firefox");
		}

	}
}
