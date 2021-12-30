package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

	@FindBy(id = "email")
	private WebElement email;
	
	@FindBy(id = "SubmitLogin")
	private WebElement submit;
	
	@FindBy(id = "passwd")
	private WebElement passwd;
	
	private WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
        PageFactory.initElements(driver, this);
	}
	
	public void doLogin(String username, String password) {
		email.sendKeys(username);
		passwd.sendKeys(password);
		submit.click();
	}
	
	public void loadAndWaitForElements() {
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("SubmitCreate")));
	}
}
