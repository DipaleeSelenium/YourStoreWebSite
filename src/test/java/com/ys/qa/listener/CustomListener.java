package com.ys.qa.listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.ys.qa.base.BaseTest;
import com.ys.qa.util.TestUtil;

public class CustomListener extends BaseTest implements ITestListener {
	public void onStart(ITestContext context) {
		
	}

	public void onFinish(ITestContext context) {
		
	}

	public void onTestStart(ITestResult result) {

	}

	public void onTestSuccess(ITestResult result) {

	}

	public void onTestSkipped(ITestResult result) {

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	public void onTestFailure(ITestResult result) {
		System.out.println("failed test");
		TestUtil.takeScreenshotFailed(result.getMethod().getMethodName());
	}
}
