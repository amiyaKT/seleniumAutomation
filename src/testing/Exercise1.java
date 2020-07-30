package testing;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import features.CreateAccnt;
import features.Logout;
import features.SignIn;
import page.object.LandingPage;

public class Exercise1 {
	
	WebDriver driver;

	@BeforeClass
	public void beforeTest() {
		this.driver = new WebDriverClassFile().initializeDriver();
		this.driver.get("http://automationpractice.com/index.php");
	}
	
	@Test(priority = 1)
	public void test1() {
		LandingPage page = new LandingPage(this.driver);
		page.clickLoginBtn();
	}
	
	@Test(dataProvider = "createAccnt", priority = 2)
	public void test2(String email) {
		new CreateAccnt(driver).createNewAccntPage(email);
	}
	
	@Test(dataProvider = "userDetails", priority = 3)
	public void test3(String gender, String firstname, String lastname, String password, String day, String month, String year, String address, String city, String state, String postcode, String phoneNo, String alias) {
		new CreateAccnt(driver).createNewAccnt(gender, firstname, lastname, password, day, month, year, address, city, state, postcode, phoneNo, alias);
	}
	
	@Test(priority = 4)
	public void test4() {
		new Logout(driver).logoutAccnt();
	}
	
	@Test(priority = 5, dataProvider = "userLoginCred")
	public void test5(String email, String password) {
		new SignIn(driver).signInToAccnt(email, password);
	}
	
	@AfterTest
	public void afterTest() {
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
	}
	
	@DataProvider(name = "createAccnt")
	public Object[][] createAccntEmail() {
		Object[][] obj = new Object[][] {
			{"test_amiya3@gmail.com"}
		};
		
		return obj;
	}
	
	@DataProvider(name = "userDetails")
	public Object[][] createAccntUserData() {
		Object[][] obj = new Object[][] {
			{"male", "amiya", "kumar", "test@1234", "1", "1", "1998", "abcd", "city", "Alabama", "12345", "123456789", "addr1"}
		};
		
		return obj;
	}
	
	@DataProvider(name = "userLoginCred")
	public Object[][] loginAccnt() {
		Object[][] obj = new Object[][] {
			{"test_amiya3@gmail.com", "test@1234"}
		};
		
		return obj;
	}
}
