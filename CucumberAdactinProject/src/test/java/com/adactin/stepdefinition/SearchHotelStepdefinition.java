package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.org.baseclass.Baseclass;
import com.adactin.pom.SearchHotel;
import com.adactin.runner.Runner;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchHotelStepdefinition extends Baseclass {
	public static WebDriver driver = Runner.driver;
	SearchHotel sh = new SearchHotel(driver);
			
	@When("^User select location$")
	public void user_select_location() throws Throwable {
		dropDown(sh.getLocatioN(), "byvalue", "London");
	    
	}

	@When("^User select hotel$")
	public void user_select_hotel() throws Throwable {
	   dropDown(sh.getHotelS(), "byvisibletext", "Hotel Sunshine"); 
	}

	@When("^User select room type$")
	public void user_select_room_type() throws Throwable {
	    dropDown(sh.getRoomType(), "byvalue", "Super Deluxe");
	}

	@When("^User select number of rooms$")
	public void user_select_number_of_rooms() throws Throwable {
	  dropDown(sh.getRoomS(), "byindex", "2");  
	}

	@When("^User enter checkin date$")
	public void user_enter_checkin_date() throws Throwable {
	    sendKeys(sh.getCheckIn(), "25/05/2021");
	}

	@When("^User enter checkout date$")
	public void user_enter_checkout_date() throws Throwable {
	    sendKeys(sh.getCheckOut(), "28/052021");
	}

	@When("^User select adults room$")
	public void user_select_adults_room() throws Throwable {
	  dropDown(sh.getAdultRoom(), "byindex", "1");  
	}

	@When("^User select children room$")
	public void user_select_children_room() throws Throwable {
	  dropDown(sh.getChildrenRoom(), "byindex", "1");  
	}

	@When("^User click on search button$")
	public void user_click_on_search_button() throws Throwable {
		clickOnElement(sh.getSubmiT());
	    
	}

	@Then("^User validate search button$")
	public void user_validate_search_button() throws Throwable {
	    
	}


}
