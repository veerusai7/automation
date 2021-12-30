package automationproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest {
	
	private WebDriver driver;
	private LoginPage loginPage;
	
	public LoginTest() {
		this.driver = new ChromeDriver();
		this.loginPage = new LoginPage(driver);
	}

	@Test
	public void loginSuccess() {
		LoginPage loginPage = new LoginPage(driver);
		
		loginPage.loadAndWaitForElements();
		loginPage.doLogin("e3f2bc17-06dd-4039-b78c-b815a686f55f@gmail.com", "BalayyaRocks!");
	}
}
