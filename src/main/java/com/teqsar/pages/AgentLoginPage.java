package com.teqsar.pages;

import org.openqa.selenium.By;

import com.teqsar.enums.WaitStrategry;
import com.teqsar.reports.ExtentLogger;

public class AgentLoginPage extends BasePage {

	private final By clickUserCheckbox = By.xpath("//input[@type=\"checkbox\"]");
	// private final By agentID =
	// By.xpath("//div[@id=\"mfs-agent-field\"]//label[text()='Agent id']");
	private final By agentID = By.xpath("//input[@id=\"mfs-agent-id\"]");
	private final By enterLoginID = By.xpath("//input[@id=\"mfs-login-id\"]");
	private final By enterpassword = By.xpath("//input[@name=\"password\"]");
	private final By clickOnLogin = By.xpath("//button[@type=\"submit\"]");

	/*
	 * public AgentLoginPage() { PageFactory.initElements(DriverManager.getDriver(),
	 * this); }
	 */
	public AgentLoginPage clickOncheckBox() throws Exception {
		click(clickUserCheckbox, WaitStrategry.PRESENCE, "CheckBox");
		return this;
	}

	public AgentLoginPage enterAgentID(String AgentID) throws Exception {
		sendKeys(agentID, AgentID, WaitStrategry.PRESENCE, "agentID");
		ExtentLogger.pass("Entred AgentID", true);
		return this;
	}

	public AgentLoginPage enterLoginID(String LoginId) throws Exception {
		sendKeys(enterLoginID, LoginId, WaitStrategry.PRESENCE, "LoginId");
		ExtentLogger.pass("Entred LoginID", true);
		return this;
	}

	public AgentLoginPage enterPassword(String password) throws Exception {
		sendKeys(enterpassword, password, WaitStrategry.PRESENCE, "password");
		ExtentLogger.pass("Enterd password", true);
		return this;
	}

	public OnboardingPage clickOnLogins() throws Exception {
		click(clickOnLogin, WaitStrategry.PRESENCE, "Element Clicked");
		ExtentLogger.pass("Clicked on Submit", true);
		System.out.println("OnboardingPage completed ");
		return new OnboardingPage();
	}
}
