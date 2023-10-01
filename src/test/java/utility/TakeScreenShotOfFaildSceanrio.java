package utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class TakeScreenShotOfFaildSceanrio {
	public WebDriver driver;
	public TakesScreenshot screenshot;
	String filePath="resources/screenshot";
	File screenshotFile;
	public TakeScreenShotOfFaildSceanrio(WebDriver driver) {
		this.driver=driver;
	}
	public void takeScreenshot() {
		 try {
			screenshot = (TakesScreenshot)driver;
			screenshotFile = screenshot.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshotFile, new File(filePath));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
