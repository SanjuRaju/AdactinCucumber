package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Confirmation {
	public static WebDriver driver;
	
	public Confirmation(WebDriver cdriver) {
		this.driver = cdriver;
		PageFactory.initElements(cdriver, this);
	}

	public WebElement getLogOut() {
		return logOut;
	}

	@FindBy(id = "logout")
	private WebElement logOut;

}
