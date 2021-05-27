package com.adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.org.baseclass.Baseclass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src\\test\\java\\com\\adactin\\org\\feature\\Adactin.feature", 
					glue = "com.adactin.stepdefinition",
					monochrome = true,
					dryRun  =  false,
					strict = true

					)

public class Runner {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void setUp() {
		driver = Baseclass.getBrowser("chrome");
		
	}
	@AfterClass
	public static void tearDown() {
		
		driver.quit();

	}
		
	}


