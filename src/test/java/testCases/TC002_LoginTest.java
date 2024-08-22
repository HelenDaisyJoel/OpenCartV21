package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC002_LoginTest extends BaseClass{
	@Test(groups={"Sanity", "Master"})
	public void verify_login() {
		logger.info("******Login Test*********");
		try {
		HomePage hp=new HomePage(driver);
//		hp.clickRegister();
		hp.clickMyAccount();
//		Thread.sleep(1000);
		hp.clickLogin();
		
		LoginPage lp=new LoginPage(driver);
		lp.loginDetails(p.getProperty("email"), p.getProperty("password"));
		
		MyAccountPage ap=new MyAccountPage(driver);
		boolean targetPage=ap.isMyAccountPageExists();
		Assert.assertEquals(targetPage, true, "Login Failed");
		}
		catch(Exception e) {
			Assert.fail();
		}
		logger.info("******Finished Login Test*********");		
		
	}

}
