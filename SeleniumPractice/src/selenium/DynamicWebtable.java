package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebtable {
	public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\The Commandant TSP 3\\eclipse-workspace\\SeleniumPractice\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http:/.toolsqa.com/automation-practice-table/");
		driver.manage().window().maximize();
		//using tagname
		WebElement table = driver.findElement(By.xpath("//table[@summary='Sample Table']"));
		List<WebElement> tr = table.findElement(By.tagName("tbody")).findElements(By.tagName("tr"));
		
		for(int i=0;i<tr.size();i++) {
			List<WebElement> td = tr.get(i).findElements(By.tagName("td"));
			
			for(WebElement x : td) {
				System.out.println(x.getText());
			}
		}
		
//		//to get particular row
//		int rowNUm=4;
//		  List<WebElement> tr1 = driver.findElements(By.xpath("//table[@summary='Sample Table']//tbody//tr[" +rowNUm +  "]//td"));
//		  for(int i=0;i<tr1.size();i++) {
//			  String text = tr1.get(i).getText();
//			  System.out.println(text);
//		  }
	} 

}
