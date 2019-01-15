package BTVN;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

/*
 * Tạo một class là MyNumber với các thuộc tính
 * int[] Numbers;
 * 
 * Phương thức
 * - MyNumber(int[] numbers) - Khởi tạo giá trị cho thuộc tính Numbers
 * - GetMyNumber() - Trả ra những giá trị là số nguyên tố và không bị trùng trong mảng Numbers
 * - GetTotal() - Trả ra tổng tất cả các giá trị số nguyên tố chẵn vừa tìm được.
 * - GetLuckyNumber() - Tìm xem có số nguyên tố nào trong mảng Numbers có giá trị bằng tổng 02 số nt liền trước không? 
 */
public class BTVNLesson06 {
	class MyNumber {
		// Khai bao thuoc tinh
		public int[] Numbers;

// Khởi tạo mảng các số nguyên cho thuộc tính Numbers
		public MyNumber(int[] numbers) {
			this.Numbers = numbers;
		}

//Hàm check số nguyên tố
		public boolean IsPrrime(int number) {
			boolean result = true;
			for (int i = 2; i < number; i++) {
				if (number % i == 0) {
					result = false;
					break;
				}
			}
			return result;
		}

//Trả ra những giá trị là số nguyên tố 
		public ArrayList<Integer> GetPrimeNumbers() {
			ArrayList<Integer> ListPrimeNumbers = new ArrayList<Integer>();
			for (int i = 0; i <= Numbers.length; i++) {
				if (IsPrrime(Numbers[i]))
					ListPrimeNumbers.add(Numbers[i]);
			}
			return ListPrimeNumbers;
		}

		public ArrayList<Integer> GetMyNumber() {
			ArrayList<Integer> GetMyNumber = new ArrayList<Integer>();
			ArrayList<Integer> listPrimeNumbers = GetPrimeNumbers();

			for (int i = 0; i < listPrimeNumbers.size(); i++) {
				boolean IsDuplicate = false;
				int CurNumber = listPrimeNumbers.get(i);
				for (int j = 0; j < listPrimeNumbers.size(); j++) {
					int checkNumber = listPrimeNumbers.get(j);
					if (CurNumber == checkNumber && i != j) {
						IsDuplicate = true;
						break;
					}
				}

				if (IsDuplicate = false)
					GetMyNumber.add(listPrimeNumbers.get(i));

			}
			return GetMyNumber;
		}

	}

	@Test
	public void Test_GetMyNumber() {
		// Arrange
		int[] Numbers = {1,2,2,3,3,5,6,7,5};
		MyNumber myNum = new MyNumber(Numbers);
		// Action
		ArrayList<Integer> GetMyNumber = myNum.GetPrimeNumbers();
		// Assertion
		for (int i = 0; i < GetMyNumber.size(); i++) {
			System.out.println(GetMyNumber.get(i));
	}

}
}