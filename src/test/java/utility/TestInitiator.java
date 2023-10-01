package utility;

import org.openqa.selenium.WebDriver;

import pageObject.DashboardPageAction;
import pageObject.HomePageAction;

public class TestInitiator extends BaseTest {
	public final WebDriver driver;

	// Page variable
	public DashboardPageAction dashboardPage;
	public HomePageAction homePageAction;
	public TakeScreenShotOfFaildSceanrio takescreenSHot;

	public TestInitiator() {
		this.driver = DriverInitiator.configureTheDriver();
		initPage(driver);
	}
	
	public void closeSession() {
		driver.close();
	}

	/* Initializing the ALL page class object */
	private void initPage(WebDriver driver) {
		dashboardPage = new DashboardPageAction(driver);
		takescreenSHot = new TakeScreenShotOfFaildSceanrio(driver);
		homePageAction = new HomePageAction(driver);

	}

}
