package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablePractice {
	public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\The Commandant TSP 3\\eclipse-workspace\\SeleniumPractice\\Drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("http://www.toolsqa.com/automation-practice-table/");
		 System.out.println("-------------------All Data-------------------------");
		 List<WebElement> allData = driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tbody"));
		 for(WebElement data:allData) {
			 String text = data.getText();
			 System.out.println(text);
			 
		 System.out.println("----------------particular data---------------");
		 WebElement value = driver.findElement(By.xpath("//table[@class='tsc_table_s13']/tbody/tr[3]/td[2]"));
			 String text2 = value.getText();
			 System.out.println(text2);
			 
			 System.out.println("--------------particular raw data------------");
			 List<WebElement> row = driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tbody/tr[2]"));
			 for(WebElement x:row ) {
				 String text3 = x.getText();
				 System.out.println(text3);
				 
				 System.out.println("-------------columns data------------");
				 List<WebElement> colData = driver.findElements(By.xpath("//table[@ class='tsc_table_s13']/tbody/tr/td[3]"));
				 for(WebElement y :colData) {
					 String text4 = y.getText();
					 System.out.println(text4);
				 }
				 
			 }
			 
		 }
		 
		 
	}
}
		 