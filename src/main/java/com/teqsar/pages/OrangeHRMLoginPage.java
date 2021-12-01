package com.teqsar.pages;

import org.openqa.selenium.By;

import com.teqsar.enums.WaitStrategry;
import com.teqsar.reports.ExtentLogger;
import com.teqsar.reports.ExtentManager;

public final class OrangeHRMLoginPage extends BasePage {

	private final By txtUsername = By.id("txtUsername");
	private final By txtPassword = By.xpath("//input[@id='txtPassword' and @type='password']");
	private final By clickSubmit = By.xpath("//input[@id='btnLogin' and @type='submit']");

	public OrangeHRMLoginPage enterUserName(String username) throws Exception {
		sendKeys(txtUsername, username ,WaitStrategry.PRESENCE,"Username");
		ExtentLogger.pass("Entred username",true);
		return this;
	}

	public OrangeHRMLoginPage enterPassword(String password) throws Exception {
		sendKeys(txtPassword, password ,WaitStrategry.PRESENCE,"Password");
		ExtentLogger.pass("Entred Password",true);
		return this;
	}

	public OrangeHRMHomePage clickOnSubmit() throws Exception {
		click(clickSubmit ,WaitStrategry.PRESENCE,"Element Clicked");
		ExtentLogger.pass("Clicked on Submit" ,true);
		return new OrangeHRMHomePage();
	}

}
