package features;

import org.openqa.selenium.WebDriver;

public class SignIn {
	WebDriver driver;
	
	public SignIn(WebDriver driver) {
		this.driver = driver;
	}
	
	public void signInToAccnt(String email, String password) {
		page.object.SignIn page = new page.object.SignIn(driver);
		page.insertLoginAccnt(email, password);
		page.ClickLoginBtn();
	}
}
