package com.teqsar.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.teqsar.driver.DriverManager;

public class GrayHRLoginPage  extends BasePage{

	@FindBy(id="username")
	private WebElement loginID;
	
	@FindBy(id="password")
	private WebElement passWord;
	@FindBy(xpath = "//*[@type=\"submit\"]")
	private WebElement loginButton;
	
	public GrayHRLoginPage() {
		PageFactory.initElements(DriverManager.getDriver(), this);
	}	
	public GrayHRLoginPage clickEmployeeID() {
		loginID.click();
		return this;
	}
	public GrayHRLoginPage enterEmployeeID() {
		loginID.sendKeys("TSAR281");
		return this;
	}
	public GrayHRLoginPage clickPassword() {
		passWord.click();
		return this;
	}
	public GrayHRLoginPage enterPassword() {
		passWord.sendKeys("03Aprl1995@");
		return this;
	}
	public GrayHRAttendencePage loginButton() {
		loginButton.click();
		return new GrayHRAttendencePage();
	}
	
	
}