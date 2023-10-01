package utility;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class BaseTest {
	WebDriver driver;
	public static TestInitiator test;
	
	public void setup() {
		test =new  TestInitiator();
	}
	
	@Before
	public void beforeScenario(Scenario scenario) {
		System.out.println("=================Test satrted===========================");
		System.out.println("Test started for Scenario : "+scenario.getName());
		System.out.println("========================================================");
	}
	
	@After
	public void afterScenario(Scenario scenario) {
		if(scenario.isFailed()) {
			test.takescreenSHot.takeScreenshot();
			System.out.println("m hu after");
			
		}
	}

	public void closeSession() {
		test.closeSession();
		
	}

}
