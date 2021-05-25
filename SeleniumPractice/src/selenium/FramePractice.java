package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramePractice {
	
	public static void main(String[] args) {
			
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\The Commandant TSP 3\\eclipse-workspace\\SeleniumPractice\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Frames.html");
	
	driver.manage().window().maximize();
	driver.switchTo().frame("singleframe");
	WebElement textbox = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
	textbox.sendKeys("52525");
	
	driver.switchTo().defaultContent();
	WebElement element = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
	element.click();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id=\"singleframe\"]")));
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
	driver.switchTo().frame(driver.findElement(By.xpath("/html/body/section/div/div")));
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	WebElement textbox2 = driver.findElement(By.xpath("/html/body/section/div/div/div/input"));
	textbox2.sendKeys("23232");
	driver.switchTo().defaultContent();
	driver.switchTo().defaultContent();
	
	

}
}