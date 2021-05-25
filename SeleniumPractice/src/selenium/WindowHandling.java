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

public class WindowHandling {
	public static WebDriver driver;

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\The Commandant TSP 3\\eclipse-workspace\\SeleniumPractice\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		WebElement image = driver.findElement(By.xpath("(//a[@class='gb_e'])[2]"));
		Actions ac = new Actions(driver);
		ac.contextClick(image).build().perform();
		// Keyboard action
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(4000);

		WebElement gmail = driver.findElement(By.xpath("(//a[@class='gb_e'])[1]"));
		Actions ac1 = new Actions(driver);
		ac1.contextClick(gmail).build().perform();
		// keyboard action
		Robot r1 = new Robot();
		r1.keyPress(KeyEvent.VK_DOWN);
		r1.keyRelease(KeyEvent.VK_DOWN);
		r1.keyPress(KeyEvent.VK_DOWN);
		r1.keyRelease(KeyEvent.VK_DOWN);
		r1.keyPress(KeyEvent.VK_ENTER);
		r1.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		Set<String> pid = driver.getWindowHandles();
		System.out.println("All windows id" + pid);

		for (String x : pid) {
			driver.switchTo().window(x);
			String title = driver.getTitle();
			System.out.println(title);
			if (title.equals("Google Images")) {
				driver.findElement(By.name("q")).sendKeys("Laptops", Keys.ENTER);
				Thread.sleep(4000);
			} else if (title.equals("Google")) {
				driver.findElement(By.name("q")).sendKeys("Mobiles", Keys.ENTER);
			} else if (title.equals("Gmail - Free Storage and Email from Google")) {
				WebElement signin = driver.findElement(By.xpath("(//a[@class='h-c-header__nav-li-link '])[4]"));
				signin.click();
				Thread.sleep(2000);
				Set<String> win = driver.getWindowHandles();
				System.out.println("All windows id" + win);
				for (String y : win) {
					driver.switchTo().window(y);
					String title1 = driver.getTitle();
					System.out.println(title1);
					if (title1.equals("Gmail")) {
						WebElement email = driver.findElement(By.id("identifierId"));
						email.sendKeys("as.sajna@gmail.com");
					}
				}

				// WebElement id = driver.findElement(By.id("identifierId"));
				// id.sendKeys("sajchin@gmail.com");

			}
		}
	}
}
