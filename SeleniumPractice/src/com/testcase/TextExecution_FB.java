package com.testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.remote.server.handler.ClickElement;
import org.pom.Homepage_FB;
import org.pom.LoginPage_FB;

import com.baseclass.BaseClassPractice;

public class TextExecution_FB extends BaseClassPractice {
	public static WebDriver driver;
	
	public static void main(String[] args) throws Exception {
		driver=browserLaunch("chrome");
		getUrl("https://www.facebook.com/");
		Homepage_FB hb = new Homepage_FB(driver);
		sendKeys(hb.getEmailField(), "value@gmail.com");
		sendKeys(hb.getPasswordField(), "value567");
		toClick(hb.getLoginButton());
		System.out.println("clicked on login button in Homepage");
		
		LoginPage_FB lb = new LoginPage_FB(driver);
		sendKeys(lb.getEmailbox(), "value@gmail.com");
		sendKeys(lb.getPasswordbox(), "value567");
		toClick(lb.getLogin());
		
		
		
	}
	

}
