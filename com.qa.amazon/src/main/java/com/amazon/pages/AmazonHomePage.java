package com.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.amazon.base.DriverScript;
import com.amazon.utils.Helper;

public class AmazonHomePage extends DriverScript {

	@FindBy(xpath = "//i[@class='hm-icon nav-sprite']")
	WebElement hamburgerMenu;
	@FindBy(xpath = "//div[normalize-space()='TV, Appliances, Electronics']")
	WebElement tvApplMenu;
	@FindBy(xpath = "//a[normalize-space()='Televisions']")
	WebElement tvMenu;
	@FindBy(xpath = "//span[@class='a-size-base a-color-base'][normalize-space()='Samsung']")
	WebElement samsungCheckbox;
	@FindBy(xpath = "//span[@id='a-autoid-0-announce']")
	WebElement sortByDropdown;
	@FindBy(xpath = "//a[@id='s-result-sort-select_2']")
	WebElement highToLowLink;

	public AmazonHomePage() {
		PageFactory.initElements(driver, this);
	}

	public void clickHamburgerMenu() {
		hamburgerMenu.click();
	}

	public void clickTvApplMenu() {
		Helper.fn_scroll(400);
		tvApplMenu.click();
	}

	public void clickTvMenu() {
		tvMenu.click();
	}

	public void samsungBrand() {
		Helper.fn_scroll(2500);
		samsungCheckbox.click();
	}

	public void sortByFilter() {
		sortByDropdown.click();
	}

	public void selectFilterOption() {
		highToLowLink.click();
	}

	public void selectSecondHighestTV(WebElement secondTv) {
		secondTv.click();
	}

}
