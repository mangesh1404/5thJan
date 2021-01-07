package com.test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



@Listeners(com.test.ExtentReport.class)
public class DemoTest1 extends TestBase{
	
	public static String getScreenshot(WebDriver driver, String screenshotName) throws IOException{
		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) TestBase.driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		// after execution, you could see a folder "FailedTestsScreenshots"
		// under src folder
		System.out.println("inside screenshot");
		String destination = System.getProperty("user.dir") + "/FailedTestsScreenshots/" + screenshotName +"--"+ dateName+".jpg";
		File finalDestination = new File(destination);
		FileUtils.copyFile(source, finalDestination);
		return destination;
	}
	@BeforeSuite
	public void setUp() {
		initialization();
	}
	
	@Test
	public void test01() {
		System.out.println("am in beforesuite class");
		driver.get("file:///C:/Users/Administrator/Desktop/Offline%20Website/Offline%20Website/index.html");
		String actTitle = driver.getTitle();
		String expTitle = "JavaByKiran | Log i";
		Assert.assertEquals(actTitle, expTitle);
	}
}
