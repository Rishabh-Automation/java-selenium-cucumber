package com.JavaSeleniumBDD;

import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.ReadData;

public class GetPage extends BaseUI{
	Logger log = LogManager.getLogger("GetPage");
	public WebDriver driver;
	int timeOut = Integer.parseInt(ReadData.getData("explicitTimeOut"));
	private WebDriverWait wait;
	public GetPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	 public void setExplicitWait() {
		 wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
	 }
	public void launchURL() {
		driver.get(ReadData.getData("URL"));
	}
	
	public WebElement waitForElementVisible(By by) {
		setExplicitWait();
		WebElement locator = driver.findElement(by);
		wait.until(ExpectedConditions.elementToBeClickable(locator));
		return locator;
	}
	
	public void scrollIntoView(By by) {
		WebElement locator = driver.findElement(by);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", locator);
	}
	
	public void mouseHover(By by) {
		WebElement locator = driver.findElement(by);
		Actions actions = new Actions(driver);
		actions.moveToElement(locator).build().perform();
	}

}
