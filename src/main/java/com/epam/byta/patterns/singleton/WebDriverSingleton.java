package com.epam.byta.patterns.singleton;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class WebDriverSingleton {
	private static WebDriver driver;

	private WebDriverSingleton() {
	}

	public static WebDriver getWebDriverInstance() {
		if (driver == null) {
			System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			driver = new ChromeDriver(capabilities);	
		}
		return driver;
	}
}
