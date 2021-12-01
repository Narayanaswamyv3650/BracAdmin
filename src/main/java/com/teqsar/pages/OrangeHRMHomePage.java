package com.teqsar.pages;

import org.openqa.selenium.By;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.teqsar.driver.DriverManager;
import com.teqsar.enums.WaitStrategry;
import com.teqsar.reports.ExtentLogger;
import com.teqsar.reports.ExtentManager;
import com.teqsar.reports.ExtentReport;

public class OrangeHRMHomePage extends BasePage {

	// Asseritons should not be called in Page layers
	// All your page methids should return some return type

	private final By welcomeLink = By.xpath("//a[@id='welcome']");
	private final By logoutLink = By.xpath("//*[@id=\"welcome-menu\"]/ul/li[2]/a");

	public OrangeHRMHomePage welcomeLink() throws Exception {
		click(welcomeLink, WaitStrategry.CLICKABLE,"Welcome link Clicked");
		//ExtentManager.getExtentTests().pass("click on welcome");
		return this;
	}

	public OrangeHRMHomePage logoutLink() throws Exception {

		// Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS); // this is
		// alternative for the thread.sleep
		new WebDriverWait(DriverManager.getDriver(), 10).until(ExpectedConditions.elementToBeClickable(logoutLink));
		click(logoutLink, WaitStrategry.CLICKABLE,"Logout link Clicked");
		//ExtentManager.getExtentTests().pass("click on logout");
		ExtentLogger.pass("click on logout" ,true);

		return this;
	}

}
