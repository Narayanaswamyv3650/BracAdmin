package com.teqsar.test;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.teqsar.driver.DriverManager;

public final class LoginPage extends BaseTest {
//nvr hard code

	private LoginPage() {

	}
 
	@Test
	// Run | Debug
	public void test1() {
		//Driver.initdriver(); 
		DriverManager.getDriver().findElement(By.name("q")).sendKeys("Automation", Keys.ENTER);
		String tittle=DriverManager.getDriver().getTitle();
		System.out.println(tittle);
		assertThat(tittle)
		.as("page tittle is -- ").containsIgnoringCase("Automation - Google Search")
		.as("Page tittle not blank --").isNotBlank()
		//.as("Paget matched with -- ").matches("\\w.'"+"Google Search")
		.as("Page size--").hasSizeBetween(5, 30);
		
		List<WebElement> list= DriverManager.getDriver().findElements(By.xpath("//h3/span"));
		System.out.println(list.toString());
		assertThat(list)
		.hasSize(19)
		.extracting(WebElement :: getText);
		
		//.extracting(e->e.getText());
		
		
		
	}
	

}
