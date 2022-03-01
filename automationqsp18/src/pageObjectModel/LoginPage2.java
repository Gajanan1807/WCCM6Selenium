package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 {
	
	//Declaration  @find (control+space)
	
	@FindBy(name="username") private WebElement usn;
	@FindBy(name="pwd") private WebElement psw;
	@FindBy(id="loginButton") private WebElement loginBtn;
	@FindBy(name="//img[contains(@src,'timer')]") private WebElement logo;
	@FindBy(name="keepLoggedInCheckBox") private WebElement keepMeLoggedCheckBox;

	
	
	
	
	
	//initialization
	public LoginPage2(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	
	
	
	
	
	//utilization  Goto Source(click on source select get and set and expand all element and click on get then enter)
	public WebElement getUsn() {
		return usn;
	}
	
	public WebElement getPsw() {
		return psw;
	}
	public WebElement getLoginBtn() {
		return loginBtn;
	}
	public WebElement getLogo() {
		return logo;
	}
	public WebElement getKeepMeLoggedCheckBox() {
		return keepMeLoggedCheckBox;
	}
	
	
	public void validLogin(String validUsername, String validPassword)
	{
		usn.sendKeys(validUsername);
		psw.sendKeys(validPassword);
		loginBtn.click();
	}
	public void invalidLogin1(String invalidUsername, String invalidPassword) throws InterruptedException
	{
		usn.sendKeys(invalidUsername);
		Thread.sleep(2000);
		psw.sendKeys(invalidPassword);
		Thread.sleep(2000);
		loginBtn.click();
		usn.clear();
	}
}
	


