package firstSelenium;

import java.util.List;
import java.util.Random;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class AddToCart {
	WebDriver driver;

	@Before
	public void Loginform() throws InterruptedException {
		// Go Chrome
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Driver\\chromedriver.exe");
		this.driver = new ChromeDriver();

		// Given
		this.driver.get("http://maiden.vn/");
		WebElement search = this.driver.findElement(By.cssSelector("input#txtSearchInput"));
		search.sendKeys("Giấy");
		search.sendKeys(Keys.ENTER);
	}

	@After
	public void Close_win() {
		this.driver.close();
	}

	@Test
	public void AddToCart() {
		List<WebElement> listProduct = this.driver.findElements(By.cssSelector("li.product-item"));
		int size = listProduct.size();
		Random rdm = new Random();
		int ItemIndex = rdm.nextInt(size);
		// 4444System.out.print(ItemIndex);
		WebElement item = listProduct.get(ItemIndex);
		// Move mouse to item
		Actions action = new Actions(this.driver);
		action.moveToElement(item).perform();

		item.findElement(By.cssSelector("button.add-to-cart")).click();
		WebDriverWait wait = new WebDriverWait(this.driver, 10);
		WebElement qty = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.qty-input")));

		// WebElement qty = this.driver.findElement(By.cssSelector("input.qty-input"));
		qty.sendKeys("10");
		this.driver.findElement(By.cssSelector("button.btn-update-qty")).click();
		qty.clear();
		qty.sendKeys("5");
		this.driver.findElement(By.cssSelector("button.btn-update-qty")).click();
		this.driver.findElement(By.cssSelector("a.mybtn-purchase")).click();
		String result = this.driver.findElement(By.cssSelector("input.cart-product-item-cell-qty-select"))
				.getAttribute("value");
		System.out.print(result);
		Assert.assertEquals("5", result);
	}

}
