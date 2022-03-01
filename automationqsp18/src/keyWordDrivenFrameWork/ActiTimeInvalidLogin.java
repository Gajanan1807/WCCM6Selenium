package keyWordDrivenFrameWork;


import java.io.IOException;

import org.openqa.selenium.By;

public class ActiTimeInvalidLogin extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt = new BaseTest();
		bt.openBrowser();
	  Flib flib = new Flib();
	  int rc = flib.getRowCount("./data/TestData.xlsx","Invalidcar");
	  
	  for (int i=1;i<rc;i++)
	  {
		  String username = flib.readExcelData("./data/TestData.xlsx","Invalidcar",i,0);
			driver.findElement(By.name("username")).sendKeys(username);
			
			String password = flib.readExcelData("./data/TestData.xlsx","Invalidcar",i,1);
			driver.findElement(By.name("pwd")).sendKeys(password);
		
			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(2000);
            driver.findElement(By.name("username")).clear();
	  }

	}
	}
