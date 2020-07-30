package page.object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {
	@FindBy(css = "#id_gender1")
	WebElement gender_1;
	
	@FindBy(css = "#id_gender2")
	WebElement gender_2;
	
	@FindBy(css = "#customer_firstname")
	WebElement firstName;
	
	@FindBy(css = "#customer_lastname")
	WebElement lastname;
	
	@FindBy(css = "#passwd")
	WebElement password;
	
	@FindBy(css = "#days")
	WebElement dob_day;
	
	@FindBy(css = "#months")
	WebElement dob_month;
	
	@FindBy(css = "#years")
	WebElement dob_year;
	
	@FindBy(css = "#firstname")
	WebElement addr_firstname;
	
	@FindBy(css = "#lastname")
	WebElement addr_lastname;
	
	@FindBy(css = "#address1")
	WebElement addr;
	
	@FindBy(css = "#city")
	WebElement city;
	
	@FindBy(css = "#id_state")
	WebElement state;
	
	@FindBy(css = "#postcode")
	WebElement postcode;
	
	@FindBy(css = "#phone_mobile")
	WebElement mobile;
	
	@FindBy(css = "#alias")
	WebElement alias;
	
	@FindBy(css = "#submitAccount")
	WebElement submitBtn;
	
	WebDriver driver;
	
	public CreateAccount(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void selectGender(String gender) {
		if(gender.equalsIgnoreCase("male")) {
			gender_1.click();
		} else {
			gender_2.click();
		}
	}
	
	public void enterFirstname(String firstname) {
		this.firstName.sendKeys(firstname);
	}
	
	public void enterLastname(String lastname) {
		this.lastname.sendKeys(lastname);
	}
	
	public void enterPassword(String password) {
		this.password.sendKeys(password);
	}
	
	public void enterDOB(String day, String month, String year) {
		Select daySelect = new Select(this.dob_day);
		Select monthSelect = new Select(this.dob_month);
		Select yearSelect = new Select(this.dob_year);
		
		daySelect.selectByValue(day);
		monthSelect.selectByValue(month);
		yearSelect.selectByValue(year);
 	}
	
	public void setAddr(String firstname, String lastname, String address, String city, String state, String postcode, String phoneNo, String alias) {
		this.addr_firstname.sendKeys(firstname);
		this.addr_lastname.sendKeys(lastname);
		this.addr.sendKeys(address);
		this.city.sendKeys(city);
		this.postcode.sendKeys(postcode);
		this.mobile.sendKeys(phoneNo);
		this.alias.sendKeys(alias);
		
		Select stateSelect = new Select(this.state);
		stateSelect.selectByVisibleText(state);
	}
	
	public void clickSubmit() {
		this.submitBtn.click();
	}
}
