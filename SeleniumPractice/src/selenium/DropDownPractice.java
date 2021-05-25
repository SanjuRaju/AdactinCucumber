package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownPractice {
	public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\The Commandant TSP 3\\eclipse-workspace\\SeleniumPractice\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.in/");
		driver.manage().window().maximize();
		//select by visible text
		WebElement date = driver.findElement(By.id("day"));
		Select sd = new Select(date);
		sd.selectByVisibleText("6");
		//select by value
		WebElement months = driver.findElement(By.id("month"));
		Select sm = new Select(months);
		sm.selectByValue("9");
		//select by index
		WebElement years = driver.findElement(By.id("year"));
		Select  sy = new Select(years);
		sy.selectByIndex(26);
		
		//Get first selected option is used to retrieve the selected option from the dropdown.
		//select by visible text
		Select syear= new Select(years);
		WebElement firstSelectedOption = syear.getFirstSelectedOption();
		String text = firstSelectedOption.getText();
		System.out.println("before selecting year option is"+text);
		//syear.selectByVisibleText("2016");
		WebElement firstSelectedOption2 = syear.getFirstSelectedOption();
		String text2 = firstSelectedOption.getText();
		System.out.println("after selecting year option is "+text2);
		
		//Get options is a method to print all the options in the dropdown.
		//Select smonth= new Select(month); 
		List<WebElement> options = sm.getOptions();
		System.out.println(options);
		for(WebElement x:options) {
			System.out.println(x.getText());
		}
		
	}

}
