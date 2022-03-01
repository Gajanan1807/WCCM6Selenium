package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLaunch {
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         new ChromeDriver();
	}

}
