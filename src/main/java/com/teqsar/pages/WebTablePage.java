package com.teqsar.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.teqsar.driver.DriverManager;

public class WebTablePage extends BasePage{

	@FindBy(id="username")
	private WebElement loginID;

	
	public WebTablePage() {
		PageFactory.initElements(DriverManager.getDriver(), this);
	}	
	public WebTablePage clickOnLogin() {
		loginID.click();
		return this;
	}
	
	
}
