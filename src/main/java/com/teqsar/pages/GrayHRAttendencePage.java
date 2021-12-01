package com.teqsar.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GrayHRAttendencePage extends BasePage{


	@FindBy(xpath="//*[@id=\"mainSidebar\"]/perfect-scrollbar/div/div[1]/ul/li[6]/a")
	private WebElement Attendence;

	@FindBy(xpath="//*[@id=\"mainSidebar\"]/perfect-scrollbar/div/div[1]/ul/li[6]/ul/li/a")
	private WebElement AttendenceInfo;

	@FindBy(xpath="/html/body/app/gt-hoc/ng-component/div/div/div/attendance-info/div[1]/div[1]/div[1]/span/label[2]")
	private WebElement TableView;

	@FindBy(xpath="//*[@class=\"ag-root-wrapper-body ag-layout-normal\"]//div[@class=\"ag-pinned-left-cols-viewport-wrapper\"]//div[@role=\"gridcell\"]")
	private WebElement getDates;


	/*
	 * public GrayHRAttendencePage() {
	 * PageFactory.initElements(DriverManager.getDriver(), this); }
	 */

	public GrayHRAttendencePage clickOnAttendence() throws InterruptedException {
		Thread.sleep(5000);
		Attendence.click();
		return this;
	}
	public GrayHRAttendencePage clickOnAttendenceInfo() {
		AttendenceInfo.click();
		return this;
	}

	public GrayHRAttendencePage clickOnTableView() {
		TableView.click();
		return this;
	}
	public GrayHRAttendencePage clickOnLogin() {
		getDates.click();
		return this;
	}


}