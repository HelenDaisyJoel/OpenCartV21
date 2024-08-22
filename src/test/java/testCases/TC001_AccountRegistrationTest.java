package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;
public class TC001_AccountRegistrationTest extends BaseClass{
	
//	Inputs
	String fName=RandomString().toUpperCase();
	String lName=RandomString().toUpperCase();
	String Email=RandomAlphaNumeric();
	String telephone=RandomNumber();
	String password1=RandomAlphaNumeric();;
	String password=password1;
	String confirmPassword=password1;
	@Test(groups={"Regression","Master"})
	public void verify_account_registration()
	{
		logger.info("*****************Registration Test**********************");
		HomePage hp=new HomePage(driver);
		logger.info("Click on the Account");
		hp.clickMyAccount();
		logger.info("Click on the Register");
		hp.clickRegister();
		
		logger.info("Providing the customer details");
		AccountRegistrationPage ap=new AccountRegistrationPage(driver);
		ap.registerAccount(fName, lName, Email,telephone, password, confirmPassword);
		logger.info("Validating the Confirmation Message");
		String confirmationMessage=ap.getConfirmationMessage();
		try {
		Assert.assertEquals(confirmationMessage, "Your Account Has Been Created!");
	}
	catch(Exception e) {
		logger.error("Test failed.....");
		logger.debug("Debug Logs.....");
		Assert.fail();
	}
	
		logger.info("*****************Finished**********************");
	}
}
