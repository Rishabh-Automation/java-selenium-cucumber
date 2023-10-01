package stepDefinitions;

import io.cucumber.java.en.*;
import static utility.BaseTest.test;

public class LoginStepDef {

	@Given("user Launch Magneto url")
	public void user_launch_magneto_url() {
	    test.dashboardPage.launchMagnetoURL();
	}

	@When("user logged into Magneto dashboard page")
	public void user_logged_into_magneto_dashboard_page() {
		test.dashboardPage.clickOnSignin();
		test.dashboardPage.EnterDashboardCredential();
		test.dashboardPage.clickOnSubmit();
	}

	@Then("verify magneto dashboard page")
	public void verify_magneto_dashboard_page() {
		test.dashboardPage.verifyMagntoApplication();
	}
}
