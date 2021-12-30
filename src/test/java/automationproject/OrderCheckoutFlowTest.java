package automationproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.OrderFlowPages;

public class OrderCheckoutFlowTest{
	private WebDriver driver;
	private OrderFlowPages ord;
	private LoginPage login;
	
	
	public OrderCheckoutFlowTest() {
		this.driver = new ChromeDriver();
		this.login = new LoginPage(driver);
		this.ord = new OrderFlowPages(driver);
	}
	
	@Test
	public void Process() {
		login.loadAndWaitForElements();
		login.doLogin("e3f2bc17-06dd-4039-b78c-b815a686f55f@gmail.com", "BalayyaRocks!");
		ord.Tshirts();
		ord.AddToCart();
		ord.Checkout();
		ord.ProceedtoCheckout();
		ord.ProceedAdd();
		ord.agree();
		ord.processShipment();
		ord.payment();
		ord.confirm();
	}
	
	
}
