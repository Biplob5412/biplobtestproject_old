package com.biplob.page;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {
	
 public  LogInPage(WebDriver driver) {
	 
	 
	 
		PageFactory.initElements(driver, this);
		
	}
	//elements
	@FindBy(name="userName")
	public WebElement unameTextBox;
	
	@FindBy(name="password")
	public WebElement passwordTexBox;
	
	@FindBy(name="submit")
	public WebElement submitButton;
	
	
	@FindBy(xpath="/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/h3")
	public WebElement logInSuccessText;
	
	
	
	
	
	
	//Actions
	
	public void enterUserName() {
		unameTextBox.sendKeys("David");
		System.out.println("Successfully enter the user name");
	}
	

	public void enterPassword() {
		passwordTexBox.sendKeys("David12345");
		System.out.println("Successfully enter the pasword");
	}
	
	 
	public void clickSubmitButton() {
		submitButton.click();
		System.out.println("Successfully click the submit button");
	}
	 
	 
  
public void verifyLogIn() {
	String actualText = logInSuccessText.getText();
	String expectedText = "Login Successfully";
    Assert.assertEquals(expectedText,actualText);
	System.out.println("Successfully verify the login");
	
  }
}
