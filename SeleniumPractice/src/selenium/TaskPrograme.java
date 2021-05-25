package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class TaskPrograme {
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\The Commandant TSP 3\\eclipse-workspace\\SeleniumPractice\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		 WebElement sign = driver.findElement(By.xpath("//a[@class='login']"));
		sign.click();
		WebElement email = driver.findElement(By.id("email_create"));
		email.sendKeys("jnv@gmail.com");
		WebElement create = driver.findElement(By.name("SubmitCreate"));
		create.click();
		driver.manage().window().maximize();
		Thread.sleep(4000);
		WebElement gender = driver.findElement(By.id("id_gender2"));
		gender.click();
		
		WebElement fstname = driver.findElement(By.name("customer_firstname"));
		fstname.sendKeys("Neha");
		 WebElement lstname = driver.findElement(By.name("customer_lastname"));
		 lstname.sendKeys("Rajesh");
		 
		// WebElement email2 = driver.findElement(By.id("email"));
		// email2.sendKeys("jnv@gmail.com");
		 WebElement password = driver.findElement(By.id("passwd"));
		 password.sendKeys("Password");
		 
		WebElement day = driver.findElement(By.id("days"));
		Select sd = new Select(day);
		sd.selectByValue("3");
		 WebElement month = driver.findElement(By.id("months"));
		Select sv =new Select(month);
		sv.selectByVisibleText("September ");
		WebElement year = driver.findElement(By.id("years"));
		Select si =new Select(year);
		si.selectByIndex(12);
		
		WebElement check = driver.findElement(By.id("newsletter"));
		check.click();
		WebElement checkoffer = driver.findElement(By.id("optin"));
		checkoffer.click();
		//Address
		WebElement first = driver.findElement(By.id("firstname"));
		first.sendKeys("Neha");
		WebElement last = driver.findElement(By.id("lastname"));
		last.sendKeys("Rajesh");
		WebElement comp = driver.findElement(By.id("company"));
		comp.sendKeys("ABC");
		WebElement add1 = driver.findElement(By.name("address1"));
		add1.sendKeys("Chennai");
		WebElement add2 = driver.findElement(By.name("address2"));
		add2.sendKeys("kochi");
		
		WebElement city = driver.findElement(By.id("city"));
		city.sendKeys("London");
		WebElement state = driver.findElement(By.id("id_state"));
		Select st = new Select(state);
		st.selectByVisibleText("Florida");
		WebElement post = driver.findElement(By.id("postcode"));
		post.sendKeys("23456");
		WebElement country = driver.findElement(By.id("id_country"));
		Select sc = new Select(country);
		sc.selectByVisibleText("United States");
		
		WebElement addinfo = driver.findElement(By.id("other"));
		addinfo.sendKeys("Information");
		WebElement home = driver.findElement(By.id("phone"));
		home.sendKeys("1234455666");
		WebElement mobile = driver.findElement(By.id("phone_mobile"));
		mobile.sendKeys("1234567890");
		
		WebElement assign = driver.findElement(By.id("alias"));
		assign.sendKeys("alias");
		WebElement submit = driver.findElement(By.id("submitAccount"));
		submit.click();
	
	}
	
	}


