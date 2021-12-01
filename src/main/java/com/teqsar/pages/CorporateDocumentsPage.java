package com.teqsar.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.teqsar.constrans.FrameWorkConstants;
import com.teqsar.driver.DriverManager;
import com.teqsar.enums.WaitStrategry;
import com.teqsar.reports.ExtentLogger;

public class CorporateDocumentsPage extends BasePage {
	private final By clickProfofIdentity =By.xpath("//p[contains(text(),'Proof of Identity')]");
	private final By clickOnaddDocuments=By.xpath("(//span[@class='fa fa-xs fa-plus ng-scope'])[1]");
	private final By passingdocuments=By.xpath("//input[@class='lf-ng-md-file-input-tag ng-scope']");
	private final By documenType=By.xpath("//md-select[@name='documentType']");
	private final By docTypeNationalID=By.xpath("//div[contains(text(),'NID-CORPORATE')]");
	private final By enterDocumentId=By.xpath("//input[@name='documentNoRequired']");
	private final By enterIssueDate=By.xpath("//span[contains(text(),'Issue Date')]");
	private final By enterIssueAuthority=By.xpath("//input[@name=\"issuingAuthorityRequired\"]");
	private final By clickOnDocCheckBox=By.xpath("//md-checkbox[@name=\"isDocVerified\"]");
	private final By clickOnDocumentSubmit=By.xpath("//button[@class='mfs-template-btns mfs-template-main-btn mfs-modal-submit-btn md-button ng-scope md-ink-ripple']");

	
	
	public CorporateDocumentsPage clickProfofIdentity() throws Exception {
		Thread.sleep(5000);
		click(clickProfofIdentity, WaitStrategry.PRESENCE, "clickProfofIdentity");
		ExtentLogger.pass("Clicked on clickProfofIdentity", false);
		return this;
	}
	public CorporateDocumentsPage clickOnaddDocuments() throws Exception {
		click(clickOnaddDocuments, WaitStrategry.PRESENCE, "clickOnaddDocuments");
		ExtentLogger.pass("Clicked on clickOnaddDocuments", false);
		return this;
	}

	public CorporateDocumentsPage passingdocuments() throws Exception {
		Thread.sleep(3000);
		//click(passingdocuments, WaitStrategry.PRESENCE, "passingdocuments");
		WebElement path = DriverManager.getDriver().findElement(passingdocuments);
		path.sendKeys(FrameWorkConstants.getImagepath());
		Thread.sleep(1000);

		ExtentLogger.pass("Uploading for identity", false);
		return this;
	}
	public CorporateDocumentsPage documenType() throws Exception {
		click(documenType, WaitStrategry.PRESENCE, "documenType");
		ExtentLogger.pass("Clicked on documenType", false);
		return this;
	}
	public CorporateDocumentsPage docTypeNationalID() throws Exception {
		click(docTypeNationalID, WaitStrategry.PRESENCE, "docTypeNationalID");
		ExtentLogger.pass("Clicked on docTypeNationalID", false);
		return this;
	}
	public CorporateDocumentsPage enterDocumentId(String docid) throws Exception {
		sendKeys(enterDocumentId, docid, WaitStrategry.PRESENCE, "enterDocumentId");
		ExtentLogger.pass("Entered the enterDocumentId",true);
		return this;
	}
	public CorporateDocumentsPage enterIssueDate(String docid) throws Exception {
		sendKeys(enterIssueDate, docid, WaitStrategry.PRESENCE, "enterIssueDate");
		ExtentLogger.pass("Entered the enterIssueDate",true);
		return this;
	}
	public CorporateDocumentsPage enterIssueAuthority(String docid) throws Exception {
		sendKeys(enterIssueAuthority, docid, WaitStrategry.PRESENCE, "enterIssueAuthority");
		ExtentLogger.pass("Entered the enterIssueAuthority",true);
		return this;
	}
	public CorporateDocumentsPage clickOnDocCheckBox() throws Exception {
		click(clickOnDocCheckBox, WaitStrategry.PRESENCE, "clickOnDocCheckBox");
		ExtentLogger.pass("Clicked on clickOnDocCheckBox", false);
		return this;
	}
	public CorporateDocumentsPage clickOnDocumentSubmit() throws Exception {
		click(clickOnDocumentSubmit, WaitStrategry.PRESENCE, "clickOnDocumentSubmit");
		ExtentLogger.pass("Clicked on clickOnDocumentSubmit", true);
		return this;
	}


}
