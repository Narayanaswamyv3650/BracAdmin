package com.teqsar.pages;

import org.openqa.selenium.By;

import com.teqsar.enums.WaitStrategry;
import com.teqsar.reports.ExtentLogger;

public class OnboardingPage extends BasePage{

	
	private final By Operationspath=By.xpath("//span[text()='Operations']");
	private final By Onboardingpath=By.xpath("//span[text()='Onboarding']");
	private final By Corporatepath=By.xpath("//li[@id=\"Corporate\"]//span[text()='Corporate']");

	
	public OnboardingPage clickOnOpertions() throws Exception {
		Thread.sleep(2000);
		click(Operationspath, WaitStrategry.VISABLE,"Operations");
		ExtentLogger.pass("Clicked on Operationspath", true);
		return this;
		
	}
	public OnboardingPage clickOnOnboarding() throws Exception {
		click(Onboardingpath, WaitStrategry.PRESENCE,"Onboarding");
		ExtentLogger.pass("Clicked on Onboardingpath", true);

		return this;
	}
	public CorporateOnboardCreationPage clickOnCorporate() throws Exception {
		click(Corporatepath, WaitStrategry.PRESENCE,"Corporatepath");
		ExtentLogger.pass("Clicked on Corporatepath", true);
System.out.println("OnboardingPage completed ");
		return new CorporateOnboardCreationPage();
	}
}
