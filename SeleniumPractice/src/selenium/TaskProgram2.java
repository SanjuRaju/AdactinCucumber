package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TaskProgram2 {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\The Commandant TSP 3\\eclipse-workspace\\SeleniumPractice\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		WebElement sign = driver.findElement(By.xpath("//a[@class='login']"));
		sign.click();
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("saj143@gmail.com");
		WebElement password = driver.findElement(By.id("passwd"));
		password.sendKeys("chakkara");
		WebElement submit = driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span"));
		submit.click();
		
		WebElement women = driver.findElement(By.xpath("//a[@class='sf-with-ul']"));
		women.click();
		WebElement image = driver.findElement(By.xpath("(//img[@class='replace-2x'])[1]"));
		image.click();
		WebElement img = driver.findElement(By.xpath("(//img[@class='replace-2x'])[1]"));
		img.click();
		
		Thread.sleep(2000);
		WebElement title = driver.findElement(By.xpath("//img[@title='Faded Short Sleeve T-shirts']"));
		Actions ac = new Actions (driver);
		ac.moveToElement(title).build().perform();
		Thread.sleep(3000);
		WebElement compare = driver.findElement(By.xpath("//button[@class='btn btn-default button button-medium bt_compare bt_compare']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].scrollIntoView();", compare);
		 Thread.sleep(2000);
		WebElement add = driver.findElement(By.xpath("//a[@title='Add to cart']"));
		add.click();
		Thread.sleep(2000);
		WebElement proceed = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		proceed.click();
		Thread.sleep(2000);
		WebElement check = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		check.click();
		WebElement address = driver.findElement(By.name("processAddress"));
		address.click();
		WebElement shipping = driver.findElement(By.id("cgv"));
		shipping.click();
		Thread.sleep(2000);
		WebElement proceed1 = driver.findElement(By.name("processCarrier"));
		proceed1.click();
		WebElement payment = driver.findElement(By.xpath("//a[@class='bankwire']"));
		payment.click();
		Thread.sleep(2000);

		WebElement confirm = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		confirm.click();
		Thread.sleep(2000);
		WebElement Cart = driver.findElement(By.xpath("//b[text()='Cart']"));
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView();", Cart);
		Thread.sleep(3000);
		File des = new File("C:\\Users\\The Commandant TSP 3\\eclipse-workspace\\SeleniumPractice\\Screenshots\\test.png");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(temp, des);
	}
		
	}
	


