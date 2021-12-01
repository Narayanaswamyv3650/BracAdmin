package com.teqsar.reports;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.teqsar.enums.ConfigProperties;
import com.teqsar.utils.PropertyFileUtils;
import com.teqsar.utils.ScreenshotUtils;

public class ExtentLogger {

	/*
	 * here we are using over load concept 
	 */
	public static void pass(String message) {
		ExtentManager.getExtentTests().pass(message);
	}

	public static void skip(String message) {
		ExtentManager.getExtentTests().skip(message);
	}

	public static void fail(String message) {
		ExtentManager.getExtentTests().fail(message);
	}

	public static void pass(String message, boolean isScreenShotNeeded)  throws Exception {
		if (PropertyFileUtils.getValue(ConfigProperties.SCREENSHOTPASS).equalsIgnoreCase("yes") || isScreenShotNeeded) {
			ExtentManager.getExtentTests().pass(message,MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtils.getBase64Image()).build());
		}else {
			pass(message);
		}

	}
	
	public static void fail(String message, boolean isScreenShotNeeded) throws Exception {
		if (PropertyFileUtils.getValue(ConfigProperties.SCREENSHOTFAIL).equalsIgnoreCase("yes") && isScreenShotNeeded) {
			ExtentManager.getExtentTests().pass(message,
					MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtils.getBase64Image()).build());
		}else {
			pass(message);
		}
	}
	public static void skip(String message, boolean isScreenShotNeeded) throws Exception {
		if (PropertyFileUtils.getValue(ConfigProperties.SCREENSHOTSKIP).equalsIgnoreCase("yes") && isScreenShotNeeded) {
			ExtentManager.getExtentTests().pass(message,
					MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtils.getBase64Image()).build());
		}else {
			pass(message);
		}
	}


}
