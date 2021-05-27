package com.adactin.org.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Baseclass {
	public static  WebDriver driver;
	
	public static WebDriver getBrowser(String browsername) {
		try {
			if(browsername.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + ("\\Driver\\chromedriver.exe"));
				driver = new ChromeDriver();
				
			}else if(browsername.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + ("\\Driver\\geckodriver.exe"));
				driver = new FirefoxDriver();
				
			}else if(browsername.equalsIgnoreCase("edge")) {
				System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + ("\\Driver\\msedgedriver.exe"));
				driver = new EdgeDriver();
			}	else {
				System.out.println("invalid browser");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.manage().window().maximize();
		return driver;

	}
	
//getUrl	
	public static void getUrl(String url) {
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
//sendKeys	
	public static void sendKeys( WebElement element,String value) {
		element.sendKeys(value);
	}
	 
//click	& clear
		public static void clickOnElement(WebElement element) {
			element.click();
		}
		public static void clearOnElement(WebElement element) {
			element.clear();
		}
		
//isEnabled	
		public boolean isEnabled(WebElement element) {
			try {
				boolean enabled = element.isEnabled();
				} catch (Exception e) {
				e.printStackTrace();
			}
			return false;
		}
		
//isSelected	
		public boolean isSelected(WebElement element) {
			try {
				boolean selected = element.isSelected();
				} catch (Exception e) {
				e.printStackTrace();
			}
			return false;
		}
		
//isDisplayed	
		public boolean isDisplayed(WebElement element) {
			try {
				boolean displayed = element.isDisplayed();
				} catch (Exception e) {
				e.printStackTrace();
			}
			return false;
		}
//dropDown
		public static  void dropDown( WebElement element, String option, String value  ) {
			try {
				Select se = new Select(element);
				if(option.equalsIgnoreCase("byIndex")) {
					int parseInt = Integer.parseInt(value);
				se.selectByIndex(parseInt);
				}else if(option.equalsIgnoreCase("byvalue")) {
				se.selectByValue(value);
				}else if(option.equalsIgnoreCase("byvisibletext")) {
				se.selectByVisibleText(value);
				}else {
					System.out.println("invalid selection");
				}
					
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
//mouseHover
		public static void mouseHover(WebElement element) {
			try {
				Actions ac= new Actions(driver);
				ac.moveToElement(element).build().perform();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

//screenShot	
		public static void screenShot() {
			try {
				TakesScreenshot ts =  (TakesScreenshot) driver;
				File source = ts.getScreenshotAs(OutputType.FILE);
				File destinstion = new File("C:\\Users\\The Commandant TSP 3\\eclipse-workspace\\NewSelenium_Practice\\Screenshot1\\test.png");
				FileUtils.copyFile(source, destinstion);
			} catch (WebDriverException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
//dragnDrop		
		public static void dragAndDrop(WebElement a,WebElement b) {
			try {
				Actions ac = new Actions(driver);
				ac.dragAndDrop(a, b).build().perform();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

//scrollUpndown		
		public static void scrollUp_scrollDown(WebElement element) {
			try {
				JavascriptExecutor js =  (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView();", element);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
//alerts		
		public static void alerT( String alert,String value) {
			
			if(alert.equalsIgnoreCase("SimpleAlert")){
				driver.switchTo().alert().accept();
			}else if (alert.equalsIgnoreCase("ConfirmAlert")) {
				driver.switchTo().alert().dismiss();
			}else if(alert.equalsIgnoreCase("PromptAlert")) {
				driver.switchTo().alert().sendKeys(value);
				driver.switchTo().alert().accept();
			}else {
				System.out.println("invalid alert");
			
			}
		}
		
//rightClick
			public static void rightClick(WebElement element) {
				Actions ac = new Actions(driver);
				ac.contextClick(element);
				
			}
			
//doubleClick
			public static void doubleClick(WebElement element) {
				Actions ac = new Actions(driver);
				ac.doubleClick(element);
			}
			
//robotClass		
			public static void robotClass() {
				try {
					Robot rt = new Robot();
					rt.keyPress(KeyEvent.VK_DOWN);
					rt.keyPress(KeyEvent.VK_ENTER);
				} catch (AWTException e) {
					e.printStackTrace();
				}

			}
			
//frames
			public static void framesConcept(String option,WebElement element,String value) {
				if(option.equalsIgnoreCase("byindex")) {
					int parseInt = Integer.parseInt(value);
					driver.switchTo().frame(parseInt);
				}else if(option.equalsIgnoreCase("byString")) {
					driver.switchTo().frame(value);
				}else if(option.equalsIgnoreCase("Webelement")) {
					driver.switchTo().frame(element);
				}else {
					System.out.println("invalid frame");
				

			}

			}
			
			
		}

			
		
			
			

		
		
			

		
			
			

		
			

		
			

		
			


		
		
		
		

	
		
	


