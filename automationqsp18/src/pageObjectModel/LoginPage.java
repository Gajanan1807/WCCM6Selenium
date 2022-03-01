package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	//Declaration  @find (control+space)
	
	@FindBy(name="username") private WebElement usn;
	@FindBy(name="pwd") private WebElement psw;
	@FindBy(id="loginButton") private WebElement loginBtn;
	@FindBy(name="//img[contains(@src,'timer')]") private WebElement logo;
	@FindBy(name="keepLoggedInCheckBox") private WebElement keepMeLoggedCheckBox;

	
	
	//initialization(from source select constructor using fields and deselect all)
	public LoginPage(WebDriver driver) {
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
	
	
	//Operational Methods
	public void sendUserName()
	{
		usn.sendKeys("admin");
	}
	public void sendPassword()
	{
		psw.sendKeys("manager");
	}
	public void clickOnLoginButton()
	{
		loginBtn.click();
	}
	
	public void delayOfTwoSeconds() throws InterruptedException  
	{
		Thread.sleep(2000);
	}
	
	// OR By using Generic resable method (we can execute by both methods generic or operational but generic is better)
	
	public void validLogin (String validUsername,String validPassword)
	{
		usn.sendKeys(validUsername);
		psw.sendKeys(validPassword);
		loginBtn.click();
	}
	
	public void invalidLogin(String invalidUsername,String invalidPassword) throws InterruptedException
	{
		usn.sendKeys(invalidUsername);
		Thread.sleep(2000);
		psw.sendKeys(invalidPassword);
		Thread.sleep(2000);
		loginBtn.click();
		usn.clear();
	}
	

}
