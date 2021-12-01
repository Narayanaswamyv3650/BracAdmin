package com.teqsar.test;

import java.util.Map;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.teqsar.driver.Driver;

public class BaseTest {

	protected BaseTest() {

	}

	/*	
	 private , protected default ==> public 
	*/	
	//Below condition is using to validate the browser type from excel sheet
	@SuppressWarnings("unchecked")
	@BeforeMethod
	public void setUp(Object[] data) throws Exception { // Map<String,String>
		Map<String,String> map=(Map<String,String>)data[0];
		Driver.initdriver(map.get("browsertype"),map.get("version"));
	}

	@AfterMethod
	public void tearDown() {
		Driver.quitDriver();
	}
}
