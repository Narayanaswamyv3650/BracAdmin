package com.teqsar.pages;

import org.openqa.selenium.By
;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.teqsar.driver.DriverManager;
import com.teqsar.enums.WaitStrategry;
import com.teqsar.factories.ExplictwaitFactory;
import com.teqsar.reports.ExtentLogger;

public class BasePage {

	protected void click(By by, WaitStrategry waitstrategry, String elmentname) throws Exception {
		WebElement element = ExplictwaitFactory.performExplictWait(waitstrategry, by);
		element.click();
		ExtentLogger.pass(elmentname+" is Clicked" ,true);
	}

	protected void sendKeys(By by, String value, WaitStrategry waitstrategry, String elementname) throws Exception {
		WebElement element = ExplictwaitFactory.performExplictWait(waitstrategry, by);
		element.sendKeys(value);
		ExtentLogger.pass(value+" is entred successfully in "+elementname+"Field" ,true);
	}
	protected void sendKeyskeyboard(By by, WaitStrategry waitstrategry, String elementname) throws Exception {
		WebElement element = ExplictwaitFactory.performExplictWait(waitstrategry, by);
		//		element.click();
		//element.sendKeys(Keys.ARROW_DOWN);
		element.sendKeys(Keys.ARROW_DOWN);
		element.sendKeys(Keys.ENTER);
		element.click();
		ExtentLogger.pass(" is entred successfully in "+elementname+"Field" ,true);
	}
	public String getPageTitle() {
		if(DriverManager.getDriver().getTitle()!=null) {
			System.out.println(" tittle");
			return DriverManager.getDriver().getTitle();

		}
		return DriverManager.getDriver().getTitle();
	}

	public void scrolltoView() {

		JavascriptExecutor js = (JavascriptExecutor)DriverManager.getDriver();
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
	
	public void scrolltoViewElement() {

		JavascriptExecutor js = (JavascriptExecutor)DriverManager.getDriver();
		js.executeScript("arguments[0].scrollIntoView(true);");
	}
	protected void SyhMhzScrollDetailPageUP()
	{
		WebElement scroll = DriverManager.getDriver().findElement(By.xpath("//div[@ui-layout-container=\"central\"]"));
		scroll.sendKeys(Keys.PAGE_DOWN);
	}
	protected void keyboardTabAction(String elementname) {
		WebElement tabaction =DriverManager.getDriver().findElement(By.xpath(elementname));
		tabaction.sendKeys(Keys.TAB);
	}


}
