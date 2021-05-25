package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;

public class LoginAmazon {
	public  WebDriver driver;
	public LoginAmazon(WebDriver ldriver) {
		this.driver= ldriver;
		PageFactory.initElements(driver, this);
		
	}
	

}
