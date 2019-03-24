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
		this.driver.get("https://www.thegioididong.com");
		WebElement search = this.driver.findElement(By.cssSelector("input#search-keyword"));
		search.sendKeys("iphone");
		search.sendKeys(Keys.ENTER);
		List<WebElement> listProduct = this.driver.findElements(By.cssSelector("li.cat42"));
		int size = listProduct.size();
		Random rdm = new Random();
		int ItemIndex = rdm.nextInt(1);
		
		WebElement item = listProduct.get(ItemIndex);
		// Move mouse to item
		Actions action = new Actions(this.driver);
		action.moveToElement(item).perform();
		item.click();
		
		//chon Mua ngay
		WebDriverWait wait = new WebDriverWait(this.driver, 10);
		WebElement buynow = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div#normalproduct div.area_order a")));
		buynow.click();
	}

	//@After
	//public void Close_win() {
	//	this.driver.close();
	//}

	@Test
	public void CheckAddress() {
		//chon dia chi giao hang
		this.driver.findElement(By.cssSelector("div.address ")).click();
		//this.driver.findElement(By.cssSelector("div.firstaddress div.city")).click();
		WebDriverWait wait = new WebDriverWait(this.driver, 10);
		WebElement listcity = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.firstaddress div.city")));
		listcity.click();
		WebElement itemHN = this.driver.findElement(By.cssSelector("div.firstaddress a[data-value='5']"));
		Actions action = new Actions(this.driver);
		action.moveToElement(itemHN).perform();
		itemHN.click();
		
		//WebDriverWait wait1 = new WebDriverWait(this.driver, 10);
		//WebElement district = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.firstaddress div.dist")));
		//district.click();
	}
	/*@Test
	public void Check_Cathe() {
		this.driver.findElement(By.cssSelector("div.address")).click();
		this.driver.findElement(By.cssSelector("label.cathe i")).click();
	}*/

}
