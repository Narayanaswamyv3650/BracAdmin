package com.teqsar.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.teqsar.driver.DriverManager;

public class DropDownUtils {
	private DropDownUtils() {

	}
	public static  WebElement getElement(By locator) {

		return DriverManager.getDriver().findElement(locator);
	}

	public static void doSelectVisableText(By locator, String value) {
		Select select=new Select(getElement(locator));
		select.selectByVisibleText(value);
	}
	public static void doSelectbyIndex(By locator, int value) {
		Select select=new Select(getElement(locator));
		select.selectByIndex(value);

	}	public static void doSelectbyValue(By locator, String value) {
		Select select=new Select(getElement(locator));
		select.selectByValue(value);

	}
	
	public static void dropDownHandle(By locator, String type,String value) {
		Select select=new Select(getElement(locator));
		switch (type) {
		case "index":
			select.selectByIndex(Integer.parseInt(value));
			break;
		case "text":
			select.selectByVisibleText(value);
			break;
		case "value":
			select.selectByValue(value);
			break;

		default:
			System.out.println("Please select the valid cretiaria...");
			break;
		}
		
		
		
		
		
		
	}
	


}
