package com.amazon.tests;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import com.amazon.utils.Helper;

public class AmazonMenuTest extends BaseTest {

	@Test(priority = 1)
	public void testHamburgerMenuClick() {
		amzHome.clickHamburgerMenu();
	}

	@Test(priority = 2)
	public void testTvApplMenuClick() {
		amzHome.clickTvApplMenu();
	}

	@Test(priority = 3)
	public void testClickTvMenu() {
		amzHome.clickTvMenu();
	}

	@Test(priority = 4)
	public void testSelectSamsungBrand() {
		amzHome.samsungBrand();
	}

	@Test(priority = 5)
	public void testSortByFilter() {
		amzHome.sortByFilter();
	}

	@Test(priority = 6)
	public void testSelectFilterOption() {
		amzHome.selectFilterOption();
	}

	@Test(priority = 7)
	public void testSelect2ndTv() {
		List<WebElement> tvResult = driver.findElements(By.className("a-price-whole"));
		Helper.fn_sleep();
		amzHome.selectSecondHighestTV(tvResult.get(1));
	}

	@Test(priority = 8)
	public void testValidateItem() {
		amzPrd.validateThisItem(validateStr);
	}
}
