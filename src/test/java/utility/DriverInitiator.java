package utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/*Initializing the driver by changing the browser name from config file*/
public class DriverInitiator {
	private static String chrome ="chrome";
	public static WebDriver driver;
	public static WebDriver initialiseDriver() {
		String browser = ReadData.getData("browser");
		if(browser.equals(chrome)) {
			return getChromeDriver();
		}
		return driver;	
	}
	
	/* giving impilicit time and maximizing the browser */
	public static WebDriver configureTheDriver() {
		driver = initialiseDriver();
		int timeOut = Integer.parseInt(ReadData.getData("implicitTimeOut"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeOut));
		driver.manage().window().maximize();
		return driver;
	}
	
	/* setting capabilities for ChromeDriver */
	public static ChromeDriver getChromeDriver() {
		ChromeOptions caps = new ChromeOptions();
		return new ChromeDriver(caps);
	}

}
