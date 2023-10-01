package pageObject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.JavaSeleniumBDD.GetPage;

import utility.ReadData;

import org.apache.logging.log4j.*;


public class HomePageAction extends GetPage {
	public WebDriver driver;
	/* Need to pass class name here for logg message */
	Logger log = LogManager.getLogger("DashboardPageAction");
	
	/* Encapsulate Pgae Locator here */
	private static By signIn =By.cssSelector(".authorization-link");
	private static By email =By.id("email");
	private static By password =By.id("pass");
	private static By submit =By.id("send2");
	
	public HomePageAction(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	
	public void launchMagnetoURL() {
		launchURL();
		log.info("User Launch the URL: "+currentURL());
		log.info("page Title is: "+pageTitle());
	}
	public void clickOnSignin() {
		waitForElementVisible(signIn).click();
		log.info("click on Sigin Button");
	}
	
	public void EnterDashboardCredential() {
		scrollIntoView(email);
		waitForElementVisible(email).sendKeys(ReadData.getData("email"));
		scrollIntoView(password);
		waitForElementVisible(password).sendKeys(ReadData.getData("password"));
		log.info("user entered the credentials");
	}
	
	public void clickOnSubmit() {
		waitForElementVisible(submit).click();
		log.info("clicked on submit button");
	}
	
	public void verifyMagntoApplication() {
		Assert.assertEquals(pageTitle(), "Home Page");
		log.info("page title is: "+pageTitle());
	}

	
}
