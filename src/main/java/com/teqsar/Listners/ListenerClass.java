package com.teqsar.Listners;

import java.io.IOException;
import java.util.Arrays;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.qa.Annotations.FrameWorkAnnotation;
import com.teqsar.driver.DriverManager;
import com.teqsar.reports.ExtentLogger;
import com.teqsar.reports.ExtentReport;

public class ListenerClass implements ITestListener, ISuiteListener {

	public void onTestStart(ITestResult result) {
		ExtentReport.createTest(result.getMethod().getMethodName());
		ExtentReport.addAuthors(result.getMethod().getConstructorOrMethod().getMethod().getAnnotation(FrameWorkAnnotation.class)
			.author());
		ExtentReport.addCategory(result.getMethod().getConstructorOrMethod().getMethod().getAnnotation(FrameWorkAnnotation.class)
			.category());
			}

	public void onTestSuccess(ITestResult result) {
		ExtentLogger.pass(result.getMethod().getMethodName() + " is Passed");
	}

	public void onTestFailure(ITestResult result) {
		try {
			ExtentLogger.fail(result.getMethod().getMethodName() + " is Failed", true);
			ExtentLogger.fail(result.getThrowable().toString());
			ExtentLogger.fail(Arrays.toString(result.getThrowable().getStackTrace()));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult result) {
		ExtentLogger.skip(result.getMethod().getMethodName() + " is Skipped");

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	public void onStart(ITestContext context) {

	}

	public void onFinish(ITestContext context) {
			ExtentReport.flushReport();

	}

	public void onStart(ISuite suite) {
		System.out.println("Befor suite in Listner");
			ExtentReport.initReports();
	}

	public void onFinish(ISuite suite) {
		System.out.println("After suite in Listner");

	}

}
