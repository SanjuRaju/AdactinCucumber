package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropPractice {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\The Commandant TSP 3\\eclipse-workspace\\SeleniumPractice\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
	WebElement srcBank = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
	Thread.sleep(2000);
	WebElement des = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
	Actions ac = new Actions(driver);
	ac.dragAndDrop(srcBank, des).build().perform();
	Thread.sleep(2000);
		
	WebElement src1 = driver.findElement(By.id("fourth"));
	Thread.sleep(2000);
	WebElement des1 = driver.findElement(By.id("amt7"));
	//Actions ac1 = new Actions (driver);
	ac.dragAndDrop(src1, des1).build().perform();
	Thread.sleep(2000);
	
	WebElement src2 = driver.findElement(By.id("credit1"));
	WebElement des2 = driver.findElement(By.id("loan"));
	//Actions ac2 = new Actions(driver);
	ac.dragAndDrop(src2, des2).build().perform();
	Thread.sleep(2000);
	
	WebElement src3 = driver.findElement(By.id("fourth"));
	Thread.sleep(2000);
	WebElement des3 = driver.findElement(By.id("amt8"));
		//Actions ac3 = new Actions (driver);
		ac.dragAndDrop(src3, des3);
		//Thread.sleep(2000);
	
	
	
		
	
}
}
