package features;

import org.openqa.selenium.WebDriver;

import page.object.CreateAccount;
import page.object.SignIn;

public class CreateAccnt {
	
	WebDriver driver;
	
	public CreateAccnt(WebDriver driver) {
		this.driver = driver;
	}
	
	public void createNewAccntPage(String email) {
		SignIn signIn = new SignIn(driver);
		signIn.insertCreateAcctEmail(email);
		signIn.clickCreateAccntBtn();
	}
	
	public void createNewAccnt(String gender, String firstname, String lastname, String password, String day, String month, String year, String address, String city, String state, String postcode, String phoneNo, String alias) {
		CreateAccount createAccount = new CreateAccount(driver);
		
		createAccount.selectGender(gender);
		createAccount.enterFirstname(firstname);
		createAccount.enterLastname(lastname);
		createAccount.enterPassword(password);
		createAccount.enterDOB(day, month, year);
		createAccount.setAddr(firstname, lastname, address, city, state, postcode, phoneNo, alias);
		createAccount.clickSubmit();
		
	}
}
