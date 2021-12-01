package com.teqsar.test;

import java.util.Map;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import com.qa.Annotations.FrameWorkAnnotation;
import com.teqsar.driver.DriverManager;
import com.teqsar.enums.CatrgoryType;
import com.teqsar.pages.AmazonHomePage;

public final class AmazonTest  extends BaseTest{

	private AmazonTest() {
	}
	//We need to kept the same method name in the Excel sheet


	@FrameWorkAnnotation(author= {"Narayana","Swamy"}, category= {CatrgoryType.REGRESSION,CatrgoryType.SANITY})
	@Test
	public void amazonTest(Map<String,String> data) throws Exception {

		String title = new AmazonHomePage().clickHamburger().clickComputer().clickOnSubMenuItem().getPageTitle();

		//String tittle=new AmazonHomePage().clickHamburger().clickComputer().clickOnSubMenuItem().getPageTitle();
		//Assertions.assertThat(tittle).isNotNull();	

		//String tittle=	new AmazonHomePage().clickHamburger().clickOnSubmenu(data.get("menuname")).getPageTitle();
		System.out.println("action done ");
		DriverManager.getDriver().quit();
	}
	@FrameWorkAnnotation(author= {"Narayana","Swamy"}, category= {CatrgoryType.REGRESSION,CatrgoryType.SANITY})
	@Test
	public void amazonTest1(Map<String,String> data) throws Exception {

		new AmazonHomePage();

		//String tittle=new AmazonHomePage().clickHamburger().clickComputer().clickOnSubMenuItem().getPageTitle();
		//Assertions.assertThat(tittle).isNotNull();	

		//String tittle=	new AmazonHomePage().clickHamburger().clickOnSubmenu(data.get("menuname")).getPageTitle();
		System.out.println("action done ");
		DriverManager.getDriver().quit();
	}
}
