package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorsPractice {
	public static WebDriver driver;

		public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\The Commandant TSP 3\\eclipse-workspace\\SeleniumPractice\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.in/");
		//tagname[@attribute='attribute value']
	//	WebElement element = driver.findElement(By.xpath("//input[@data-testid='royal_email']"));
	
	//WebElement element = driver.findElement(By.xpath("//input[@class='\"nav-input\']"));	
		
		//WebElement email = driver.findElement(By.id("email"));
		//email.sendKeys("123@gmail.com");
		//Thread.sleep(2000);
		
		//WebElement password = driver.findElement(By.name("pass"));
		//password.sendKeys("45783649");
		
		//WebElement login = driver.findElement(By.xpath("//input[@value='Log In']"));
		//login.click();
//		//tagname[text()='textname']
//		WebElement element = driver.findElement(By.xpath("//div[text()='Facebook helps you connect and share with the people in your life.']"));
//		//tagname[contains(@attribute,'part_of_atribute value')]
//		WebElement element2 = driver.findElement(By.xpath("//input[contains(@class,' _58mg _5dba _')]"));
//		//tagname[contains(text(),'part_of_textname')]
//		WebElement element3 = driver.findElement(By.xpath("//div[contains(text(),'helps you connect and share')]"));
//	//	(//tagname[@attribute='attribute value'])[1]
//		WebElement element4 = driver.findElement(By.xpath("//div[contains(text(),'helps you connect and share')]"));
//		
		//get attributes
	  WebElement email = driver.findElement(By.xpath("(//td[@class='html7magic'])[1]"));
	  email.sendKeys("143@gmail.com");	
	String attribute = email.getAttribute("value");
	System.out.println(attribute);
	//  get text
	  WebElement create = driver.findElement(By.xpath("//span[text()='Create an account']"));
	  String text = create.getText();
	  System.out.println(text);
	  //isSelected
	  WebElement day = driver.findElement(By.id("day"));
	  boolean selected = day.isSelected();
	System.out.println(selected);
		//isEnabled
	WebElement password = driver.findElement(By.id("pass"));
	boolean enabled = password.isEnabled();
	System.out.println(enabled);
	//isDisplayed
	boolean displayed = password.isDisplayed();
	System.out.println(displayed);
	
			}
	}


