package com.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.amazon.base.DriverScript;
import com.amazon.utils.Helper;

public class AmazonProductPage extends DriverScript {

	@FindBy(xpath = "//h1[text()=' About this item ']")
	WebElement aboutThisText;

	public AmazonProductPage() {
		PageFactory.initElements(driver, this);
	}

	public void validateThisItem(String validate) {
		Helper.fn_switchWindow();
		Helper.fn_scroll(1000);
		Assert.assertEquals(aboutThisText.getText().trim(), validate);
		System.out.println("About This Item Visisble:" + aboutThisText.getText());
	}
}
