package pages;

import wrappers.Annotations;

public class LoginPage extends Annotations {
	
	public LoginPage enterUserName(String data) {
		driver.findElementById("username").sendKeys(data);
		return this;
	}
	
	public LoginPage enterPassword(String data) {
		driver.findElementById("password").sendKeys(data);
		return this;
	}
	
	public HomePage clickLoginButton() {
		driver.findElementByClassName("decorativeSubmit").click();
		/*HomePage hp = new HomePage();
		return hp;*/
		return new HomePage();
	}
	
	
	
	
	

}
