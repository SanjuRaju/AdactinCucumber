package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel {
	public WebDriver driver;
	public SelectHotel(WebDriver localdriver) {
		this.driver= localdriver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="hotel_name_0")
	private WebElement hotelname;
	
	public WebElement getHotelname() {
		return hotelname;
	}
	@FindBy(id="location_0")
	private WebElement location;
	
	public WebElement getLocation() {
		return location;
	}

	
	}

	
	
	


