package com.JavaSeleniumBDD;

import org.openqa.selenium.WebDriver;

public class BaseUI {
	public WebDriver driver;
	public BaseUI() {
	}
	public BaseUI(WebDriver driver) {
		this.driver = driver;
	}
	
	public String pageTitle() {
		return driver.getTitle();
	}
	
	public String currentURL() {
		return driver.getCurrentUrl();
	}
	
	public String pageSource() {
		return driver.getPageSource();
	}
}
