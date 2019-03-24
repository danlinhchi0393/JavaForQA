package DemoCucumber;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import javax.imageio.spi.RegisterableService;

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

import PageObject.RegisterPage;

public class Stepdefs {
	WebDriver driver;
	RegisterPage register;

	@Before
	public void startWeb() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Driver\\chromedriver.exe");
		this.driver = new ChromeDriver();
		this.register = new RegisterPage(driver);	
	}

	@After
	public void Close_window() {
		this.driver.close();
	}

	    @Given("^The user is staying register page$")
	    public void the_user_is_staying_register_page() throws Throwable {
	    	this.driver.get("https://www.sendo.vn/");
			this.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			this.driver.findElement(By.cssSelector("button#login")).click();
			this.driver.findElement(By.cssSelector("div.guide_2qkn div.register_1ciy")).click();
	    }

	    @When("^The user leave all file are blank and click Next button$")
	    public void the_user_leave_all_file_are_blank_and_click_next_button() throws Throwable {
	        register.InputEmail("").Next();
	    }

	    @Then("^ The user should see the corresponding error message on below input field$")
	    public void the_user_should_see_the_corresponding_error_message_on_below_input_field() throws Throwable {
	    	String errorMess = this.driver.findElement(By.cssSelector("div.form-error p")).getText();
	    	Assert.assertEquals("Vui lòng nhập địa chỉ email hoặc số điện thoại", errorMess);
	    }

}
	