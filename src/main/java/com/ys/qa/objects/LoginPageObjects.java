package com.ys.qa.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ys.qa.base.BaseTest;

public class LoginPageObjects extends BaseTest {
	 @FindBy(xpath = "//a[contains(text(),'Login')]")
	 public WebElement btn_Login;
	 

}
