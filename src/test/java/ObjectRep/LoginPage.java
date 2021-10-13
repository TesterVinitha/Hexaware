package ObjectRep;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.Base_Class;

public class LoginPage extends Base_Class {

	public LoginPage() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@id='username']")
	private WebElement txtUser;

	@FindBy(xpath = "//input[@id='password']")
	private WebElement txtPass;

	@FindBy(id = "login")
	private WebElement btnLogin;

	public WebElement getTxtUser() {
		return txtUser;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

}
