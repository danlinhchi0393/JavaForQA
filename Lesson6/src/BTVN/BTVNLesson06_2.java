package BTVN;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class BTVNLesson06_2 {
	/*
	 * Viết class MyNumber với các thuộc tính int[] ListNumber - Lưu trữ một danh
	 * sách các số được khởi tạo qua constructor Methods: - MyNumber(int[] number) -
	 * Khởi tạo giá trị cho thuộc tính ListNumber - GetMinNumber() - Trả ra giá trị
	 * nhỏ nhất trong ListNumber - GetMaxNumber() - Trả ra giá trị lớn nhất trong
	 * ListNumber - GetDistanceMinMax() - Đưa ra các số nằm giữa Min và Max Viết
	 * test cho 3 methods GetMinNumber, GetMaxNumber, GetDistanceMinMax
	 */
	class MyNumber {
		public int[] ListNumber;

		// Ham khoi tao
		public MyNumber(int[] numbers) {
			this.ListNumber = numbers;
		}

		// Ham sap sep tang dan
		public int[] OrderList() {
			int temp = ListNumber[0];
			for (int i = 0; i < ListNumber.length - 1; i++) {
				for (int j = i + 1; j < ListNumber.length; j++) {
					if (ListNumber[i] > ListNumber[j]) {
						temp = ListNumber[j];
						ListNumber[j] = ListNumber[i];
						ListNumber[i] = temp;
					}
				}
			}
			return ListNumber;
		}
		
		public int GetMinNumber() {
			int[] Min = OrderList();
			return Min[0];
		}
		public int GetMaxNumber() {
			int[] Max = OrderList();
			return Max[Max.length-1];
		}
		public ArrayList<Integer> GetDistanceMinMax() {
		int[] MinMax = OrderList();
		ArrayList<Integer> DistanceMinMax = new ArrayList<Integer>();
		for (int i=1;i<=MinMax.length-2;i++) {
			DistanceMinMax.add(MinMax[i]);
		}
		return DistanceMinMax;
	}
	}
		/*@Test
		public void Test_OrderList() {
			// Arrange
			int[] originalNumber = { 3, 2, 1 };

			MyNumber iamahero = new MyNumber(originalNumber);

			// Action
			int[] val = iamahero.OrderList();

			for (int i = 0; i < val.length; i++) {
				System.out.println(val[i]);
			}
		}*/
	@Test
	public void Test_GetMinNumber() {
		// Arrange
					int[] originalNumber = { 3, 2, 1 };

					MyNumber myNum = new MyNumber(originalNumber);

					// Action
					 int val = myNum.GetMinNumber();
					// Assertion
					 Assert.assertEquals(1, val);
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
					//		System.out.println(val.get(i));
					//	}
					Assert.assertEquals(2,val.get(0));
	}
	}

