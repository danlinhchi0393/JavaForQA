package firstSelenium;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoSelect {
	WebDriver driver;

	@Before
	public void OpenWeb() throws InterruptedException {
		// Go Chrome
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Driver\\chromedriver.exe");
		this.driver = new ChromeDriver();

		// Given
		this.driver.get("https://chocolatey.org/search?q=maven");
	}

	@After
	public void Close_window() {
		this.driver.close();
	}
	
	public void ChooseSelect() {
		Select order = new Select(this.driver.findElement(By.cssSelector("select.sortOrder")));
		}
}
