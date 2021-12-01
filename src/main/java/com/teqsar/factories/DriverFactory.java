package com.teqsar.factories;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.teqsar.driver.DriverManager;
import com.teqsar.enums.ConfigProperties;
import com.teqsar.utils.PropertyFileUtils;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * 
 * Mar 13, 2021
 * @author Narayana
 *
 */
public class DriverFactory {

	private DriverFactory() {

	}

	public static WebDriver	 getDriver(String browsertype,String version) throws MalformedURLException {
		WebDriver driver=null;
		String runMode=PropertyFileUtils.getValue(ConfigProperties.RUNMODE);
		//Below condition is using to validate the browser type from excel sheet 
		if(browsertype.equalsIgnoreCase("chrome")) {
			if(runMode.equalsIgnoreCase("remote")) {
				DesiredCapabilities cap=new DesiredCapabilities();
				cap.setBrowserName(BrowserType.CHROME);
				cap.setVersion(version);
				driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
			} else {
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
			}
		}

		if(browsertype.equalsIgnoreCase("firefox")) {
			if(runMode.equalsIgnoreCase("remote")) {
				DesiredCapabilities cap=new DesiredCapabilities();
				cap.setBrowserName(BrowserType.FIREFOX);
				cap.setVersion(version);
				driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);

			} else {
				WebDriverManager.chromedriver().setup();
				driver=new FirefoxDriver();
			}
		}		

		return driver;
	}
}

