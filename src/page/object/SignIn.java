package page.object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignIn {

	WebDriver driver;
	
	@FindBy(css = "#email_create")
	WebElement createAccntEmail;
	
	@FindBy(css = "#SubmitCreate")
	WebElement createAccntBtn;
	
	@FindBy(css = "#email")
	WebElement email;
	
	@FindBy(css = "#passwd")
	WebElement password;
	
	@FindBy(css = "#SubmitLogin")
	WebElement loginBtn;
	
	public SignIn(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void insertCreateAcctEmail(String email) {
		this.createAccntEmail.sendKeys(email);
	}
	
	public void clickCreateAccntBtn() {
		this.createAccntBtn.click();
	}
	
	public void insertLoginAccnt(String email, String password) {
		this.email.sendKeys(email);
		this.password.sendKeys(password);
	}
	
	public void ClickLoginBtn() {
		this.loginBtn.click();
	}
}
