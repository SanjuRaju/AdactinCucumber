package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.org.baseclass.Baseclass;
import com.adactin.pom.Confirmation;
import com.adactin.runner.Runner;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ConfirmStepdefinition extends Baseclass {
	
	public static WebDriver driver = Runner.driver;
	Confirmation cf = new Confirmation(driver);
	
	@When("^User click on logout button$")
	public void user_click_on_logout_button() throws Throwable {
	 clickOnElement(cf.getLogOut());   
	}

	@Then("^User validate the logout button$")
	public void user_validate_the_logout_button() throws Throwable {
	    
	}

}
