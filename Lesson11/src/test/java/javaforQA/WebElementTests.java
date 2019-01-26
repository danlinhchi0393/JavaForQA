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
			e.Text = "Chi co vu Viet Nam Vo Dich";
			lstElement.add(e);
		}
		
		//Test
		int countSpan = 0;
		int countButton = 0;
		int countP = 0;
		for (WebElement el : lstElement) {
			if (el.Tag.equals("button")) {
				countP = countButton+1;	
			}
			else if (el.Tag.equalsIgnoreCase("span")) {
				countSpan = countSpan+1;
			}
			else if ( el.Tag.equalsIgnoreCase("p")) {
				countP = countP+1;
			}
				
		}
		System.out.println ("Button" + countButton + " Span" + countSpan + " p" + countP );
		for (WebElement el : lstElement) {
			if (el.getText().contains("Viet Nam Vo Dich")) {
				System.out.println (el.Text);
			}
		}
	}
}
