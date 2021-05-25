package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage_FB {
	public WebDriver driver;
	public Homepage_FB(WebDriver localdriver) {
		this.driver = localdriver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="email")
	private WebElement emailField;
	
		@FindBy(id= "pass")
		private WebElement passwordField;
		
		@FindBy(xpath="//input[@value='Log In']")
		private WebElement loginButton;
		
		

		public WebElement getEmailField() {
			return emailField;
		}

		public WebElement getPasswordField() {
			return passwordField;
		}

		public WebElement getLoginButton() {
			return loginButton;
		}
		
	}
	


