package com.teqsar.pages;

import org.openqa.selenium.By;

import com.teqsar.enums.WaitStrategry;
import com.teqsar.utils.DynamicXpathUtils;

public class AmazonHamburgerPage extends BasePage{

	private  String linkComputers = "//div[text()='Mobiles, Computers']/parent::a";
	private  String linkSubMenu = "//a[text()='Laptops']";
	private  String linkSubMenu2 = "//div[text()='%s']/parent::a[text()='%s']";
	
	public AmazonHamburgerPage clickComputer() throws Exception {
		click(By.xpath(linkComputers), WaitStrategry.CLICKABLE, "Mobiles and Computers");
		return this;
	}
	
	public AmazonLaptopPage clickOnSubMenuItem() throws Exception {
		//String newxpath = DynamicXpathUtils.getXpath(linkSubMenu, menutext);
		click(By.xpath(linkSubMenu), WaitStrategry.CLICKABLE, "Laptops");
		
		return null;
	}


}
