package javaforQA;

import java.util.ArrayList;
import java.util.Random;

import org.junit.Test;
import javaforQA.WebElement;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class WebElementTests {
	String[] tagArr = { "p", "a", "span", "button", "input", "table", "td", "tr" };

	@Test
	public void shouldAnswerWithTrue() {
		Random rnd = new Random();
		// List để lưu trữ 10 WebElement
		ArrayList<WebElement> lstElement = new ArrayList<WebElement>();
		
		//Sinh 10 WebElement
		for ( int i=0;i<10;i++) {
			int randomIndex = rnd.nextInt(tagArr.length);
			WebElement e = new WebElement();
			e.Tag = tagArr[randomIndex];
			lstElement.add(e);
		}
		
		//Test
		int count = 0;
		for (WebElement sv : lstElement) {
			if ((sv.equals("button")) || (sv.equals("p")) || (sv.equals("span"))) {
				count = count+1;
				System.out.println(count);
				
			}
		}
		
	}
}
