package hangle.demo.cucumber.page;

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

	public void openNewCustomerPage() {
		newCustomerPage.click();
	}
	
	public void createNewCustomer(String username, String gender) {
		name.sendKeys(username);
		if (gender.equalsIgnoreCase("male")){
			isMale.click();
		}else
			isFemale.click();
		//select date
		selectDate.click();
	}
}
