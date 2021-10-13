package ObjectRep;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.Base_Class;

public class SearchHotelPage extends Base_Class {

	public SearchHotelPage() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "location")
	private WebElement selectLoaction;

	@FindBy(id = "hotels")
	private WebElement selectHotel;

	@FindBy(id = "room_type")
	private WebElement selectRoom;

	@FindBy(id = "room_nos")
	private WebElement selectRoomNum;

	@FindBy(id = "datepick_in")
	private WebElement txtCheckInDate;

	@FindBy(id = "datepick_out")
	private WebElement txtCheckOutDate;

	@FindBy(id = "adult_room")
	private WebElement selectAdult;

	@FindBy(name = "child_room")
	private WebElement selectChildren;

	@FindBy(name= "Submit")
	private WebElement btnSubmit;

	public WebElement getSelectLoaction() {
		return selectLoaction;
	}

	public WebElement getSelectHotel() {
		return selectHotel;
	}

	public WebElement getSelectRoom() {
		return selectRoom;
	}

	public WebElement getSelectRoomNum() {
		return selectRoomNum;
	}

	public WebElement getTxtCheckInDate() {
		return txtCheckInDate;
	}

	public WebElement getTxtCheckOutDate() {
		return txtCheckOutDate;
	}

	public WebElement getSelectAdult() {
		return selectAdult;
	}

	public WebElement getSelectChildren() {
		return selectChildren;
	}

	public WebElement getBtnSubmit() {
		return btnSubmit;
	}

}
