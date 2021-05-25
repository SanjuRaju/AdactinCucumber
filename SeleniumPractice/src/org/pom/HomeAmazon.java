package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeAmazon {
	public  WebDriver driver;
	public HomeAmazon( WebDriver localdriver) {
		this.driver = localdriver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="nav-link-accountList")
	private WebElement signin;
		
	public WebElement getSignin() {
		return signin;
	}
		
		}
		
	
	
	
	

	
		
	
	


