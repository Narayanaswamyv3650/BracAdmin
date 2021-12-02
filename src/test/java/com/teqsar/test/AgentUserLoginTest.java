package com.teqsar.test;

import java.util.Map;

import org.testng.annotations.Test;

import com.qa.Annotations.FrameWorkAnnotation;
import com.teqsar.driver.DriverManager;
import com.teqsar.enums.CatrgoryType;
import com.teqsar.pages.AgentLoginPage;
import com.teqsar.utils.RandomUtils;

public class AgentUserLoginTest extends BaseTest{


	@FrameWorkAnnotation(author= {"NarayanaSwamy"}, category= {CatrgoryType.REGRESSION,CatrgoryType.SANITY})
	@Test
	public static void agentUserLogin(Map<String,String> data) throws Exception {

		new AgentLoginPage()
		.clickOncheckBox()
		.enterAgentID("959608")
		.enterLoginID("NarayanUser")
		.enterPassword("mfino123")
		//Post Login
		.clickOnLogins().clickOnOpertions().clickOnOnboarding().clickOnCorporate()
		.clickOnCreateButton().clickOnnewRegistration()
		//Basic Details 
		.enterCorporateName(RandomUtils.generateRandomString(10))
		.clickOnTypeofinstitution().selctInstituionType()
		.clickOndocumentType().selctdocumentType()
		.enterDocuemtnId(RandomUtils.generateRandomNumericString(12))
		//choose next 
		.SectionNextittle("Contact Details")
		// Contact Details
		.enterContactMobile(RandomUtils.generateBracBankMobileNumber(8))
		.entereMail(RandomUtils.generateemailId())
		.SectionNextittle("Registered Address")
		//RegisterAddress 
		.enterAddresLine1(RandomUtils.generateRandomString(15))
		.enterAddresLine2(RandomUtils.generateRandomString(15))
		//here country default selected
		.clickonDivisionDropdown()
		.selectDivision()
		.clickonCityDistrict()
		.selectCityDistrict()
		.clickUpzilla()
		.selectUpzilla()
		.enternearestLandMark(RandomUtils.generateRandomString(10))
		.clickonCheckBox()
		.clickonverifiedthroughdrop()
		.dropdownofverifiedthrough()
		.clickonregistmobile()
		.SectionNextittle("Business/Factory/Industry Address")
		.clickOnBusinsesscheckBox()
		.SectionNextittle("Mailing / Communication Address")
		.clickOnMailingDropdown()
		.selectMailingAdd()
		.clickOnNextButtion()
		.cancelPopup()
		.clickOnNextButtion()
		.enterAnualIncome("50000")
		.clickOnNatureDropdown()
		.chooseNatureDropdownValue()
		.enterOtherBusiness("Nothing doing")
		.enterSourceIncome("doing some job")
		.clickOnIntroducermenu()
		//.SectionNextittle("Introducer\\'s Information")
		.enterInroducerAccntNum("3245243523453567")
		.enterRelationIntro("Somthing")
		.clickonYearsofKnowing()
		.chooseYearsofKnowing()
		.clickOnNextButtionatAdditional()
		.clickProfofIdentity()
		.clickOnaddDocuments()
		.passingdocuments()
		.documenType()
		.docTypeNationalID()
		.enterDocumentId(RandomUtils.generateDocumentNumber(10))
		.enterIssueDate("26/11/2021")
		.enterIssueAuthority("Government")
		.clickOnDocCheckBox()
		.clickOnDocumentSubmit()
		// Proof of Business
		.clickProfofBusiness()
		.clickOnaddDocuments()
		.passingdocuments()
		.documenType()
		.docTypeTradeLicenceDoc()
		.enterDocumentId(RandomUtils.generateDocumentNumber(10))
		.enterIssueDate("26/11/2021")
		.enterExpiryDate("26/11/2023")
		.enterIssueAuthority("Government")
		.clickOnDocCheckBox()
		.clickOnDocumentSubmit()
		
		.clickOnaddDocuments()
		.passingdocuments()
		.documenType()
		.docTypeTINCertificate()
		.enterDocumentId(RandomUtils.generateDocumentNumber(12))
		.enterIssueDate("26/11/2021")
		.enterExpiryDate("26/11/2023")
		.enterIssueAuthority("Government")
		.clickOnDocCheckBox()
		.clickOnDocumentSubmit();
		
	


		//DriverManager.getDriver().quit();
		
	
}
}
