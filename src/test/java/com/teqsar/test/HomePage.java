package com.teqsar.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.teqsar.driver.DriverManager;

public final class HomePage extends BaseTest {

	private HomePage() {

	}

	@Test
// Run | Debug
	public void test2() {
		DriverManager.getDriver().findElement(By.name("q")).sendKeys("Java", Keys.ENTER);
		
	}
}
