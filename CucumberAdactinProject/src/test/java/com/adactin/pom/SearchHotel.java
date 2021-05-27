package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel {
	public static  WebDriver driver;
	
	@FindBy(id = "location")
	private WebElement locatioN;
	@FindBy(id = "hotels")
	private WebElement hotelS;
	
	@FindBy(id = "room_type")
	private WebElement roomType;
	
	@FindBy(id = "room_nos")
	private WebElement roomS;
	
	public SearchHotel(WebDriver hdriver) {
		this.driver = hdriver;
		PageFactory.initElements(hdriver, this);
		
	}

	public WebElement getLocatioN() {
		return locatioN;
	}

	public WebElement getHotelS() {
		return hotelS;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getRoomS() {
		return roomS;
	}

	public WebElement getCheckIn() {
		return checkIn;
	}

	public WebElement getCheckOut() {
		return checkOut;
	}

	public WebElement getAdultRoom() {
		return adultRoom;
	}

	public WebElement getChildrenRoom() {
		return childrenRoom;
	}

	public WebElement getSubmiT() {
		return submiT;
	}

	@FindBy(id = "datepick_in")
	private WebElement checkIn;
	
	@FindBy(id = "datepick_out")
	private WebElement checkOut;
	
	@FindBy(id = "adult_room")
	private WebElement adultRoom;
	
	@FindBy(id = "child_room")
	private WebElement childrenRoom;
	
	@FindBy(id = "Submit")
	private WebElement submiT;

}
