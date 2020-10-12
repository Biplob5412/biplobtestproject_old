package com.biplob.testcases;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.biplob.util.Browser;
import com.biplob.util.ExcelReader;
import com.biplob.util.PropertyLoader;

public class TestBase {

	/*WebDriver driver;

	@Before
	public void initialization() throws FileNotFoundException, IOException {
		// System.setProperty("webdriver.chrome.driver",
		// System.getProperty("user.dir")+"/drivers/chromedriver.exe");
		PropertyLoader.loadProperties();

		driver = new ChromeDriver();

	}*/
	
	
	
	
	/*
	WebDriver driver;
	//@Before
	public void initialization()  {

		PropertyLoader.loadProperties();
		
		driver = new ChromeDriver();
		
	}	
	*/
	
	
	
	
	public static ExcelReader excelReader= new ExcelReader(System.getProperty("user.dir")+ "/files/excel/Book1.xlsx");
	

	public WebDriver driver;
	
	
	@BeforeClass
	public void initialization() throws FileNotFoundException, IOException {
		
		PropertyLoader.loadProperties();
		
		Browser browser= new Browser();
		
		driver= browser.getBrowser();
		
		
	}
	
	@AfterClass
	public void tearDown() {
		
   // driver.close();
   // driver.quit();
    
    System.out.println("tearDown");
	}
	
	
	
}
