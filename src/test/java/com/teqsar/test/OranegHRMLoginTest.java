package com.teqsar.test;

import java.util.Map;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import com.teqsar.pages.OrangeHRMLoginPage;

public class OranegHRMLoginTest extends BaseTest {

	private OranegHRMLoginTest() {

	}

	@Test
	public void loginTest(Map<String, String> data) throws Exception {
		System.out.println(data.get("username"));
		System.out.println(data.get("password"));
		String title = new OrangeHRMLoginPage()
				.enterUserName(data.get("username"))
				.enterPassword(data.get("password"))
				.clickOnSubmit()
				.welcomeLink()
				.logoutLink().getPageTitle();
		Assertions.assertThat(title).isEqualTo("OrangeHRM");
	}

	@Test
	public void loginTest1(Map<String, String> data) throws Exception {

		String title = new OrangeHRMLoginPage()
				.enterUserName(data.get("username"))
				.enterPassword(data.get("password"))
				.clickOnSubmit()
				.welcomeLink()
				.logoutLink().getPageTitle();
		Assertions.assertThat(title).isEqualTo("OrangeHRM");
	}

	/*
	 * @DataProvider(name = "newdata", parallel = true) public Object[][] getData()
	 * { return new Object[][] { { "Admin", "admin123" } , { "Adamin", "admin123" }
	 * ,{ "Adamin", "admssin123" } }; }
	 */

}
