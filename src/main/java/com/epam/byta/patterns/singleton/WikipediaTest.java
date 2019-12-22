package com.epam.byta.patterns.singleton;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class WikipediaTest {

	@Test
	public void wikipediaTest()
	{
		WebDriverSingleton.getWebDriverInstance().navigate().to("http://www.wikipedia.org/");
		WebDriverSingleton.getWebDriverInstance().quit();
		//...
	}

}
