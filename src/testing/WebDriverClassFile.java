package testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverClassFile {
	
	private WebDriver driver;
	
	public WebDriverClassFile() {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver/chromedriver.exe");
		this.driver= new ChromeDriver();
		this.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public WebDriver initializeDriver() {
		return this.driver;
	}
}
