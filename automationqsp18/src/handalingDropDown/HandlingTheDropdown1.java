package handalingDropDown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingTheDropdown1 {
//singleSelect
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("file://C:\\\\Users\\\\Administrator\\\\Desktop\\\\eclipse\\\\singleSelectDropdown.html");
		
		
		WebElement element = driver.findElement(By.id("menu"));
		Select sel = new Select(element);
		sel.selectByIndex(7);// index starts with zero 
		
		
	}

}
