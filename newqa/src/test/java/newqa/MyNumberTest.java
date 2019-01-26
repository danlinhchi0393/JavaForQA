package newqa;

import java.util.ArrayList;

import org.junit.Test;

import junit.framework.Assert;
import newqa.MyNumber;

/**
 * Unit test for simple App.
 */
public class MyNumberTest {
    @Test
	public void Test_GetMinNumber() {
		// Arrange

		int[] originalNumber = { 3, 2,2,3,4,5,6 };

		MyNumber myNum = new MyNumber(originalNumber);

		// Action
		int val = myNum.GetMinNumber();
		// Assertion
		Assert.assertEquals(2, val);
	}
    @Test
	public void Test_GetMaxNumber() {
		// Arrange
		int[] originalNumber = { 3, 2, 1 };

		MyNumber myNum = new MyNumber(originalNumber);

		// Action
		int val = myNum.GetMaxNumber();
		// Assertion
		Assert.assertEquals(3, val);
	}
    @Test
	public void Test_GetDistanceMinMax() {
		// Arrange
		int[] originalNumber = { 3, 2, 1 };

		MyNumber myNum = new MyNumber(originalNumber);

		// Action
		ArrayList<Integer> val = myNum.GetDistanceMinMax();
		// Assertion
		// for (int i = 0; i < val.size(); i++) {
		// System.out.println(val.get(i));
		// }
		int n = val.get(0);
		Assert.assertEquals(2, n);
	}
}
