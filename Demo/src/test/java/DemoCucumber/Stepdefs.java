package DemoCucumber;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Stepdefs {
	WebDriver driver;

	@Before
	public void startWeb() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Driver\\chromedriver.exe");
		this.driver = new ChromeDriver();
	}

	@After
	public void Close_window() {
		this.driver.close();
	}

	@Given("^The user is staying login page$")
	public void the_user_is_staying_login_page() throws Throwable {

		this.driver.get("http://testmaster.vn/admin");
		this.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@When("^The user input invalid (.+) and (.+) The user click Login butotn$")
	public void the_user_input_invalid_and_the_user_click_login_butotn(String email, String pass) throws Throwable {
		this.driver.findElement(By.cssSelector("input[type=email]")).sendKeys(email);
		this.driver.findElement(By.cssSelector("input[type=password]")).sendKeys(pass);
		this.driver.findElement(By.cssSelector("button.btn-login")).click();
		WebDriverWait wait = new WebDriverWait(this.driver, 10);
		WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.alert")));
	}

	@Then("^ The user should see the popup error message$")
	public void the_user_should_see_the_popup_error_message() throws Throwable {
		WebElement message1 = this.driver.findElement(By.cssSelector("div.body-message b"));
		WebElement message2 = this.driver.findElement(By.cssSelector("div.body-message i"));
		// System.out.print(message1.getText());
		Assert.assertEquals("Tên đăng nhập hoặc Mật khẩu không đúng.", message1.getText());
		Assert.assertEquals("Chú ý: Mật khẩu có độ dài >6 ký tự và chỉ chứa chữa hoa, chữ thường và số",
				message2.getText());
	}

}