package pages;

import wrappers.Annotations;

public class HomePage extends Annotations {
	
	public HomePage verifyLoginName(String data) {
		String loginName = driver.findElementByTagName("h2").getText();
		if(loginName.contains(data)) {
			System.out.println("Login success");
		}else {
			System.out.println("Logged username mismatch");
		}
		return this;
	}
	
	public LoginPage clickLogoutButton() {
		driver.findElementByClassName("decorativeSubmit").click();
		return new LoginPage();
	}
	
	
	
	
	
	
	
	

}
