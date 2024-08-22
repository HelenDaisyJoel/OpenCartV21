package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	
	WebDriver driver;
	public HomePage(WebDriver driver)
	{
		super(driver);	
		
	}
	
//	@FindBy(xpath="//span[normalize-space()='Register']")
	@FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Register']")
	WebElement lnkMyRegister;
	
	
//	By.xpath("//span[normalize-space()='My Account']")
	@FindBy(xpath="//span[normalize-space()='My Account']")
	WebElement lnkMyAccount;
	
	@FindBy(linkText="Login")
	WebElement linkLogin;
	
	public void clickMyAccount() {
		lnkMyAccount.click();
	}
	public void clickRegister() {
		lnkMyRegister.click();
	}
	
	public void clickLogin() {
		linkLogin.click();
	}
	
}
