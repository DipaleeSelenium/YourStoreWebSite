package com.ys.qa.base;

import org.openqa.selenium.support.PageFactory;

public class BaseTest extends TestBase {

	public BaseTest() {
		PageFactory.initElements(driver, this);
	}

}
