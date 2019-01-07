package BTVN04;

import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;

public class MyNumber {
	public int number;

//khởi tạo cho thuộc tính number
	public MyNumber(int n) {
		this.number = n;
	}

//Trả ra danh sách tất cả các số chẵn nhỏ hơn number
	public ArrayList Get_Sochan() {
		ArrayList ListSochan = new ArrayList();
		for (int i = 0; i < number; i++) {
			if (i % 2 == 0)
				ListSochan.add(i);
		}
		return ListSochan;
	}

//Trả ra danh sách tất cả các số lẻ nhỏ hơn number
	public ArrayList Get_Sole() {
		ArrayList ListSole = new ArrayList();
		for (int i = 0; i < number; i++) {
			if (i % 2 == 1)
				ListSole.add(i);
		}
		return ListSole;
	}
@Test
public void Test_Get_Sochan() {
	// Arrange
	int n = 10;
	MyNumber number = new MyNumber(n);

	// action
	ArrayList result = Get_Sochan();

	// Assert
	Assert.assertEquals(result.size(), 5);
	Assert.assertEquals(result.get(0), 0);
	Assert.assertEquals(result.get(1), 2);
	Assert.assertEquals(result.get(2), 4);
}
@Test
public void Test_Get_Sole() {
	// Arrange
	int n = 10;
	MyNumber number = new MyNumber(n);

	// action
	ArrayList result = Get_Sole();

	// Assert
	Assert.assertEquals(result.size(), 5);
	Assert.assertEquals(result.get(0), 1);
	Assert.assertEquals(result.get(1), 3);
	Assert.assertEquals(result.get(2), 5);
}
}
