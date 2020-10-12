package com.biplob.testcases;



import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.biplob.page.LogInPage;
import com.biplob.page.RegisterPage;

public class TestRegister extends TestBase {
	
	

	@Test(dataProvider = "getData")
	public void register(String firstName,String lastName,String phoneNumber,String email,String address,String city,String state,String postalCode,String country) {
		
		driver.get(System.getProperty("url"));
		
		RegisterPage registerpage = new RegisterPage(driver);
		
		registerpage.clickregisterbutton();
		registerpage.enterFirstName(firstName);
		registerpage.enterLastName(lastName);
		registerpage.enterPhoneNumber(phoneNumber);
		registerpage.enterEmail(email);
		registerpage.enterAddress(address);
		registerpage.enterCity(city);
		registerpage.enterStateName(state);
		registerpage.enterPostCoad(postalCode);
		registerpage.selectCountry(country);
		

	}
	
	
	
	
	@DataProvider
	public Object[][] getData(){
		
		int totalRowCount= excelReader.getRowCount("Sheet1");
		int totalColumnCount= excelReader.getColumnCount("Sheet1");
		
		Object[][] data= new Object[totalRowCount][totalColumnCount];
		
		System.out.println(totalRowCount);
		System.out.println(totalColumnCount);
		
		for(int i=2; i<=totalRowCount+1;i++) {
			
			for(int j=0; j<totalColumnCount; j++) {
				
				data[i-2][j]=excelReader.getCellData("Sheet1", i, j);
				
			}
		}
				
		return data;
		
	}
	
	
}
