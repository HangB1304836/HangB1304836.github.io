package hangle.demo.cucumber.steps;

import org.junit.Assert;

import hangle.demo.cucumber.steps.serenity.CreateNewCustomerSteps;
import hangle.demo.cucumber.steps.serenity.LoginSteps;
import io.cucumber.java.en.Given;
import net.thucydides.core.annotations.Steps;

public class CreateNewCustomer {
	private String userId = "mngr446198";
	private String pwd = "Evyjyte";
	private String url = "https://demo.guru99.com/v4/manager/Managerhomepage.php";
	private String username = "Hang Le";
	private String gender = "Femail";

	@Steps
	LoginSteps loginSteps;
	
	@Steps
	CreateNewCustomerSteps createNewCustomerStep;

	@Given("^Open New Customer Page$")
	public void openAddNewCustomerPage() {
		loginSteps.open_home_page();
		loginSteps.login(userId, pwd);
		createNewCustomerStep.createCustomerPage(username, gender);
	}
}
