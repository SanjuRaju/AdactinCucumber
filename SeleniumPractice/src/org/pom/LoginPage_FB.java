package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_FB {
	public WebDriver driver;
	public LoginPage_FB(WebDriver ldriver) {
		this.driver =ldriver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="email")
	private WebElement emailbox;
	
	@FindBy(id="pass")
	private WebElement passwordbox;
	
	@FindBy(id="loginbutton")
	private WebElement login;
	
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getEmailbox() {
		return emailbox;
	}
	public WebElement getPasswordbox() {
		return passwordbox;
	}
	public WebElement getLogin() {
		return login;
	}
	
	}
	


