package com.amazon.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import com.amazon.base.DriverScript;
import com.amazon.pages.AmazonHomePage;
import com.amazon.pages.AmazonProductPage;
import com.amazon.utils.Helper;

public class BaseTest extends DriverScript {

	AmazonHomePage amzHome;
	AmazonProductPage amzPrd;

	@BeforeSuite
	public void setUp() {
		initApplication();
		amzHome = new AmazonHomePage();
		amzPrd = new AmazonProductPage();
	}

	@AfterMethod
	public void sleep() {
		Helper.fn_sleep();
	}
	
	@AfterSuite
	public void tearDown() {
		quitDriver();
	}

}
