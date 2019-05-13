package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
By txtPhone = By.cssSelector("input[type = tel]");
By txtPincode = By.cssSelector("input[type = tel]");
By btnNext = By.cssSelector("button[type = submit]");
By btnLogin = By.cssSelector("");
public LoginPage(WebDriver driver) {
	this.driver = driver;
}
public LoginPage InputPhone(String phone) {
	this.driver.findElement(txtPhone).sendKeys(phone);
	return this;
}
public LoginPage InputPin(String pin) {
	this.driver.findElement(txtPincode).sendKeys(pin);
	return this;
}
public void Next() {
	this.driver.findElement(btnNext).submit();
}
public void Login() {
	this.driver.findElement(btnLogin).submit();
}
}
