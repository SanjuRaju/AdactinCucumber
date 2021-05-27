package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.org.baseclass.Baseclass;
import com.adactin.pom.SelectHotel;
import com.adactin.runner.Runner;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SelectHotelStepdefinition extends Baseclass {
	
	private static  WebDriver driver = Runner.driver;
	SelectHotel st = new SelectHotel(driver);

@When("^User click on select button$")
public void user_click_on_select_button() throws Throwable {
 clickOnElement(st.getSelecT());   
}

@When("^User click on continue button$")
public void user_click_on_continue_button() throws Throwable {
    clickOnElement(st.getContinuE());
}

@Then("^User validate comtinue button$")
public void user_validate_comtinue_button() throws Throwable {
    
}

}
