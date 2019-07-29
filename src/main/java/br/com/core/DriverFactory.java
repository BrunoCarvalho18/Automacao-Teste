package br.com.core;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class DriverFactory {

	private static WebDriver driver;
	private static final String DRIVER_CHROME = "chrome";
	private static final String DRIVER_FIREFOX = "firefox";
	private static final String HEADLESS_CHROME = "chrome-headless";
	private static final String HEADLESS_FIREFOX = "firefox-headless";

	public static WebDriver Driver(String browserName) {

		if (browserName.equals(DRIVER_CHROME)) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "/src/main/resources/webdriver/chromedriver.exe");
			if (driver == null) {
				driver = new ChromeDriver();
				driver.manage().window().maximize();
			}
		} else if (browserName.equals(DRIVER_FIREFOX)) {
			System.setProperty("webdriver.firefox.driver",
					System.getProperty("user.dir") + "/src/main/resources/webdriver/geckodriver.exe");
			if (driver == null) {
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
			}
		} else if (browserName.equals(HEADLESS_CHROME)) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "/src/main/resources/webdriver/chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--headless");
			driver = new ChromeDriver(options);
			
		} else if (browserName.equals(HEADLESS_FIREFOX)) {
			System.setProperty("webdriver.firefox.driver",
					System.getProperty("user.dir") + "/src/main/resources/webdriver/geckodriver.exe");
			FirefoxOptions options = new FirefoxOptions();
			options.addArguments("--window-size=1920,1080");
			options.addArguments("--start-maximized");
			options.addArguments("--headless");
			driver = new FirefoxDriver(options);
		
		}
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		return driver;

	}
	
	public static void EncerraDriver() {
		driver.close();
	}

}
