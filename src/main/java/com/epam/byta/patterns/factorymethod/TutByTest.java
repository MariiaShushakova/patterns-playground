package com.epam.byta.patterns.factorymethod;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TutByTest {

	@Test
	public void test() {
		WebDriverCreator creator = new ChromeDriverCreator(); // can be FirefoxDriverCreator
		WebDriver driver = creator.createWebDriver();
		driver.navigate().to("http://www.tut.by/");
		driver.quit();
	}
}