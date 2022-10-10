package hangle.demo.cucumber.steps;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import hangle.demo.cucumber.steps.serenity.LoginSteps;
import net.thucydides.core.annotations.Steps;

public class LoginHomePage {
	private String userId = "mngr446198";
	private String pwd = "Evyjyte";
	private String url = "https://demo.guru99.com/v4/manager/Managerhomepage.php";

	@Steps
	LoginSteps loginSteps;

	@Given("^Open Guru page$")
	public void openHomePage() {
		loginSteps.open_home_page();
	}

	@When("^Login Guru page$")
	public void login() {
		loginSteps.login(userId, pwd);
	}

	@Then("^Login success$")
	public void loginSuccess() {
		loginSteps.verifyLoginSuccess(url);
	}

}
