package ObjectRep;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.Base_Class;

public class BookHotel extends Base_Class {

	public BookHotel() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "first_name")
	private WebElement txtFirstName;

	@FindBy(name = "last_name")
	private WebElement txtLastName;

	@FindBy(id = "address")
	private WebElement txtAddress;

	@FindBy(id = "cc_num")

	private WebElement txtCreditCard;

	@FindBy(id = "cc_type")
	private WebElement selectCreditCard;

	@FindBy(id = "cc_exp_month")
	private WebElement SelectExpiredDate;

	@FindBy(id = "cc_exp_year")
	private WebElement selectCreditCardYear;

	@FindBy(id = "cc_cvv")
	private WebElement txtCvv;

	@FindBy(id = "book_now")
	private WebElement btnBookNow;

	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public WebElement getTxtLastName() {
		return txtLastName;
	}

	public WebElement getTxtAddress() {
		return txtAddress;
	}

	public WebElement getTxtCreditCard() {
		return txtCreditCard;
	}

	public WebElement getSelectCreditCard() {
		return selectCreditCard;
	}

	public WebElement getSelectExpiredDate() {
		return SelectExpiredDate;
	}

	public WebElement getSelectCreditCardYear() {
		return selectCreditCardYear;
	}

	public WebElement getTxtCvv() {
		return txtCvv;
	}

	public WebElement getBtnBookNow() {
		return btnBookNow;
	}

}
