package com.amazon.base;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverScript {
	public static WebDriver driver;
	Properties prop;
	protected String validateStr = "About this item";

	public DriverScript() {

		try {

			File src = new File("./amaconfig/config.properties");
			FileInputStream fis = new FileInputStream(src);
			prop = new Properties();
			prop.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("unable to load properities file pleasecheck" + e.getMessage());

		}
	}

	public void initApplication() {

		String browser = prop.getProperty("browser");

		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./amabrowser/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./amabrowser/geckodriver.exe");
			driver = new FirefoxDriver();

		} else if (browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "./amabrowser/msedgedriver.exe");
			driver = new FirefoxDriver();

		} else {
			System.err.println("please provide a valid url");
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		launchURL();
	}

	public void launchURL() {
		String url = prop.getProperty("url");
		driver.get(url);
	}

	public static void quitDriver() {
		driver.quit();
	}
}
