package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsPractice {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\The Commandant TSP 3\\eclipse-workspace\\SeleniumPractice\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		driver.manage().window().maximize();
		//simple alert
		WebElement simpleAlert = driver.findElement(By.xpath("(//button[text()='Click me!'])[1]"));
		simpleAlert.click();
		//switch to alert window
		Alert alert = driver.switchTo().alert();
		Thread.sleep(3000);
		alert.accept();
		//switch to default window
		driver.switchTo().defaultContent();
		//Confirm alert
		WebElement conalert = driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
		conalert.click();
		Thread.sleep(2000);
		Alert alert2 = driver.switchTo().alert();
		Thread.sleep(3000);
		alert2.dismiss();
		driver.switchTo().defaultContent();
		//Prompt alert
		WebElement promalert = driver.findElement(By.xpath("(//button[@class='btn btn-default btn-lg'])[2]"));
		promalert.click();
		Thread.sleep(3000);
		Alert alert3 = driver.switchTo().alert();
		Thread.sleep(2000);
		String text = alert3.getText();
		System.out.println(text);
		alert3.sendKeys("Welcome");
		alert3.accept();
		driver.switchTo().defaultContent();
		
		
		
	}

}
