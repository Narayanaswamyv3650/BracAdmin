package com.teqsar.reports;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.teqsar.constrans.FrameWorkConstants;
import com.teqsar.enums.CatrgoryType;

public final class ExtentReport {
	private ExtentReport() {
	}

	private static ExtentReports extent;

	public static void initReports(){
		if(Objects.isNull(extent)){
			extent = new ExtentReports();
			ExtentSparkReporter spark = new ExtentSparkReporter(FrameWorkConstants.getExtentReportFilePath());
			extent.attachReporter(spark);
			spark.config().setTheme(Theme.STANDARD);
			spark.config().setDocumentTitle("Full Build Testing");
			spark.config().setReportName("Testing");
		}
	}
	public static void flushReport() {
		if(Objects.nonNull(extent))
			extent.flush();
		ExtentManager.unload();
		try {
			Desktop.getDesktop().browse(new File(FrameWorkConstants.getExtentReportFilePath()).toURI());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void createTest(String testName) {
		ExtentManager.setReport(extent.createTest(testName));
	}
	public static void addAuthors(String[] authors) {
		for(String temp:authors) {
			ExtentManager.getExtentTests().assignAuthor(temp);
		}
	}

	public static void addCategory(CatrgoryType[] category) {
		for(CatrgoryType temp:category) {
			ExtentManager.getExtentTests().assignCategory(temp.toString());
		}
	}


}
