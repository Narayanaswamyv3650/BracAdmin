package com.teqsar.factories;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.teqsar.constrans.FrameWorkConstants;
import com.teqsar.driver.DriverManager;
import com.teqsar.enums.WaitStrategry;

public final class ExplictwaitFactory {

	private ExplictwaitFactory() {
		
	}
	public static WebElement performExplictWait(WaitStrategry waitstrategry, By by) {
		WebElement element = null;
		if (waitstrategry == WaitStrategry.CLICKABLE) {
			element = new WebDriverWait(DriverManager.getDriver(), FrameWorkConstants.getExplicitwait())
					.until(ExpectedConditions.elementToBeClickable(by));
		} else if (waitstrategry == WaitStrategry.PRESENCE) {
			element = new WebDriverWait(DriverManager.getDriver(), FrameWorkConstants.getExplicitwait())
					.until(ExpectedConditions.presenceOfElementLocated(by));
		} else if (waitstrategry == WaitStrategry.VISABLE) {
			element = new WebDriverWait(DriverManager.getDriver(), FrameWorkConstants.getExplicitwait())
					.until(ExpectedConditions.visibilityOfElementLocated(by));
		} else if (waitstrategry == WaitStrategry.NONE) {
			DriverManager.getDriver().findElement(by);
		}
		return element;
	}
}
