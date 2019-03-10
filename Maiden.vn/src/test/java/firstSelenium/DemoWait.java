package firstSelenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class DemoWait {
	WebDriver driver;

	@Before
	public void OpenWeb() throws InterruptedException {
		// Go Chrome
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Driver\\chromedriver.exe");
		this.driver = new ChromeDriver();

		// Given
		this.driver.get("http://testmaster.vn/admin");
	}

	@After
	public void Close_window() {
		this.driver.close();
	}

	@Test
	public void Test_Login_with_user_not_exists() {
		this.driver.findElement(By.cssSelector("input[type=email]")).sendKeys("chindl@sendo.vn");
		this.driver.findElement(By.cssSelector("input[type=password]")).sendKeys("123456");
		this.driver.findElement(By.cssSelector("button.btn-login")).click();

		WebDriverWait wait = new WebDriverWait(this.driver, 10);
		WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.alert")));

		WebElement message1 = this.driver.findElement(By.cssSelector("div.body-message b"));
		WebElement message2 = this.driver.findElement(By.cssSelector("div.body-message i"));
		// System.out.print(message1.getText());
		Assert.assertEquals("Tên đăng nhập hoặc Mật khẩu không đúng.", message1.getText());
		Assert.assertEquals("Chú ý: Mật khẩu có độ dài >6 ký tự và chỉ chứa chữa hoa, chữ thường và số",
				message2.getText());
	}
@Test
	public void Test_Login_with_user_correct() {
		this.driver.findElement(By.cssSelector("input[type=email]")).sendKeys("khanh.tx@live.com");
		this.driver.findElement(By.cssSelector("input[type=password]")).sendKeys("abc123");
		this.driver.findElement(By.cssSelector("button.btn-login")).click();

		WebDriverWait wait = new WebDriverWait(this.driver, 10);
		WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("header.main-header")));
		
		String title = this.driver.getTitle();
		Assert.assertEquals("Home Page - Testmaster.vn", title);
 
		
	}

}
