package com.teqsar.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.teqsar.driver.DriverManager;
import com.teqsar.enums.WaitStrategry;
import com.teqsar.reports.ExtentLogger;

public class CorporateOnboardCreationPage extends BasePage {

	private final By createbutton=By.xpath("//button[@type=\"button\" and @aria-label='Create']");
	private final By New_Registration=By.xpath("//md-radio-button[@aria-label='New Registration']//div[1]");
	//Basic Details 
	private final By Corporate_Name= By.xpath("//input[@name=\"registeredName\"]");
	private final By clickOnTypeofinstitution=By.xpath("//md-select[@name=\"typeOfInstitution\"]");
	private final By selctInstituionType=By.xpath("//div[text()=' Sole Proprietorship ']");
	private final By clickOndocumentType=By.xpath("//md-select[@name=\"documentType\"]");
	private final By selctdocumentType=By.xpath("//div[text()=' TIN Certificate ']");
	private final By enterDocuemtnId=By.xpath("//input[@name=\"documentId\"]");
	//Choose the Section
	private String nexttittle;
	private By SectionNextittle=By.xpath("//a[@role=\"button\"]//span[text()='"+nexttittle+"']");


	private final By enterContactMobile=By.xpath("//div[@contact-options=\"contactOptions\"]//input[@name=\"mobileNumber\"]");
	private final By entereMail=By.xpath("//div[@contact-options=\"contactOptions\"]//input[@name=\"email\"]");
	private final By enterAddresLine1=By.xpath("//div[@address-options=\"registeredAddressOptions\"]//input[@name=\"addressLine1\"]");
	private final By enterAddresLine2=By.xpath("//div[@address-options=\"registeredAddressOptions\"]//input[@name=\"addressLine2\"]");
	//Below are Division	
	private final By clickonDivisionDropdown=By.xpath("//div[@address-options=\"registeredAddressOptions\"]//md-select[@name=\"state\"]");
	private final By selectDivision=By.xpath("//md-select-menu[@class=\"md-overflow\"]//md-option[@ng-repeat=\"item in items\" and @value=\"2\"]");
	// Below are City/district
	private final By clickonCityDistrict=By.xpath("//div[@address-options=\"registeredAddressOptions\"]//md-select[@name=\"city\"]");
	private final By selectCityDistrict=By.xpath("//md-select-menu[@class=\"md-overflow\"]//md-option[@ng-repeat=\"item in items\" and @value=\"03\"]");
	// Below are Upzilla 
	private final By clickUpzilla=By.xpath("//div[@address-options=\"registeredAddressOptions\"]//md-select[@name=\"subDistrict\"]");
	private final By selectUpzilla=By.xpath("//md-select-menu[@class=\"md-overflow\"]//md-option[@ng-repeat=\"item in items\" and @value=\"T0376\"]");
	//NearestLansMark
	private final By nearestLandMark=By.xpath("//div[@address-options=\"registeredAddressOptions\"]//input[@name=\"nearestLandMark\"]");
	private final By clickonCheckBox=By.xpath("//div[@address-options=\"registeredAddressOptions\"]//md-checkbox[@name=\"addressVerified\"]");
	//AddressVerifiedcheck boad and dropdown select
	private final By clickonverifiedthroughdrop=By.xpath("//div[@address-options=\"registeredAddressOptions\"]//md-select[@name=\"addressVerifiedThrough\"]");
	//private final By dropdown=By.xpath("//md-option[@ng-repeat=\"item in items\" and @value=\"BO\"]");
	private final By dropdown=By.xpath("//div[@class=\"md-select-menu-container md-active md-clickable\"]//md-select-menu");
	private final By clickadd=By.xpath("//div[@class=\"md-select-menu-container md-active md-clickable\"]//md-select-menu//md-content//md-option[2]");
	private final By clickonregistmobile=By.xpath("//div[@contact-options=\"registeredContactOptions\"]//input[@name=\"mobileNumber\"]");


	private final By clickOnBusinsesscheckBox=By.xpath("//md-checkbox[@aria-label=\"Business/Factory/Industry Address is same as Registered Address\"]");

	private final By clickOnMailingdropdown=By.xpath("//md-select[@aria-label=\"Communication Address is Same as\"]");
	private final By selectMailingAdd=By.xpath("//md-option[@value=\"HeadOffice\"]");

	private final By clickOnNextButtion=By.xpath("//button[@aria-label=\"Next\"]");
	private final By cancelPopup=By.xpath("//*[text()='Cancel']");
	private final By enterAnualIncome=By.xpath("//input[@name=\"annualIncome\"]");
	private final By clickOnNatureDropdown=By.xpath("//md-select[@aria-label=\"Nature/Type of Business\"]");
	private final By chooseNatureDropdownValue=By.xpath("//md-option[@value=\"GO\"]");
	private final By enterOtherBusiness=By.xpath("//input[@name=\"otherBusiness\"]");
	private final By enterSourceIncome=By.xpath("//input[@name=\"incomeSource\"]");
	private final By enterInroducerAccntNum=By.xpath("//input[@name=\"introducerAccountNumber\"]");

	private final By clickOnIntroducermenu=By.xpath("//a[@role=\"button\"]//span[contains(text(),'Introducer')]");
	private final By enterRelationIntro=By.xpath("//input[@name=\"introducerRelationship\"]");
	private final By clickonYearsofKnowing=By.xpath("//md-select[@aria-label=\"Years of knowing the introducer\"]");
	private final By chooseYearsofKnowing=By.xpath("(//md-option[@value=\"2\" and @role=\"option\"])[3]");


	//List<WebElement> dropdown=DriverManager.getDriver().findElements(By.xpath("//md-option[@ng-repeat=\"item in items\" and @value=\"BO\"]"));
	//int totalChcekboxes=dropdown.size();



	public CorporateOnboardCreationPage clickOnCreateButton() throws Exception {
		click(createbutton, WaitStrategry.PRESENCE, "Createbuttion");
		ExtentLogger.pass("Clicked on Creation", true);
		return this;
	}
	public  CorporateOnboardCreationPage clickOnnewRegistration() throws Exception {
		click(New_Registration, WaitStrategry.PRESENCE, "New_Registration");
		ExtentLogger.pass("Clicked on New_Registration", true);
		return this;
	}
	public CorporateOnboardCreationPage enterCorporateName(String corpName) throws Exception {
		sendKeys(Corporate_Name, corpName, WaitStrategry.PRESENCE, "Corporate_Name");
		ExtentLogger.pass("Entered the corp name",true);
		return this;
	}
	public CorporateOnboardCreationPage clickOnTypeofinstitution() throws Exception {
		click(clickOnTypeofinstitution, WaitStrategry.PRESENCE,"Clicked on typeinstitue dropdown");
		ExtentLogger.pass("Click on Drop",true);
		return this;
	}
	public CorporateOnboardCreationPage selctInstituionType() throws Exception {
		click(selctInstituionType, WaitStrategry.PRESENCE,"soloprop choosen");
		ExtentLogger.pass("selected drop value",true);
		return this;
	}
	public CorporateOnboardCreationPage clickOndocumentType() throws Exception {
		click(clickOndocumentType, WaitStrategry.PRESENCE,"Clicked on clickOndocumentType dropdown");
		ExtentLogger.pass("Click on Drop",true);
		return this;
	}
	public CorporateOnboardCreationPage selctdocumentType() throws Exception {
		click(selctdocumentType, WaitStrategry.PRESENCE,"selctdocumentType as TIN certificate ");
		ExtentLogger.pass("selected drop value",true);
		return this;
	}

	public CorporateOnboardCreationPage enterDocuemtnId(String DocID) throws Exception {
		sendKeys(enterDocuemtnId, DocID, WaitStrategry.PRESENCE, "enterDocuemtnId");
		ExtentLogger.pass("Entered the enterDocuemtnId",true);
		return this;
	}
	// Contact details section
	public CorporateOnboardCreationPage SectionNextittle(String nexttittle) throws Exception {
		SectionNextittle=By.xpath("//a[@role=\"button\"]//span[text()='"+nexttittle+"']");
		click(SectionNextittle, WaitStrategry.VISABLE,"Clicked on SectionNextittle dropdown");
		ExtentLogger.pass("Clicked on "+nexttittle+"",true);
		return this;
	}


	public CorporateOnboardCreationPage enterContactMobile(String contactNum) throws Exception {
		sendKeys(enterContactMobile, contactNum, WaitStrategry.PRESENCE, "enterContactMobile");
		ExtentLogger.pass("Entered the enterContactMobile",true);
		return this;
	}
	public CorporateOnboardCreationPage entereMail(String emailID) throws Exception {
		sendKeys(entereMail, emailID, WaitStrategry.PRESENCE, "entereMail");
		ExtentLogger.pass("Entered the entereMail",true);
		return this;
	}
	public CorporateOnboardCreationPage enterAddresLine1(String address1) throws Exception {
		sendKeys(enterAddresLine1, address1, WaitStrategry.PRESENCE, "address1");
		ExtentLogger.pass("Entered the enterAddresLine1",true);
		return this;
	}
	public CorporateOnboardCreationPage enterAddresLine2(String address2) throws Exception {
		scrolltoView();
		sendKeys(enterAddresLine2, address2, WaitStrategry.PRESENCE, "address2");
		ExtentLogger.pass("Entered the enterAddresLine2",true);
		return this;
	}
	public CorporateOnboardCreationPage clickonDivisionDropdown() throws Exception {
		scrolltoView();
		click(clickonDivisionDropdown, WaitStrategry.VISABLE,"clickonDivisionDropdown as TIN certificate ");
		ExtentLogger.pass("selected drop value DivisionDropdown",true);
		return this;
	}
	public CorporateOnboardCreationPage selectDivision() throws Exception {
		scrolltoView();
		click(selectDivision, WaitStrategry.VISABLE,"selectDivision");
		ExtentLogger.pass("selected drop selectDivision",true);
		Thread.sleep(3000);
		return this;
	}

	//City and district 
	public CorporateOnboardCreationPage clickonCityDistrict() throws Exception {
		scrolltoView();
		Thread.sleep(2000);
		scrolltoView();
		click(clickonCityDistrict, WaitStrategry.VISABLE,"clickonCityDistrict");
		ExtentLogger.pass("selected drop value clickonCityDistrict",true);
		return this;
	}
	public CorporateOnboardCreationPage selectCityDistrict() throws Exception {
		Thread.sleep(2000);
		scrolltoView();
		click(selectCityDistrict, WaitStrategry.VISABLE,"selectCityDistrict");
		ExtentLogger.pass("selected drop selectCityDistrict",true);
		return this;
	}
	// below are Upzilla 
	public CorporateOnboardCreationPage clickUpzilla() throws Exception {
		Thread.sleep(3000);
		scrolltoView();
		click(clickUpzilla, WaitStrategry.PRESENCE,"clickUpzilla");
		ExtentLogger.pass("selected drop value clickUpzilla",true);
		return this;
	}
	public CorporateOnboardCreationPage selectUpzilla() throws Exception {
		Thread.sleep(3000);
		scrolltoView();
		click(selectUpzilla, WaitStrategry.PRESENCE,"selectUpzilla");
		ExtentLogger.pass("selected drop selectUpzilla",true);
		return this;
	}
	public CorporateOnboardCreationPage enternearestLandMark(String emailID) throws Exception {
		scrolltoView();
		sendKeys(nearestLandMark, emailID, WaitStrategry.VISABLE, "nearestLandMark");
		ExtentLogger.pass("Entered the nearestLandMark",true);
		return this;
	}
	public CorporateOnboardCreationPage clickonCheckBox() throws Exception {
		scrolltoView();
		Thread.sleep(2000);
		click(clickonCheckBox, WaitStrategry.VISABLE,"clickonCheckBox");
		ExtentLogger.pass("selected drop value clickonCheckBox",true);
		return this;
	}

	public CorporateOnboardCreationPage clickonverifiedthroughdrop() throws Exception {
		scrolltoView();
		click(clickonverifiedthroughdrop, WaitStrategry.VISABLE,"clickonverifiedthroughdrop");
		ExtentLogger.pass("selected drop value clickonverifiedthroughdrop",true);
		return this;
	}
	public CorporateOnboardCreationPage dropdownofverifiedthrough() throws Exception {

		scrolltoView();
		click(clickadd, WaitStrategry.VISABLE,"clickadd");

		/*
		 * scrolltoView(); System.out.println("The element name is :"+clickadd);
		 * sendKeyskeyboard(clickadd, WaitStrategry.VISABLE, "expectingclick");
		 * System.out.println("Clicked on dropdown then");
		 */
		/*
		 * System.out.println("inside method Total checkboxs are "+totalChcekboxes);
		 * for(int i=0;i<totalChcekboxes;i++) { if(i<1) { dropdown.get(i).click(); }
		 * 
		 * }
		 */
		ExtentLogger.pass("selected drop value clickonCheckBox",true);
		return this;
	}
	public CorporateOnboardCreationPage clickOnBusinsesscheckBox() throws Exception {
		scrolltoView();
		click(clickOnBusinsesscheckBox, WaitStrategry.VISABLE,"clickOnBusinsesscheckBox");
		ExtentLogger.pass("selected drop value clickOnBusinsesscheckBox",true);
		return this;
	}
	public CorporateOnboardCreationPage clickonregistmobile() throws Exception {
		scrolltoView();
		click(clickonregistmobile, WaitStrategry.VISABLE,"clickonregistmobile");
		ExtentLogger.pass("selected drop value clickonregistmobile",true);
		return this;
	}

	public CorporateOnboardCreationPage clickOnMailingDropdown() throws Exception {
		click(clickOnMailingdropdown, WaitStrategry.VISABLE,"clickOnMailingdropdown");
		ExtentLogger.pass("selected drop clickOnMailingdropdown",true);
		return this;
	}
	public CorporateOnboardCreationPage selectMailingAdd() throws Exception {
		click(selectMailingAdd, WaitStrategry.VISABLE,"selectMailingAdd");
		ExtentLogger.pass("selected drop selectMailingAdd",true);
		return this;
	}
	public CorporateOnboardCreationPage clickOnNextButtion() throws Exception {
		Thread.sleep(2000);
		click(clickOnNextButtion, WaitStrategry.VISABLE,"clickOnNextButtion");
		ExtentLogger.pass("selected drop clickOnNextButtion",true);
		return this;
	}
	public CorporateOnboardCreationPage cancelPopup() throws Exception {
		Thread.sleep(3000);
		click(cancelPopup, WaitStrategry.VISABLE,"clickOnNextButtion");
		ExtentLogger.pass("selected drop cancelPopup",true);
		return this;
	}

	public CorporateOnboardCreationPage enterAnualIncome(String anualincome) throws Exception {
		Thread.sleep(4000);
		sendKeys(enterAnualIncome, anualincome, WaitStrategry.PRESENCE, "enterAnualIncome");
		ExtentLogger.pass("Entered the enterAnualIncome",true);
		return this;
	}
	public CorporateOnboardCreationPage clickOnNatureDropdown() throws Exception {
		Thread.sleep(1000);
		click(clickOnNatureDropdown, WaitStrategry.VISABLE,"clickOnNatureDropdown");
		ExtentLogger.pass("selected drop clickOnNatureDropdown",true);
		return this;
	}
	public CorporateOnboardCreationPage chooseNatureDropdownValue() throws Exception {
		Thread.sleep(1000);
		click(chooseNatureDropdownValue, WaitStrategry.VISABLE,"chooseNatureDropdownValue");
		ExtentLogger.pass("selected drop chooseNatureDropdownValue",true);
		return this;
	}
	public CorporateOnboardCreationPage enterOtherBusiness(String business) throws Exception {
		sendKeys(enterOtherBusiness, business, WaitStrategry.PRESENCE, "enterOtherBusiness");
		ExtentLogger.pass("Entered the enterOtherBusiness",true);
		return this;
	}
	public CorporateOnboardCreationPage enterSourceIncome(String income) throws Exception {
		sendKeys(enterSourceIncome, income, WaitStrategry.PRESENCE, "enterSourceIncome");
		ExtentLogger.pass("Entered the enterSourceIncome",true);
		return this;
	}
	public CorporateOnboardCreationPage clickOnIntroducermenu() throws Exception {
		click(clickOnIntroducermenu, WaitStrategry.VISABLE,"clickOnIntroducermenu");
		ExtentLogger.pass("selected drop clickOnIntroducermenu",true);
		return this;
	}
	public CorporateOnboardCreationPage enterInroducerAccntNum(String actnumber) throws Exception {
		sendKeys(enterInroducerAccntNum, actnumber, WaitStrategry.VISABLE, "enterInroducerAccntNum");
		DriverManager.getDriver().findElement(enterInroducerAccntNum).sendKeys(Keys.TAB);
		//keyboardTabAction(actnumber);
		ExtentLogger.pass("Entered the enterInroducerAccntNum",true);
		return this;
	}	
	public CorporateOnboardCreationPage enterRelationIntro(String income) throws Exception {
		sendKeys(enterRelationIntro, income, WaitStrategry.VISABLE, "enterRelationIntro");
		ExtentLogger.pass("Entered the enterRelationIntro",true);
		return this;
	}
	public CorporateOnboardCreationPage clickonYearsofKnowing() throws Exception {
		scrolltoView();
		Thread.sleep(6000);
		click(clickonYearsofKnowing, WaitStrategry.VISABLE,"clickonYearsofKnowing");
		ExtentLogger.pass("selected drop clickonYearsofKnowing",true);
		return this;
	}
	public CorporateOnboardCreationPage chooseYearsofKnowing() throws Exception {
		scrolltoView();
		click(chooseYearsofKnowing, WaitStrategry.VISABLE,"chooseYearsofKnowing");
		ExtentLogger.pass("selected drop chooseYearsofKnowing",true);
		return this;
	}
	public CorporateDocumentsPage clickOnNextButtionatAdditional() throws Exception {
		Thread.sleep(3000);
		click(clickOnNextButtion, WaitStrategry.VISABLE,"clickOnNextButtion");
		ExtentLogger.pass("selected drop clickOnNextButtion",true);
		return new CorporateDocumentsPage();
	}
}
