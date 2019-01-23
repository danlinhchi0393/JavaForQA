package lesson09;

import java.util.ArrayList;

/* Viết class Lesson09 với các thông tin sau:
	 * -Thuộc tính
	 * + int[] FirstNumber
	 * + int[] SecondNumber
	 * 
	 * -Phương thức
	 * + Lesson09(int[] fNumber, int[] sNumber) - Khởi tạo cho 2 thuộc tính
	 * + GetDupplicate() - Trả ra tất cả các giá trị xuất hiện ở cả 2 mảng FirtNumber và SecondNumber
	 * Viết Test cho method GetDupplicate();
*/
public class Lesson09 {
		int[] FirstNumber;
		int[] SecondNumber;
	public Lesson09(int[] fNumber, int[] sNumber) {
		this.FirstNumber = fNumber;
		this.SecondNumber = sNumber;
	}
	public ArrayList<Integer> GetDupplicate() {
		ArrayList<Integer> ArrayDupplicate = new ArrayList<Integer>();
		for ( int i = 0; i<=FirstNumber.length;i++) {
			int curNum = FirstNumber[i];
			for ( int j=0;j<=SecondNumber.length;j++) {
				if (curNum == SecondNumber[j]) {
					ArrayDupplicate.add(curNum);
					break;
				}
			}
		}
		return ArrayDupplicate;
	}
	
}