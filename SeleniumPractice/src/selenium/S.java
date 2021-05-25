package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S {
	public static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\The Commandant TSP 3\\eclipse-workspace\\SeleniumPractice\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.in/");
//		WebElement email = driver.findElement(By.id("email"));
//		email.sendKeys("123@email.com");
//		
//		WebElement password = driver.findElement(By.name("pass"));
//		password.sendKeys("123232323");
//		
//		WebElement login = driver.findElement(By.id("u_0_2"));
//		login.click();
		
		//2nd way to get xpath
//		WebElement name = driver.findElement(By.xpath("//div[text()='Facebook helps you connect and share with the people in your life.']"));
//		String text = name.getText();
//		System.out.println(text);
		
		//3rd way to get xpath
		WebElement name1 = driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[2]"));
		name1.sendKeys("password");
		
		
	}

}
