package com.teqsar.test;

import java.io.IOException;
import java.util.Map;

import org.testng.annotations.Test;

import com.qa.Annotations.FrameWorkAnnotation;
import com.teqsar.enums.CatrgoryType;
import com.teqsar.pages.GrayHRLoginPage;

public class GrayHRTest extends BaseTest{ 



	@FrameWorkAnnotation(author= {"NarayanaSwamy"}, category= {CatrgoryType.REGRESSION,CatrgoryType.SANITY})
	@Test
	public static void grayHRLogin(Map<String,String> data) throws IOException, InterruptedException {

		new GrayHRLoginPage()
		//.clickEmployeeID().
		.enterEmployeeID().
		//clickPassword().
		enterPassword().
		loginButton().
		clickOnAttendence().clickOnAttendenceInfo().clickOnTableView();
	}
	
	}