package com.baseclass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClassPractice {
	
		public static WebDriver driver;
		public static WebDriver browserLaunch (String browsername) throws Exception {
			try {
			if(browsername.equalsIgnoreCase("chrome")) {
			
				System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
			
			driver= new ChromeDriver();
			}
			else if(browsername.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver",
						System.getProperty("user.dir")+"\\Drivers\\IEDriverServer.exe");
				driver= new InternetExplorerDriver();
			}
				else if(browsername.equalsIgnoreCase("Firefox")) {
					System.setProperty("webdriver.gecko.driver",
							System.getProperty("user.dir")+"\\Drivers\\geckodriver.exe");
					driver = new FirefoxDriver();
				}
				else {System.out.println("Browser name is invalid");
				}
			}catch(Exception e) {
			throw new Exception();
			}
		return driver;	
		}
		//get url
			public static void getUrl(String url) {
				driver.get(url);
			}
			//senkeys
			public static void sendKeys(WebElement element, String value) throws Exception {
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
			//to click
			public static void toClick(WebElement element) throws Exception {
				try {
					element.click();
					driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					throw new Exception();
				}
			}
			//gettext
			public static void getText(WebElement element) throws Exception {
				try {
					System.out.println(element.getText());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					throw new Exception();
				}
			}
		//dropdown
			public static void dropDown(WebElement element) {
				try {
					Select sd = new Select(element);
					sd.selectByIndex(0);
					sd.selectByValue("value");
					sd.selectByVisibleText("value");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		//screenshot
			public static <TakeScreenshot> void screenShot (WebElement element) throws IOException {
				File des = new File("C:\\Users\\The Commandant TSP 3\\eclipse-workspace\\SeleniumPractice\\Screenshotsorder-confirmationorder-confirmation\\test.png");
				TakesScreenshot ts = (TakesScreenshot) driver;
				File temp = ts.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(temp, des);
				
			}
			
			//mouse over
			public static void mouseOver(WebElement element) throws Exception {
				try {
					Actions ac = new Actions(driver);
					ac.moveToElement(element).build().perform();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					throw new Exception();
				}
			}
			
			//DragandDrop
			public static void dragndDrop(WebElement a,WebElement b) throws Exception {
				try {
					Actions ac = new Actions (driver);
					ac.dragAndDrop(a,b).build().perform();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					throw new Exception();
				}
				}
			//Double click
			public static void doubleClick(WebElement d) throws Exception {
				try {
					Actions ac = new Actions(driver);
					ac.doubleClick(d).build().perform();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					throw new Exception();
				}
				}
			//Right click
			public static void rightClick(WebElement right) throws Exception {
				try {
					Actions ac = new Actions(driver);
					ac.contextClick(right).build().perform();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					throw new Exception();
				}
			}
//			//keyboard actions
//			public static void keyBoardActions(WebElement e)
//			Robot r = new Robot
//			
//			{
			
			
			
}			



				
				
				
				
			
				

			
			
			


	


