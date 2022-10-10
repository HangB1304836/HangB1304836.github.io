package hangle.demo.cucumber.steps.serenity;

import java.util.List;

import org.junit.Assert;

import hangle.demo.cucumber.page.NewCustomerPage;
import net.thucydides.core.steps.ScenarioSteps;

public class CreateNewCustomerSteps extends ScenarioSteps  {
	
	NewCustomerPage newCustomerPage;
	
	public void openNewCustomerPage() {
		newCustomerPage.openNewCustomerPage();
	}
	public void createCustomerPage(String username, String gender, String date, String addr, String city, String state, String pin, String phonenumber, String email, String userPwd) {		
		newCustomerPage.createNewCustomer(username, gender, date, addr, city, state, pin, phonenumber, email, userPwd);
	}
	
	public void verifyInfoCust(String customerNameExpected,String phoneExpected,String emailActual) {
		List<Object> ListdetailInfo = newCustomerPage .getInfoNewCustomer();
		System.out.println("Customer ID: "+ListdetailInfo.get(0));
		Assert.assertEquals(customerNameExpected, ListdetailInfo.get(1));
		Assert.assertEquals(phoneExpected, ListdetailInfo.get(2));
		Assert.assertEquals(emailActual, ListdetailInfo.get(3));
	}
}
