package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrderFlowPages {
	
	@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[3]/a")
	public WebElement Tshirts;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]")
	public WebElement AddtoCart;
	
	@FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")
	public WebElement checkout;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/p[2]/a[1]")
	public WebElement proceedToCheckout;
	
	@FindBy(name = "processAddress")
	public WebElement proceedAddress;
	
	@FindBy(id = "uniform-cgv")
	public WebElement agreeTerms;
	
	@FindBy(name = "processCarrier")
	public WebElement processShip;
	
	@FindBy(xpath = "//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")
	public WebElement payment;
	
	@FindBy(xpath = "//*[@id=\"cart_navigation\"]/button")
	public WebElement confirm;
	
	private WebDriver driver;
	private WebDriverWait wait; 
	
	public OrderFlowPages(WebDriver driver) {
		this.driver = driver;
        PageFactory.initElements(driver, this);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	}
	
	public void Tshirts() {
		
		wait.until(ExpectedConditions.visibilityOf(Tshirts));
		Tshirts.click();
	}
	
	public void AddToCart() {
		wait.until(ExpectedConditions.elementToBeClickable(AddtoCart));
		AddtoCart.click();
	}
	public void Checkout() {
		wait.until(ExpectedConditions.elementToBeClickable(checkout));
		checkout.click();
	}
	public void ProceedtoCheckout() {
		wait.until(ExpectedConditions.elementToBeClickable(proceedToCheckout));
		proceedToCheckout.click();
	}
	public void ProceedAdd() {
		wait.until(ExpectedConditions.elementToBeClickable(proceedAddress));
		proceedAddress.click();
	}
	public void agree() {
		wait.until(ExpectedConditions.elementToBeClickable(agreeTerms));
		agreeTerms.click();
	}
	
	public void processShipment() {
		wait.until(ExpectedConditions.elementToBeClickable(processShip));
		processShip.click();
	}
	
	public void payment() {
		wait.until(ExpectedConditions.elementToBeClickable(payment));
		payment.click();
	}
	
	public void confirm() {
		wait.until(ExpectedConditions.elementToBeClickable(confirm));
		confirm.click();
	}
	
}
