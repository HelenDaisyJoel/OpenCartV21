package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		
	}
	@FindBy(xpath="//input[@id='input-email']")
	WebElement emailfield;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement passwordfield;
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement clickLogin;
	
	public void loginDetails(String email, String password) {
		emailfield.sendKeys(email);
		passwordfield.sendKeys(password);
		clickLogin.click();
	}
	
	
	
	



}
