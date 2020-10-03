package com.sandy;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyTest {

	@BeforeTest
	public void setup() {
		System.out.println("Starting test");
	}

	@AfterTest
	public void teardown() {
		System.out.println("Ebdug test");
	}

	
	public static void setChromeDriverPath() {
		String chromedriverPath = System.getProperty("user.dir")
				+ "\\src\\test\\resources\\executable\\chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", chromedriverPath);

	}

	public static void setFirefoxDriverPath() {
		String firefoxdriverpath = System.getProperty("user.dir")
				+ "\\src\\test\\resources\\executable\\geckodriver.exe";

		System.setProperty("webdriver.gecko.driver", firefoxdriverpath);

	}
	@Test
	public void testingTitle() throws MalformedURLException {

		
		String rootDir=System.getProperty("user.dir");
		String firefoxPath=rootDir+"//src//test//resources//geckodriver.exe";

		/*
		 * Capabilities chromeCapabilities = DesiredCapabilities.chrome(); Capabilities
		 * firefoxCapabilities = DesiredCapabilities.firefox();
		 */

		
		 setChromeDriverPath();
		 setFirefoxDriverPath();
		//  WebDriver chrome=new ChromeDriver(); 
		  WebDriver firefox=new FirefoxDriver();
		 
			/*
			 * RemoteWebDriver chrome = new RemoteWebDriver(new
			 * URL("http://18.188.162.146:4444/wd/hub"), chromeCapabilities);
			 * RemoteWebDriver firefox = new RemoteWebDriver(new
			 * URL("http://18.188.162.146:4444/wd/hub"), firefoxCapabilities);
			 */

		  
		// run against chrome
		/*
		 * chrome.get("https://www.google.in"); System.out.println(chrome.getTitle());
		 */

		// run against firefox
		firefox.get("https://www.google.in");
		System.out.println(firefox.getTitle());

	//	chrome.quit();
		firefox.quit();

	}
}
