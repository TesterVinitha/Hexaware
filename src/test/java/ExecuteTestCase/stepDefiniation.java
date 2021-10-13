package ExecuteTestCase;

import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.Runner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BaseClass.Base_Class;
import ObjectRep.BookHotel;
import ObjectRep.LoginPage;
import ObjectRep.OrderConfirmPage;
import ObjectRep.SearchHotelPage;
import ObjectRep.SelectHotelPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDefiniation extends Base_Class {

	@Given("User is on Login Page")
	public void user_is_on_Login_Page() {
		launch("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);

	}

	@When("User should enters {string} and {string}and Click Login button")
	public void user_should_enters_and_and_Click_Login_button(String fName, String lName) {

		LoginPage p = new LoginPage();

		insert(p.getTxtUser(), fName);

		insert(p.getTxtPass(), lName);

		click(p.getBtnLogin());

	}

	@When("User should enters the {string} and {string} and {string} and {string} and {string} and {string} then {string} and {string} and enters Search button")
	public void user_should_enters_the_and_and_and_and_and_then_and_and_enters_Search_button(String Location,
			String Hotel, String rt, String rc, String cid, String cod, String adl, String chl) {

		SearchHotelPage s = new SearchHotelPage();

		select(s.getSelectLoaction(), Location);

		select(s.getSelectHotel(), Hotel);

		select(s.getSelectRoom(), rt);

		select(s.getSelectRoomNum(), rc);

		insert(s.getTxtCheckInDate(), cid);

		insert(s.getTxtCheckOutDate(), cod);

		select(s.getSelectAdult(), adl);

		select(s.getSelectChildren(), chl);

		click(s.getBtnSubmit());

	}

	@When("user should select the Hotel")
	public void user_should_select_the_Hotel() {

		SelectHotelPage x = new SelectHotelPage();

		click(x.getBtnRadio());

		click(x.getBtnContinue());

	}

	@When("User should provides the personal informations {string} and {string} and {string} and {string} and {string} then {string} and {string} and {string}")
	public void user_should_provides_the_personal_informations_and_and_and_and_then_and_and(String fna, String lna,
			String add, String ccn, String cct, String ccm, String ccy, String ccv) throws Throwable {

		BookHotel b = new BookHotel();

		insert(b.getTxtFirstName(), fna);

		insert(b.getTxtLastName(), lna);

		insert(b.getTxtAddress(), add);

		insert(b.getTxtCreditCard(), ccn);

		select(b.getSelectCreditCard(), cct);

		select(b.getSelectExpiredDate(), ccm);

		select(b.getSelectCreditCardYear(), ccy);

		insert(b.getTxtCvv(), ccv);

		click(b.getBtnBookNow());

		Thread.sleep(5000);

	}

	@Then("User should validate the order id")
	public void user_should_validate_the_order_id() {

		OrderConfirmPage confirmPage = new OrderConfirmPage();

		System.out.println("Your Order id is :  " + confirmPage.getOrder().getAttribute("value"));
		driver.quit();
	}

}
