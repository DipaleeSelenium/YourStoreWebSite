package com.ys.qa.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ys.qa.base.BaseTest;
import com.ys.qa.pages.RegisterPageActions;

public class RegisterPageTest extends BaseTest {

	RegisterPageActions reg;

	@BeforeMethod(alwaysRun = true)
	public void setup() {
		initialization();
		reg = new RegisterPageActions();
	}
	
	@Test(priority = 1)
	public void invalidRegisterTest(){
		reg.invalidUSerInformation();
		reg.duplicateEmail();
		
	}
	
	@Test(priority = 2)
	public void validRegisterTest() {
		reg.validRegisterNewAccount();
	}
	
	@AfterMethod
	public void teardown(){
		driver.quit();
	}
	
	
}
