package com.teqsar.Listners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

import com.teqsar.enums.ConfigProperties;
import com.teqsar.utils.PropertyFileUtils;

public class RetryFailedTests implements IRetryAnalyzer {

	private int count=0;
	private int retries=1;

	public boolean retry(ITestResult result) {
		/* one way to achive 
		 * if(count<retries) { count++; return true; }
		 */
		// second way to achive
		boolean value=false;
		if(PropertyFileUtils.getValue(ConfigProperties.RETRYFAILEDTESTS).equalsIgnoreCase("yes")) {
			value=count<retries;
			count ++;
		}
		return value;
	}

}
