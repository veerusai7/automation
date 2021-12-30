package automationproject;

import java.util.UUID;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.RegistrationPage;

public class RegistrationTest {
	private WebDriver driver;
	private RegistrationPage registrationPage;
	
	public RegistrationTest() {
		this.driver = new ChromeDriver();
		this.registrationPage = new RegistrationPage(driver);
	}

	@Test
	public void shouldRegisterSuccessfully() {
		String validEmail = UUID.randomUUID().toString() + "@gmail.com";
		String password = "BalayyaRocks!";
		//System.out.println(validEmail);
		this.registrationPage.loadAndWaitForElements();
		this.registrationPage.submitEmail(validEmail);
		this.registrationPage.fillAndSubmitForm(password);
	}
}
