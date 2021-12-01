package com.teqsar.reports;

import com.aventstack.extentreports.ExtentTest;

public class ExtentManager {

	private ExtentManager() {
		
	}
	private static ThreadLocal<ExtentTest> extTest = new ThreadLocal();

	 public static ExtentTest getExtentTests() {
		return extTest.get();
	}

	 static void setReport(ExtentTest test) {
		extTest.set(test);
	}

	 static void unload() {
		extTest.remove();
	}

	
}
