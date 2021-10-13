package ObjectRep;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.Base_Class;

public class OrderConfirmPage extends Base_Class {

	public OrderConfirmPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "order_no")
	private WebElement Order;

	public WebElement getOrder() {
		return Order;
	}

}
