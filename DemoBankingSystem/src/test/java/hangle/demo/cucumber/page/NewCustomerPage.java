package hangle.demo.cucumber.page;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://demo.guru99.com/v4/")
public class NewCustomerPage extends PageObject {
	@FindBy(xpath = "//a[text()='New Customer']")
	WebElement newCustomerPage;
	@FindBy(name = "name")
	WebElement name;
	@FindBy(xpath = "//tr[5]/td[2]/input[1]")
	WebElement isMale;
	@FindBy(xpath = "//tr[5]/td[2]/input[2]")
	WebElement isFemale;
	@FindBy(id = "dob")
	WebElement selectDate;
	@FindBy(name = "addr")
	WebElement address;
	@FindBy(name = "city")
	WebElement addrCity;
	@FindBy(name = "state")
	WebElement addrState;
	@FindBy(name = "pinno")
	WebElement pinno;
	@FindBy(name = "telephoneno")
	WebElement telephoneno;
	@FindBy(name = "emailid")
	WebElement emailid;
	@FindBy(name = "password")
	WebElement password;
	@FindBy(name = "sub")
	WebElement sub;
	@FindBy(xpath = "//*[@id=\"customer\"]/tbody/tr[4]/td[2]")
	WebElement customerId;
	
	@FindBy(xpath = "//*[@id=\"customer\"]/tbody/tr[5]/td[2]")
	WebElement customerName;
	@FindBy(xpath = "//*[@id=\"customer\"]/tbody/tr[12]/td[2]")
	WebElement phonenumber;
	@FindBy(xpath = "//*[@id=\"customer\"]/tbody/tr[13]/td[2]")
	WebElement email;
	
	public void openNewCustomerPage() {
		newCustomerPage.click();
	}
	
	public void createNewCustomer(String username, String gender, String date, String addr, String city, String state, String pin, String phonenumber, String email, String userPwd) {
		name.sendKeys(username);
		if (gender.equalsIgnoreCase("male")){
			isMale.click();
		}else	
			isFemale.click();
		selectDate.sendKeys(date);
		address.sendKeys(addr);
		addrCity.sendKeys(city);
		addrState.sendKeys(state);
		pinno.sendKeys(pin);
		telephoneno.sendKeys(phonenumber);
		emailid.sendKeys(email);
		password.sendKeys(userPwd);
		//submit
		sub.click();	
	}
	
	public List<Object> getInfoNewCustomer() {
		String customerID = customerId.getText();
		String customerNameActual = customerName.getText();
		String phoneActual = phonenumber.getText();
		String emailActual = email.getText();
		return Arrays.asList(customerID,customerNameActual,phoneActual,emailActual);
	}
}
