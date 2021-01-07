package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.TestBase;

public class LoginPage extends TestBase {
	
	public LoginPage(WebDriver driver){
		 LoginPage.driver=driver;
		 PageFactory.initElements(driver, this);
	}	
	@FindBy(id="email")
	private WebElement uname;
	
	@FindBy(id="password")
	private WebElement pass;
	
	@FindBy(xpath="//button")
	private WebElement loginButton;
	
	@FindBy(xpath="//img")
	private WebElement logo;
	
	public void enterUserName(String text) {	
		uname.sendKeys(text);
	}
	public void enterPassword(String text) {
		pass.sendKeys(text);
	}
	public void clickLoginButton() {
		loginButton.click();
	}
	
	public boolean verifyLogo() {
		return logo.isDisplayed();
	}
	
	public DashboardPage validLogin() {
		enterUserName("kiran@gmail.com");
		enterPassword("123456");
		clickLoginButton();
		return new DashboardPage(driver);
	}
	
	
	
	
}
