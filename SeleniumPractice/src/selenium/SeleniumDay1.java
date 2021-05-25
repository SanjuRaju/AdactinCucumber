package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SeleniumDay1 {
	public static  void chromeDriverLaunch() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\The Commandant TSP 3\\eclipse-workspace\\SeleniumPractice\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	}
	public static void firefoxBrowserLaunch() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\The Commandant TSP 3\\eclipse-workspace\\SeleniumPractice\\Drivers\\geckodriver.exe");
		WebDriver driver = new  FirefoxDriver();
		driver.get("https://www.facebook.com/");
	}
	
	public static void IEBrowserLaunch() {
	System.setProperty("webdriver.ie.driver","C:\\Users\\The Commandant TSP 3\\eclipse-workspace\\SeleniumPractice\\Drivers\\IEDriverServer.exe" );
	WebDriver driver = new InternetExplorerDriver();
	driver.get("https://www.facebook.com/");
	}
	public static void main(String[] args) {
		chromeDriverLaunch();
		//firefoxBrowserLaunch();
		 //IEBrowserLaunch() ;
	}
}
