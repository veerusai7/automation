package cucumberPackage;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginTest {
	WebDriver driver;
	String title;
	
	@Given("webdriver will be intiated")
	public void webdriver_will_be_intiated() {
	    driver = null;
	    
	}

	@Given("type of browser")
	public void type_of_browser() {
	    driver = new ChromeDriver();
	}

	@When("I visit the login page")
	public void i_visit_the_login_page() {
	    driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	}

	@When("add username")
	public void add_username() {
	    driver.findElement(By.id("email")).sendKeys("e3f2bc17-06dd-4039-b78c-b815a686f55f@gmail.com");
	}

	@When("add password")
	public void add_password() {
	   driver.findElement(By.id("passwd")).sendKeys("BalayyaRocks!");
	}

	@Then("validate the credentials")
	public void validate_the_credentials() {
	    driver.findElement(By.id("SubmitLogin")).click();
	}

	@Then("check for the successful login")
	public void check_for_the_successful_login() {
	    title = driver.getTitle();
	    assertEquals(title, "My account - My Store");
	    driver.quit();
	}
	@When("add {string} , {string}")
	public void add(String username, String password) {
		 driver.findElement(By.id("email")).sendKeys(username);
		 driver.findElement(By.id("passwd")).sendKeys(password);
	}

}
