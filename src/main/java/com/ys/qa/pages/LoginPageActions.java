package com.ys.qa.pages;

import com.ys.qa.objects.LoginPageObjects;
import com.ys.qa.objects.RegisterPageObjects;

public class LoginPageActions extends LoginPageObjects {

	RegisterPageObjects rgObj = new RegisterPageObjects();;

	public void defaultStepsLogin() {
		rgObj.dwn_MyAccount.click();
		btn_Login.click();
		String logTitle = driver.getTitle();
		System.out.println(logTitle);
		if (logTitle.equals("Register Account")) {
			System.out.println("Register page is loaded successfully");
		} else {
			System.out.println("Register page is not loaded");
		}
	}

}
