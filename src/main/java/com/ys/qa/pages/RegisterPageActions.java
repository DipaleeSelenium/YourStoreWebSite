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

	public void invalidUSerInformation(String ftName, String ltName, String emailId, String telNum, String newPwd, String cnfPwd) {
		defaultStepsRegister();
		txt_RegisterFirstName.sendKeys(ftName);
		txt_RegisterLastName.sendKeys(ltName);
		txt_Email.sendKeys(emailId);
		num_Telephone.sendKeys(telNum);
		txt_NewPassword.sendKeys(newPwd);
		txt_ConfirmNewPassword.sendKeys(cnfPwd);

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

	public void duplicateEmail(String ftName, String ltName, String emailId, String telNum, String newPwd, String cnfPwd) {

		defaultStepsRegister();
		txt_RegisterFirstName.sendKeys(ftName);
		txt_RegisterLastName.sendKeys(ltName);
		txt_Email.sendKeys(emailId);
		num_Telephone.sendKeys(telNum);
		txt_NewPassword.sendKeys(newPwd);
		txt_ConfirmNewPassword.sendKeys(cnfPwd);

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

	public void validRegisterNewAccount(String ftName, String ltName, String emailId, String telNum, String newPwd, String cnfPwd) {
		defaultStepsRegister();
		txt_RegisterFirstName.sendKeys(ftName);
		txt_RegisterLastName.sendKeys(ltName);
		txt_Email.sendKeys(emailId);
		num_Telephone.sendKeys(telNum);
		txt_NewPassword.sendKeys(newPwd);
		txt_ConfirmNewPassword.sendKeys(cnfPwd);

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
