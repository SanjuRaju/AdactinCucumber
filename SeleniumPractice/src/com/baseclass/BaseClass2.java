package com.baseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseClass2 {
	public static WebDriver driver;
	public static void getBrowserLaunch(String browsername) throws Exception 
	{
		try {
			if (browsername.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/Drivers/chromedriver.exe" );
				driver = new ChromeDriver();
			}
				else if (browsername.equalsIgnoreCase("Firefox")) {
					System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") +"/Drivers/geckodriver.exe");
					driver = new FirefoxDriver();
				}
				else if(browsername.equalsIgnoreCase("ie")) {
					System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"/Drivers/IEDriverServer.exe");
					driver = new InternetExplorerDriver();
				}
				else {
					throw new Exception("invalid browser name"+browsername);
				}
					driver.manage().window().maximize();
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception();
		}
	
		}
	public static void getUrl(String url) {
		driver.get(url);
	}
	
	public static void sendK(WebElement element,String value) throws Exception {
		if(element.isDisplayed() && element.isEnabled()) {
			try {
			
				element.clear();
				element.sendKeys("value");
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				throw new Exception();
			}
		}
	}
	public static void clickElement(WebElement element) throws Exception {
		try {
			element.click();
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception();
		}
	}

	
}
				
			
		
	

