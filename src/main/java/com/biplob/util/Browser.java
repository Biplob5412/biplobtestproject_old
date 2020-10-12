package com.biplob.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browser {
	

	public WebDriver driver = null;
	
	public WebDriver setBrowser(String browserName) {
		
		if(browserName.equals("chrome")) {
			
			return new ChromeDriver();
			
		}else if(browserName.equals("firefox")) {
			
			return new FirefoxDriver();
			
		}else {
			
			return new InternetExplorerDriver();
		
		}	
		
	}
	
	public WebDriver getBrowser() {
		
		driver=setBrowser(System.getProperty("defaultBrowser"));
		
		return driver;
		
	}

}
