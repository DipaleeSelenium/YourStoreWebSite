package com.ys.qa.pages;

import static org.testng.Assert.assertEquals;

import com.ys.qa.objects.RegisterPageObjects;

public class RegisterPageActions extends RegisterPageObjects {

	public void defaultStepsRegister() {
		dwn_MyAccount.click();
		btn_Register.click();
		String regTitle = driver.getTitle();
		System.out.println(regTitle);
		if (regTitle.equals("Register Account")) {
			System.out.println("Register page is loaded successfully");
		} else {
			System.out.println("Register page is not loaded");
		}
	}

	public void invalidUSerInformation() {
		defaultStepsRegister();
		txt_RegisterFirstName.sendKeys("#$@%");
		txt_RegisterLastName.sendKeys("%#%#");
		txt_Email.sendKeys("test");
		num_Telephone.sendKeys("243#%$%");
		txt_NewPassword.sendKeys("d");
		txt_ConfirmNewPassword.sendKeys("t");

		boolean bval = radio_Subscriber.get(1).isSelected();

		if (bval = true) {
			radio_Subscriber.get(0).click();
		} else {
			radio_Subscriber.get(1).click();

		}

		chk_agree.click();
		btn_Continue.click();

		String regNewtitle = driver.getTitle();

		assertEquals(regNewtitle, "Register Account", "both texts are equal");

	}

	public void duplicateEmail() {

		defaultStepsRegister();
		txt_RegisterFirstName.sendKeys("John");
		txt_RegisterLastName.sendKeys("Paul");
		txt_Email.sendKeys("neyra112@mystickof.com");
		num_Telephone.sendKeys("9876563123");
		txt_NewPassword.sendKeys("test");
		txt_ConfirmNewPassword.sendKeys("test");

		boolean bval = radio_Subscriber.get(1).isSelected();

		if (bval = true) {
			radio_Subscriber.get(0).click();
		} else {
			radio_Subscriber.get(1).click();

		}

		chk_agree.click();
		btn_Continue.click();

		String duplicateEmailWarning = txt_duplicateEmailError.getText();
		System.out.println(duplicateEmailWarning);

		assertEquals(duplicateEmailWarning, "Warning: E-Mail Address is already registered!", "both texts are equal");
	}

	public void validRegisterNewAccount() {
		defaultStepsRegister();
		txt_RegisterFirstName.sendKeys("Joseph");
		txt_RegisterLastName.sendKeys("Paul");
		txt_Email.sendKeys("clea595@mystickof.com");
		num_Telephone.sendKeys("9870567890");
		txt_NewPassword.sendKeys("test");
		txt_ConfirmNewPassword.sendKeys("test");

		boolean bval = radio_Subscriber.get(1).isSelected();

		if (bval = true) {
			radio_Subscriber.get(0).click();
		} else {
			radio_Subscriber.get(1).click();

		}

		chk_agree.click();
		btn_Continue.click();

		String regNewtitle = driver.getTitle();

		assertEquals(regNewtitle, "Your Account Has Been Created!", "both texts are equal");
	}
}
