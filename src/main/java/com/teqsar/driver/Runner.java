package com.teqsar.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;

public class Runner {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriverManager.getInstance(DriverManagerType.CHROME).setup();
		WebDriver driver =new ChromeDriver();
		driver.get("google");
	}
}
