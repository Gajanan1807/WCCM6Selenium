package testNGAnnotationFrameWork;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestValidLogin extends BaseTest {
  @Test
  
  public void validLogin() 
  {
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("pwd")).sendKeys("manager");
      driver.findElement(By.id("loginButton")).click();
  }
}


//Execution order :-we dont create object  of BaseTest it will automatically go for before method then
//it will select test method and then it will go for after method