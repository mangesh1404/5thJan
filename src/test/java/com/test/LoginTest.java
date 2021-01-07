package com.test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.pages.DashboardPage;
import com.pages.LoginPage;

public class LoginTest extends TestBase {
	
	
	@BeforeSuite
	public void setUp() {
		initialization();
		lp= new LoginPage(driver);
	}
	
	@Test
	public void logoTest() {
		Assert.assertTrue(lp.verifyLogo());
	}
	
	@Test
	public void loginTest() {
		dp=lp.validLogin();
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");	
	}
	
	
	
}
