package features;

import org.openqa.selenium.WebDriver;

import page.object.AppPage;

public class Logout {
	WebDriver driver;
	
	public Logout(WebDriver driver) {
		this.driver = driver;
	}
	
	public void logoutAccnt() {
		new AppPage(driver).clickLogoutBtn();
	}
}
