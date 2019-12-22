package com.epam.byta.patterns.strategy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class WebDriverInstance {

	private static WebDriver instance;

	public static WebDriver getInstance() {
		if (instance == null) {
			System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			instance = new ChromeDriver(capabilities);;
		}
		return instance;				
	}
}
