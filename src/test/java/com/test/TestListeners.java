package com.test;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.IRetryAnalyzer;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.test.TestBase;


public class TestListeners implements ITestListener{

	public void onFinish(ITestContext arg0) {
		//logger statements
	}

	public void onStart(ITestContext arg0) {
		
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		
		
	}

	public void onTestFailure(ITestResult result) {
		try {
			DemoTest1.getScreenshot(TestBase.driver, result.getName() );
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void onTestSkipped(ITestResult arg0) {
		
		
	}

	public void onTestStart(ITestResult arg0) {
		
		
	}

	public void onTestSuccess(ITestResult arg0) {
		
		
	}

	

}
