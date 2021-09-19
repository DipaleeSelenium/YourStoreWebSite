package com.ys.qa.tests;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ys.qa.base.BaseTest;
import com.ys.qa.listener.CustomListener;
import com.ys.qa.pages.RegisterPageActions;
import com.ys.qa.util.TestUtil;

@Listeners(CustomListener.class)
public class RegisterPageTest extends BaseTest {

	RegisterPageActions reg;
	String sheetName = "RegisterPageValid";
	String sheetName1 = "RegisterPageInvalid";
	String sheetName2 = "RegisterPageDuplicateInfo";

	@BeforeMethod(alwaysRun = true)
	public void setup() {
		initialization();
		reg = new RegisterPageActions();
	}

	@DataProvider
	public Object[][] getRegisterTestData() {
		Object data[][] = TestUtil.getTestData(sheetName);
		return data;
	}

	@DataProvider
	public Object[][] getRegisterInvalidTestData() {
		Object data[][] = TestUtil.getTestData(sheetName1);
		return data;
	}

	@DataProvider
	public Object[][] getRegisterDuplicateTestData() {
		Object data[][] = TestUtil.getTestData(sheetName2);
		return data;
	}

	@Test(priority = 1, dataProvider = "getRegisterInvalidTestData")
	public void invalidRegisterTest(String ftName, String ltName, String emailId, String telNum, String newPwd,
			String cnfPwd) {
		reg.invalidUSerInformation(ftName, ltName, emailId, telNum, newPwd, cnfPwd);

	}

	@Test(priority = 2, dataProvider = "getRegisterDuplicateTestData")
	public void duplicateAccountTest(String ftName, String ltName, String emailId, String telNum, String newPwd,
			String cnfPwd) {

		reg.duplicateEmail(ftName, ltName, emailId, telNum, newPwd, cnfPwd);

	}

	@Test(priority = 3, dataProvider = "getRegisterTestData")
	public void validRegisterTest(String ftName, String ltName, String emailId, String telNum, String newPwd,
			String cnfPwd) throws IOException {
		reg.validRegisterNewAccount(ftName, ltName, emailId, telNum, newPwd, cnfPwd);
		TestUtil.takeScreenshot("incorrectInfo");

	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
