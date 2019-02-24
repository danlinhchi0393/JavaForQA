package firstSelenium;

import java.awt.Dimension;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;

/**
 * Unit test for simple App.
 */
public class AppTest {
	WebDriver driver;

	@Test
	public void shouldAnswerWithTrue() {
		// Go Chrome
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Driver\\chromedriver.exe");
		this.driver = new ChromeDriver();

		// go Firefox
		// System.setProperty("webdriver.gecko.driver","C:\\Users\\Driver\\geckodriver.exe");
		// this.driver = new FirefoxDriver();
		/*
		 * // Given this.driver.get("https://senpay.vn");
		 * 
		 * // When WebElement login =
		 * this.driver.findElement(By.cssSelector("a#btnLogin"));
		 * login.sendKeys(Keys.ENTER);
		 * 
		 * // Then
		 * 
		 * WebElement lbResult =
		 * this.driver.findElement(By.cssSelector("input[type=tel]"));
		 * Assert.assertEquals(lbResult!=null, true);
		 */
		// Given
		this.driver.get("http://maiden.vn/");

		// When
		WebElement search = this.driver.findElement(By.cssSelector("input#txtSearchInput"));
		search.sendKeys("Giấy");
		search.sendKeys(Keys.ENTER);
		// Then

		List<WebElement> listProduct = this.driver.findElements(By.cssSelector("li.product-item"));
		int result = listProduct.size();
		Assert.assertEquals(20, result);
		
		
		boolean reusultCheckName = true;
		for ( int i=0; i< listProduct.size(); i++ ) {
			boolean checkName = listProduct.get(i).getText().toLowerCase().contains("giấy") ;
			if (checkName = false) {
				break;
			}	
		}
		Assert.assertEquals(true, reusultCheckName);
		this.driver.close();
	}
}
