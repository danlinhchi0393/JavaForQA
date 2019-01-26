package BTVN;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;
/*for ( int i = 0; i<20; i+=5)
{
// hanh động
}

while ( i <20) // kiem tra trc, thuc hien sau
{
//hành động
i+=5
}

do
{
//Khối lệnh
//có lệnh thay đổi đk lặp
}
while(dk lặp)

//For làm viec với array
forr ( object
 * 
 */



/*
 * Viết class MyArray với các đặc điểm sau:
 * -Properties:
 *  + int[] Numbers - Lưu trữ một mảng các số nguyên 
 * -Methods:
 *  + MyArray(int[] numbers) - Khởi tạo mảng các số nguyên cho thuộc tính Numbers
 *  + CountNumber(int x) - Đêm số lần xuất hiện phần tử x trong mảng Numbers
 *  + RemoveDupplicateNumber() - Phương thức loại bỏ các phần tử trùng trong mảng Numbers
 *	Viết class Test kiểm thử cho method CountNumber, RemoveDupplicateNumber
 */
public class BTVNLesson05 {
	class MyArray {
	//Khai bao thuoc tinh
public int[] Numbers;

// Khởi tạo mảng các số nguyên cho thuộc tính Numbers
public MyArray(int[] numbers) {
			this.Numbers = numbers;
		}
//Đêm số lần xuất hiện phần tử x trong mảng Numbers
public int CountNumber(int x) {
	int count = 0;
	for (int i = 0; i < Numbers.length; i++) {
		if (Numbers[i]==x) 
			count = count +1;
	}
	return count;	
}
//Phương thức loại bỏ các phần tử trùng trong mảng Numbers
public ArrayList RemoveDupplicateNumber() {
	ArrayList RemoveDupplicateNumber = new ArrayList();
	
	for (int i = 0; i < Numbers.length; i++) {
		if (!RemoveDupplicateNumber.contains(Numbers[i]))
			RemoveDupplicateNumber.add(Numbers[i]);
	}
	return RemoveDupplicateNumber;
}
	}
@Test
public void Test_CountNumber() {
	// Arrange
			int[] numbers = new int[6];
			numbers[0] = 1;
			numbers[1] = 1;
			numbers[2] = 1;
			numbers[3] = 2;
			numbers[4] = 3;
			numbers[5] = 3;

			MyArray myArray = new MyArray(numbers);
	//Action
			int result1 = myArray.CountNumber(1);
			int result2 = myArray.CountNumber(2);
			int result3 = myArray.CountNumber(3);
	// Assert
			Assert.assertEquals(result1, 3);
			Assert.assertEquals(result2, 1);
			Assert.assertEquals(result3, 2);
}
@Test
public void Test_RemoveDupplicateNumber() {
	// Arrange
				int[] numbers = new int[6];
				numbers[0] = 1;
				numbers[1] = 1;
				numbers[2] = 1;
				numbers[3] = 2;
				numbers[4] = 3;
				numbers[5] = 3;

				MyArray myArray = new MyArray(numbers);
		//action		
				ArrayList result = myArray.RemoveDupplicateNumber();
		// Assert
				System.out.println(result);
				Assert.assertEquals(result.size(), 3);
				Assert.assertEquals(result.get(0), 1);
				Assert.assertEquals(result.get(1), 2);
				Assert.assertEquals(result.get(2), 3);
}
}