package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public static WebDriver driver;
	
	@FindBy(id = "username")
	private WebElement userName;

	@FindBy(id = "password")
	private WebElement passWord;

	@FindBy(id = "login")
	private WebElement logiN;

	public LoginPage(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(ldriver, this);
	}

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassWord() {
		return passWord;
	}

	public WebElement getLogiN() {
		return logiN;
	}

}