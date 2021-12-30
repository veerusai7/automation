package pages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationPage {
	
	@FindBy(id = "email_create")
	private WebElement email;
	
	@FindBy(id = "SubmitCreate")
	private WebElement submit;
	
	@FindBy(id = "id_gender1")
	private WebElement gender;
	
	@FindBy(id = "customer_firstname")
	private WebElement cfirstname;
	
	@FindBy(id = "customer_lastname")
	private WebElement clastname;
	
	@FindBy(id = "passwd")
	private WebElement password;
	
	@FindBy(id = "firstname")
	private WebElement firstname;
	
	@FindBy(id = "lastname")
	private WebElement lastname;
	
	@FindBy(id = "address1")
	private WebElement address;
	
	@FindBy(id = "city")
	private WebElement city;
	
	@FindBy(id = "id_state")
	private WebElement state;
	
	@FindBy(id = "postcode")
	private WebElement zipcode;
	
	@FindBy(id = "phone_mobile")
	private WebElement mobile;
	
	@FindBy(id = "alias")
	private WebElement aliasAdd;
	
	@FindBy(id = "submitAccount")
	private WebElement createaccount;
	
	private WebDriver driver;

	public RegistrationPage(WebDriver driver) {
		this.driver = driver;
        PageFactory.initElements(driver, this);
	}
	
	public void submitEmail(String emailId) {
		email.sendKeys(emailId);
		submit.click();
	}
	
	public void loadAndWaitForElements() {
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("SubmitCreate")));
	}
	
	public void fillAndSubmitForm(String passwd) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("id_gender1")));
		gender.click();
		cfirstname.sendKeys("sand");
		clastname.sendKeys("pal");
		password.sendKeys(passwd);
		firstname.sendKeys("sandiago");
		lastname.sendKeys("pavlol");
		address.sendKeys("jai balaya street");
		city.sendKeys("mumbai");
		//wait.until(ExpectedConditions.elementToBeClickable(state));
		
		zipcode.sendKeys("65644");
		mobile.sendKeys("4785236941");
		wait.until(ExpectedConditions.visibilityOf(aliasAdd));
		wait.until(ExpectedConditions.visibilityOf(createaccount));
		aliasAdd.sendKeys("akhanda street");
		
		state.click();
		Select select = new Select(state);
		select.selectByValue("9");
		
		createaccount.click();
		
		
	}
	
}
