package br.com.core;

import br.com.core.DriverFactory;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Utils {

	public static void tiraPrint(String browser) throws IOException {
		File scrFile = ((TakesScreenshot) DriverFactory.Driver(browser)).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("screenshot/screenshot.png"));

	}

}
