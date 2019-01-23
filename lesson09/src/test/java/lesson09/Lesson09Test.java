package lesson09;
import java.util.ArrayList;
import lesson09.Lesson09;

import org.junit.Assert;
import org.junit.Test;




public class Lesson09Test {
	@Test
	public void Test_GetDupplicate() {
		// Arrange
				int[] fNumber = { 3, 2, 1 };
				int[] sNumber = { 3, 2, 1 };
				Lesson09 MyArray = new Lesson09(fNumber, sNumber);
				// Action
				ArrayList<Integer> val = MyArray.GetDupplicate();
				// Assertion
				 for (int i = 0; i < val.size(); i++) {
				 System.out.println(val.get(i));}
				//int n = val.get(0);
				//Assert.assertEquals(3, n);
			  
				 
				
			
			}
	}


