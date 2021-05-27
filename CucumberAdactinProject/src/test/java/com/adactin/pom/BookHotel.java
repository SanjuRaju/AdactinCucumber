package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.adactin.runner.Runner;

public class BookHotel {
	public static WebDriver driver = Runner.driver;
	
	@FindBy(xpath="(//input[@type='text'])[11]")
	private WebElement firstName;
	
	@FindBy(xpath="(//input[@type='text'])[12]")
	private WebElement lastName;
	
	@FindBy(id="address")
	private WebElement addresS;
	
	@FindBy(xpath="(//input[@type='text'])[13]")
	private WebElement creditcardNumber;
	
	public BookHotel(WebDriver bdriver) {
		this.driver = bdriver;
		PageFactory.initElements(bdriver, this);
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAddresS() {
		return addresS;
	}

	public WebElement getCreditcardNumber() {
		return creditcardNumber;
	}

	public WebElement getCreditcardType() {
		return creditcardType;
	}

	public WebElement getExpiryDate() {
		return expiryDate;
	}

	public WebElement getExpiryYear() {
		return expiryYear;
	}

	public WebElement getCvV() {
		return cvV;
	}

	public WebElement getBooK() {
		return booK;
	}

	@FindBy(id="cc_type")
	private WebElement creditcardType;
	
	@FindBy(id="cc_exp_month")
	private WebElement expiryDate;
	
	@FindBy(id="cc_exp_year")
	private WebElement expiryYear;
	
	@FindBy(xpath="(//input[@type='text'])[14]")
	private WebElement cvV;
	
	@FindBy(id="book_now")
	private WebElement booK;

}
