package com.biplob.testcases;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.biplob.page.LogInPage;
import com.biplob.page.RegisterPage;


public class TestLogIn extends TestBase {

	
	
	
	@Test
	public void login() {
			
	driver.get(System.getProperty("url"));
		
	//driver.findElement(
			//By.xpath("/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[2]"))
			//.click();	
	LogInPage loginpage = new LogInPage(driver);
	
	loginpage.enterUserName();
	loginpage.enterPassword();
     loginpage.clickSubmitButton();
     loginpage.verifyLogIn();
     //driver.quit();
    // driver.close();
	}
		
}

