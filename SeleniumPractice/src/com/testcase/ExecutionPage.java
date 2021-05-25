package com.testcase;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.time.Period;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.pom.HotelReservationSystem;
import org.pom.SearchHotel;
import org.pom.SelectHotel;

import com.baseclass.ReferenceBase;

public class ExecutionPage extends ReferenceBase {
	public static WebDriver driver;
	static String fstLocation;
	//public static void main(String[] args) throws Exception {
	public static void testCase102() throws Throwable {
		
		driver = getDriver("chrome");
		getUrl("https://adactin.com/HotelApp/");
		
		//Hotel Reservation System page
		HotelReservationSystem hr = new HotelReservationSystem(driver);
		setkey(hr.getUsernamebox(), "sajuchinnu");
		setkey(hr.getPasswordbox(), "assajna");
		clickElement(hr.getLogin());
		
		//Testcase102
		//Search Hotel page	
		SearchHotel sh = new SearchHotel(driver);
		dropdown(sh.getLocationfield(), "index", "1");
		dropdown(sh.getHotelsfield(), "index", "1");
		dropdown(sh.getRoomtypes(), "index", "1");
		dropdown(sh.getRooms(), "index", "1");
		setkey(sh.getCheckin(), "26/09/2019");
		setkey(sh.getCheckout(), "24/09/2019");
		dropdown(sh.getAdultroom(), "index", "2");
		dropdown(sh.getChildroom(), "index", "4");
		//fstLocation = dropdown(sh.getLocationfield(), "index", "1").trim();

		clickElement(sh.getSearch());
		
		//verification
		String chein = getAttribute(sh.getCheckin());
		String cheout = getAttribute(sh.getCheckout());

		SimpleDateFormat sd1=new SimpleDateFormat("dd/mm/yyyy");
		Date d1=sd1.parse(chein);
		Date d2=sd1.parse(cheout);
		 long diffInMillies = Math.abs(d1.getTime() - d1.getTime());
		    long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
		 
		 if(diff < 0)
			 System.out.println("The dates are valid for check in and out..");
		 else
			 System.out.println("Check In is Invalid. It is graeter than Check Out!!!");
	}
		
		public static void testCase104() throws InterruptedException {
//		//SelectHotelpage
//		 Thread.sleep(3000);
//		SelectHotel st = new SelectHotel(driver);
//		String s=getAttribute(st.getHotelname());
//		String f=getAttribute(st.getLocation());
//		
//		//verification
//		if (fstLocation.equals(st.getLocation().getAttribute("value"))) {
//			System.out.println("Pass");
//		} else {
//			System.out.println("fail");
//		}
			
		
		
		
	}
	
	}

	
	


