package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
	WebDriver driver;
//By btnLogin = By.cssSelector("button#login");
//By btnRegisterPopup = By.cssSelector("div.guide_2qkn div.register_1ciy");
By txtEmail = By.cssSelector("input[name = username]");
By btnNext = By.cssSelector("div.block-form button.orange");

public RegisterPage(WebDriver driver) {
	this.driver = driver;
}
public RegisterPage InputEmail(String email) {
	this.driver.findElement(txtEmail).sendKeys(email);
	return this;
}
public void Next() {
	this.driver.findElement(btnNext).submit();
}
public RegisterPage ShowPopupRegister() {
	
}
}
