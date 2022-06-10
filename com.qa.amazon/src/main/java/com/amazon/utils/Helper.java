package com.amazon.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.JavascriptExecutor;
import com.amazon.base.DriverScript;

public class Helper extends DriverScript {

	public static void fn_sleep() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

	public static void fn_scroll(int height) {

		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0, " + height + ");");
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

	public static void fn_switchWindow() {
		Set<String> handles = driver.getWindowHandles();
		List<String> hList = new ArrayList<String>(handles);
		for (String e : hList) {
			String title = driver.switchTo().window(e).getTitle();
			if (title.contains("Samsung"))
				return;
		}

	}

}
