package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.helper.PageObjectManager;
import com.adactin.org.baseclass.Baseclass;
import com.adactin.pom.LoginPage;
import com.adactin.runner.Runner;

import cucumber.api.java.en.*;

public class LoginStepdefinition extends Baseclass {
	public static WebDriver driver = Runner.driver;
	
	//LoginPage lp = new LoginPage(driver);
	PageObjectManager pm = new PageObjectManager(driver) ;
	

@Given("^User enter url of adactin application$")
public void user_enter_url_of_adactin_application() throws Throwable {
	getUrl("https://adactinhotelapp.com/");
    
}

@When("^User enter valid username$")
public void user_enter_valid_username() throws Throwable {
	sendKeys(pm.getLp().getUserName(), "Sajnasukumaran");
    
}

@When("^User enter valid password$")
public void user_enter_valid_password() throws Throwable {
	sendKeys(pm.getLp().getPassWord(), "4Roses");
}  

@When("^User click login button$")
public void user_click_login_button() throws Throwable {
	clickOnElement(pm.getLp().getLogiN());
    
}

@Then("^User validate click button$")
public void user_validate_click_button() throws Throwable {
	
    
}


}
