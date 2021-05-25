package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GetWindowPractice {
	public static WebDriver driver;
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\The Commandant TSP 3\\eclipse-workspace\\SeleniumPractice\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		WebElement image = driver.findElement(By.xpath("(//a[@class='gb_e'])[2]"));
		Actions ac = new Actions(driver);
		ac.contextClick(image).build().perform();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		String fid = driver.getWindowHandle();
		System.out.println("first window id "+fid);
		Thread.sleep(3000);
		Set<String> pid = driver.getWindowHandles();
		System.out.println("All window id"+pid);
		
		for (String x : pid) {
			if (!x.equals(fid)) {
				System.out.println(x);
				driver.switchTo().window(x);
				Thread.sleep(2000);
				  driver.findElement(By.name("q")).sendKeys("Mobiles",Keys.ENTER);
				
			}
		}
		
		
		
		
		
		
	
	}

}
