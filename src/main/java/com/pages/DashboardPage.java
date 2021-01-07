package com.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.test.TestBase;

//page linking
public class DashboardPage extends TestBase {

	public DashboardPage(WebDriver driver){
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	}	
	
	@FindBy(xpath="//h1")
	private WebElement pageHeader;
	
	@FindBy(xpath="//h3")
	private List<WebElement> coursesNames;
	
	
	public void verifyCourses() {
		for(WebElement element : coursesNames) {
			System.out.println(element.getText());
			boolean flag=element.isDisplayed();
			Assert.assertTrue(flag);
		}
	}
	
}
