package hangle.demo.cucumber.steps;

import org.apache.commons.lang3.RandomStringUtils;

import hangle.demo.cucumber.steps.serenity.CreateNewCustomerSteps;
import hangle.demo.cucumber.steps.serenity.LoginSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CreateNewCustomer {
	private String userId = "mngr446198";
	private String pwd = "Evyjyte";
	private String url = "https://demo.guru99.com/v4/manager/Managerhomepage.php";
	private String username = "Hang Le";
	private String gender = "Femail";
	private String date = "09092000";
	private String addr = "Le Van Sy";
	private String city = "Ho Chi Minh";
	private String state = "Phu Nhuan";
	private String pin = "000000";
	private String phonenumber = "0123456789";
	private String email = RandomStringUtils.randomAlphabetic(10) + "@gmail.com";
	private String userPwd = "123456";

	@Steps
	LoginSteps loginSteps;
	
	@Steps
	CreateNewCustomerSteps createNewCustomerStep;

	@Given("^Open New Customer Page$")
	public void openAddNewCustomerPage() {
		loginSteps.open_home_page();
		loginSteps.login(userId, pwd);
		createNewCustomerStep.openNewCustomerPage();
	}
	
	@When("Create New Customer")
	public void createNewCustomer() {
		createNewCustomerStep.createCustomerPage(username, gender, date, addr, city, state, pin, phonenumber, email, userPwd);
	}
	
	@Then("^Customer created successfully")
	public void VerifyInfoDetailCustomer(){
		createNewCustomerStep.verifyInfoCust(username, phonenumber, email);
	}
}
