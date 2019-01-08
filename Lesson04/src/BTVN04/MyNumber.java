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
	
//Trả ra một danh sách gồm tổng các số chẵn lẻ ở 
//	   vị trí tương ứng	
	public ArrayList get_SoTongHop() {
		ArrayList ListSochan = Get_Sochan();
		ArrayList ListSole = Get_Sole();
		ArrayList ListSotonghop = new ArrayList();
		for(int i = 0; i <=ListSochan.size();i++) {
			int SumIndex= i;
			int sum = (int)ListSole.get(i) + (int) ListSochan.get(i);
			ListSotonghop.add(sum);
		}
		return ListSotonghop;
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

@Test
public void Test_get_SoTongHop() {
	// Arrange
	int n = 10;
	MyNumber number = new MyNumber(n);

	// action
	ArrayList result = get_SoTongHop();

	// Assert
	Assert.assertEquals(result.size(), 5);
	Assert.assertEquals(result.get(0), 1);
	Assert.assertEquals(result.get(1), 5);
	Assert.assertEquals(result.get(2), 9);
}
}
