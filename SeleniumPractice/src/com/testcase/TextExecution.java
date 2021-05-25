package com.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.ClickElement;
import org.pom.HomeAmazon;

import com.baseclass.BaseClass2;

public class TextExecution extends BaseClass2  {
	public static WebDriver driver;
	
public static void main(String[] args) throws Exception {
	getBrowserLaunch("chrome");
	getUrl("https://www.amazon.in/");
	System.out.println("amazon launched");
	
	HomeAmazon ha = new HomeAmazon(driver);
	clickElement(ha.getSignin());
	System.out.println("clicked on login");
	
	
	
	
	
	
	
	
}

}
