package org.utilityclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class utilityclass {
	public static void launchbrowser() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();

	}

}
