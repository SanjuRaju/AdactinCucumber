package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.org.baseclass.Baseclass;
import com.adactin.pom.BookHotel;
import com.adactin.runner.Runner;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
//import junit.framework.Assert;

public class BookHotelStepDefinition extends Baseclass {
	
	public static WebDriver driver = Runner.driver;
	BookHotel bh = new BookHotel(driver);
	
	@When("^User enter firstname$")
	public void user_enter_firstname() throws Throwable {
	   sendKeys(bh.getFirstName(), "Sanjana"); 
	}

	@When("^User enter lastname$")
	public void user_enter_lastname() throws Throwable {
		sendKeys(bh.getLastName(), "Menon");
	    
	}

	@When("^User enter billing address$")
	public void user_enter_billing_address() throws Throwable {
	  sendKeys(bh.getAddresS(), "No.DF15, XYZ Apartments, Parrys Corner, London");  
	}

	@When("^User enter creditcard number$")
	public void user_enter_creditcard_number() throws Throwable {
	    sendKeys(bh.getCreditcardNumber(), "5695829658937492");
	}

	@When("^User select creditcard type$")
	public void user_select_creditcard_type() throws Throwable {
	   dropDown(bh.getCreditcardType(), "byvalue", "VISA");  
	}

	@When("^User select expiry month$")
	public void user_select_expiry_month() throws Throwable {
	    dropDown(bh.getExpiryDate(), "byvisibletext", "June");
	}

	@When("^User select expiry year$")
	public void user_select_expiry_year() throws Throwable {
	   dropDown(bh.getExpiryYear(), "byvalue", "2022");
	}

	@When("^User enter CVV number$")
	public void user_enter_CVV_number() throws Throwable {
	    sendKeys(bh.getCvV(), "748");
	}

	@When("^User click on booknow button$")
	public void user_click_on_booknow_button() throws Throwable {
	    clickOnElement(bh.getBooK());
	}

	@Then("^User validate firstname$")
	public void user_validate_firstname() throws Throwable {
	    
	}

}
