package firstSelenium;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import junit.framework.Assert;

/**
 * Unit test for simple App.
 */
public class AppTest {
	WebDriver driver;
@Before
	public void Loginform() throws InterruptedException {
	// Go Chrome
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Driver\\chromedriver.exe");
			this.driver = new ChromeDriver();

			// Given
			this.driver.get("http://maiden.vn/");
	        Thread.sleep(2000);
			// When
			WebElement Close = this.driver.findElement(By.cssSelector("a.close-tannm-modal"));
			Close.click();
			Thread.sleep(2000);
			WebElement Login = this.driver.findElement(By.cssSelector("div.header-user"));
			Login.click();
}
@After
public void Close_win() {
	this.driver.close();
}
	@Test
	public void Check_tooltip_when_leave_emai_pass(){
		WebElement LoginButton = this.driver.findElement(By.cssSelector("button.btn-signin"));
		LoginButton.click();
		
		//Login với blank value -> Show tooltip error trên các control tương ứng
		String Tooltip = this.driver.findElement(By.cssSelector("input#inputEmail")).getAttribute("data-original-title");
		System.out.print(Tooltip);
		Assert.assertEquals("Tên đăng nhâp/Email không thể để trống.", Tooltip);
	}
	@Test
		public void Check_popup_when_input_invalid_email_pass() throws InterruptedException {
			WebElement LoginButton = this.driver.findElement(By.cssSelector("button.btn-signin"));
			WebElement InputEmail = this.driver.findElement(By.cssSelector("input#inputEmail"));
			InputEmail.sendKeys("123@gnmail.com");
			WebElement InputPass = this.driver.findElement(By.cssSelector("input#inputPassword"));
			InputPass.sendKeys("123");
			LoginButton.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			//Then
			WebElement Popup = this.driver.findElement(By.cssSelector("span.notify-text"));
			String result = Popup.getText();
			Assert.assertEquals("Tên đăng nhập hoặc mật khẩu không hợp lệ. Vui lòng kiểm tra lại", result);
		}
	}


