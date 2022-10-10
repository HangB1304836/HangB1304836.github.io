package hangle.demo.cucumber.steps.serenity;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import hangle.demo.cucumber.page.HomePage;
import net.thucydides.core.steps.ScenarioSteps;

public class LoginSteps extends ScenarioSteps {

	HomePage homePage;

	public void open_home_page() {
		homePage.open();
	}

	public void login(String user, String pwd) {
		homePage.login(user, pwd);
	}

	public String currentUrl() {
		WebDriver driver = getDriver();
		String url = "";
		if (driver != null) {
			url = driver.getCurrentUrl();
		}
		return url;
	}
	
	public void verifyLoginSuccess(String urlExpected) {
		Assert.assertEquals(urlExpected, this.currentUrl());
	}
}
