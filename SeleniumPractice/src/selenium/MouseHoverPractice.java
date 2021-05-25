package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverPractice {
	public static WebDriver driver1;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\The Commandant TSP 3\\eclipse-workspace\\SeleniumPractice\\Drivers\\chromedriver.exe");
		driver1 = new ChromeDriver();
		driver1.get("https://www.amazon.in") ;
		WebElement signin = driver1.findElement(By.xpath("//span[text()='Hello. Sign in']"));
		Actions ac = new Actions(driver1);
		ac.moveToElement(signin).build().perform();
		Thread.sleep(3000);
		
				
	}

}
