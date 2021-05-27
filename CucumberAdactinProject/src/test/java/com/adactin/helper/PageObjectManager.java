package com.adactin.helper;

import org.openqa.selenium.WebDriver;

import com.adactin.pom.BookHotel;
import com.adactin.pom.Confirmation;
import com.adactin.pom.LoginPage;
import com.adactin.pom.SearchHotel;
import com.adactin.pom.SelectHotel;

public class PageObjectManager {
	
	public static WebDriver driver;
	
	private LoginPage lp;
	
	public PageObjectManager(WebDriver driver2) {
		driver = driver2;
		
	}
	public LoginPage getLp() {
		return lp;
	}
	public SearchHotel getSh() {
		return sh;
	}
	public SelectHotel getSt() {
		return st;
	}
	public BookHotel getBh() {
		return bh;
	}
	public Confirmation getCf() {
		return cf;
	}
	private SearchHotel sh;
	private SelectHotel st;
	private BookHotel bh;
	private Confirmation cf;
	
	

}
