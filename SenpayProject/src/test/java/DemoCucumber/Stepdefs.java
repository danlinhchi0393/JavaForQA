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

import PageObject.LoginPage;

public class Stepdefs {
	WebDriver driver;
    LoginPage loginpage;
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
		this.driver.get("http://senpay.vn");
		this.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		this.driver.findElement(By.cssSelector("a#btnLogin")).click();
	}


    @When("^The user input valid phone number and The user click Next butotn$")
	    public void the_user_input_valid_phone_number_the_user_click_next_butotn() throws Throwable {
    	loginpage.InputPhone("0374441716").Next();
	        
	    }
    @When("^The user input valid pincode and The user click Login button$")
    public void the_user_input_valid_pincode_and_the_user_click_login_button() throws Throwable {
      loginpage.InputPin("123456");
    }

    @Then("^ The user should see homepage$")
    public void the_user_should_see_homepage() throws Throwable {
	    		Assert.assertEquals("SenPay :: Trang Chủ", this.driver.getTitle());
	    }
}