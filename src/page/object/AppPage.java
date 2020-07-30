package page.object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AppPage {

	@FindBy(css = ".logout")
	WebElement logoutBtn;
	
	WebDriver driver;
	
	public AppPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickLogoutBtn() {
		this.logoutBtn.click();
	}
}
