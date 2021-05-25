package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollupDown {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\The Commandant TSP 3\\eclipse-workspace\\SeleniumPractice\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebElement Signup = driver.findElement(By.xpath("//button[@type='submit'][1]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Signup);
		Thread.sleep(3000);
	//using pixels
		js.executeScript("window.scrollTo(0,300)");
		Thread.sleep(3000);
	js.executeScript("window.scrollTo(0,-300)");
	Thread.sleep(3000);
	//
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy( 0,-document.body.scrollHeight)");
		
	}
	
	

}
