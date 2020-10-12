package com.biplob.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage  {
	public RegisterPage(WebDriver driver) {
		
	PageFactory.initElements(driver, this);
		
		
	}
	
	//Elements
	
	@FindBy(linkText = "REGISTER")
	public WebElement registerTestButton;
	
	@FindBy(name = "firstName")
	public WebElement firstNameBox;
	
	@FindBy(name = "lastName")
	public WebElement lastNameBox;
	
	@FindBy(name = "phone")
	public WebElement phoneNumber;
	
	@FindBy(id = "userName")
	public WebElement email;
	
	@FindBy(name = "address1")
	public WebElement address;
	
	@FindBy(name = "city")
	public WebElement cityName;
	
	@FindBy(name = "state")
	public WebElement stateName;
	
	@FindBy(name = "postalCode")
	public WebElement postCoadNumber;
	
	@FindBy(name = "country")
	public WebElement findCountry;
	

	//Actions
	
	public void clickregisterbutton() {
		
		registerTestButton.click();

		System.out.println("Successfully clicl the register button");
	}
	
	public void enterFirstName (String firstName) {
		firstNameBox.sendKeys(firstName);
		
		System.out.println("Successfully enter the first name");
	}
	

	public void enterLastName (String lastName) {
		
		lastNameBox.sendKeys(lastName);
		System.out.println("Successfully enter the last name");
	}
	
	public void enterPhoneNumber(String phone) {
		
		phoneNumber.sendKeys(phone);
		System.out.println("Successfully enter the phone number");
	}
	
	public void enterEmail(String emailAddress) {
		email.sendKeys(emailAddress);
		System.out.println("Successfully enter the email");
	}
	
	public void enterAddress(String addressNumber) {
	   address.sendKeys(addressNumber);
	   System.out.println("Successfully enter the address");
	}
	
	
	public void enterCity(String city) {
		
		cityName.sendKeys(city);
		System.out.println("Successfully Enter the city name ");
	}
	
	public void enterStateName(String nameStates) {
		
	    stateName.sendKeys(nameStates);	
		System.out.println("Successfully enter the state name");
		
	}
	

	public void enterPostCoad(String postCoad) {
		
		postCoadNumber.sendKeys(postCoad);	
		System.out.println("Successfully enter the state name");
		
	}
	
	public void selectCountry(String country) {
	
		findCountry.click();
		Select oSelect = new Select(findCountry);
		oSelect.selectByVisibleText(country);
		System.out.println("successfully select the country");
	}
	
	
}
