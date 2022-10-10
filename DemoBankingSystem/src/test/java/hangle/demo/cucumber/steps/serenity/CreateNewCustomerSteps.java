package hangle.demo.cucumber.steps.serenity;

import hangle.demo.cucumber.page.NewCustomerPage;
import net.thucydides.core.steps.ScenarioSteps;

public class CreateNewCustomerSteps extends ScenarioSteps  {
	NewCustomerPage newCustomerPage;
	public void createCustomerPage(String username, String gender, String date, String addr, String city, String state, String pin, String phonenumber, String email, String userPwd) {
		newCustomerPage.openNewCustomerPage();
		newCustomerPage.createNewCustomer(username, gender, date, addr, city, state, pin, phonenumber, email, userPwd);
	}
}
