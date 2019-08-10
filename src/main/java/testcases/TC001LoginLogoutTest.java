package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.Annotations;

public class TC001LoginLogoutTest extends Annotations {
	
	@BeforeTest
	public void setData() {
		excelFileName = "TC001";
	}
	
	@Test(dataProvider = "fetchData")
	public void loginLogout(String userName, String password, String logInName) {
		new LoginPage()
		.enterUserName(userName)
		.enterPassword(password)
		.clickLoginButton()
		.verifyLoginName(logInName)
		.clickLogoutButton();
	}
	
	
	
	
	
	
	
	
	
	

}
