package hangle.demo.cucumber.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://demo.guru99.com/v4/")
public class HomePage extends PageObject {
	@FindBy(name = "uid")
	WebElement user;
	@FindBy(name = "password")
	WebElement password;
	@FindBy(name = "btnLogin")
	WebElement loginButton;

	public void login(String userId, String pwd) {
		user.sendKeys(userId);
		password.sendKeys(pwd);
		loginButton.click();
	}
}
