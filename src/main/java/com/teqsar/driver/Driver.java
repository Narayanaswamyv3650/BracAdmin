package com.teqsar.driver;

import java.net.MalformedURLException;
import java.util.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.teqsar.Exceptions.BrowserInvocationException;
import com.teqsar.constrans.FrameWorkConstants;
import com.teqsar.enums.ConfigProperties;
import com.teqsar.factories.DriverFactory;
import com.teqsar.utils.PropertyFileUtils;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Driver class is responsiable for invoking and closing the broswers.
 * <p>
 *  It also responsiable for setting the driver variable to drivermaneger which 
 * handles  the thread safty for the particualt manager <p>
 * @author Narayana
 *
 */
public final class Driver {
	/**
	 * Private constructor to avoid external initialzation
	 */
	private Driver() {

	}

	private static WebDriver dr;

	/**
	 * @see BaseTest
	 * @param browsertype
	 */
	public static void initdriver(String browsertype,String version) {
		//String runMode=PropertyFileUtils.getValue(ConfigProperties.RUNMODE);

		if (Objects.isNull(DriverManager.getDriver())) {
			try {
				DriverManager.setDriver(DriverFactory.getDriver(browsertype,version));
			} catch (MalformedURLException e) {
				throw new BrowserInvocationException("Broswer invocation failed, please check capabiities");
			}
			DriverManager.getDriver().get(PropertyFileUtils.getValue(ConfigProperties.URL));
			DriverManager.getDriver().manage().window().maximize();
			DriverManager.getDriver().manage().logs();
			DriverManager.getDriver().manage().deleteAllCookies();
		}
	}
	public static void quitDriver() {
		if (Objects.nonNull(dr)) {
			DriverManager.getDriver().quit();
			DriverManager.unload();
		}
	}
}
