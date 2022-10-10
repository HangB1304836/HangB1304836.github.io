package hangle.demo.cucumber.steps.serenity;

import hangle.demo.cucumber.page.NewCustomerPage;
import net.thucydides.core.steps.ScenarioSteps;

public class CreateNewCustomerSteps extends ScenarioSteps  {
	NewCustomerPage newCustomerPage;
	public void createCustomerPage(String username, String gender) {
		newCustomerPage.openNewCustomerPage();
		newCustomerPage.createNewCustomer(username, gender);
	}
}
