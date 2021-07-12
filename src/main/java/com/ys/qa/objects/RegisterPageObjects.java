package com.ys.qa.objects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ys.qa.base.BaseTest;

public class RegisterPageObjects extends BaseTest {
	
	@FindBy(xpath = "//a[contains(@Class,'dropdown-toggle')]")
	public WebElement dwn_MyAccount;
	
	@FindBy(xpath = "//a[contains(text(),'Register')]")
	public WebElement btn_Register;
	
	@FindBy(xpath = "//input[@id='input-firstname']")
	public WebElement txt_RegisterFirstName;
	
	@FindBy(xpath = "//input[@id='input-lastname']")
	public WebElement txt_RegisterLastName;
	
	@FindBy(xpath = "//input[@id='input-email']")
	public WebElement txt_Email;
	
	@FindBy(xpath = "//input[@id='input-telephone']")
	public WebElement num_Telephone;
	
	@FindBy(xpath = "//input[@id='input-password']")
	public WebElement txt_NewPassword;

	@FindBy(xpath = "//input[@id='input-confirm']")
	public WebElement txt_ConfirmNewPassword;
	
//	@FindBy(xpath = "//input[@value = 1]")
//	public WebElement rad_Subscribe_Yes;
//	
//	@FindBy(xpath = "//input[@value= 0]")
//	public WebElement rad_Subscribe_No;
	
	@FindBy(name= "newsletter")
	public List<WebElement> radio_Subscriber;
	
	@FindBy(name= "agree")
	public WebElement chk_agree;
	
	@FindBy(xpath = "//input[@type='submit']" )
	public WebElement btn_Continue;
	
	@FindBy(xpath = "//div[@class = 'alert alert-danger alert-dismissible']")
	public WebElement txt_duplicateEmailError;
	
	
}
