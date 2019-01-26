package string;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Random;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
	String[] arrName = { "Nguyen Thu Huong", "Nguyen Thi Thu", "Nguyen Thi Thuy", "Tran Van Hung", "Phan Quoc Huy" };

	@Test
	public void shouldAnswerWithTrue() {
		Random rnd = new Random();
		// List để lưu trữ 10 sinh viên
		ArrayList<Student> lstStudent = new ArrayList<Student>();

		// Sinh 10 sinh viên ngẫu nhiên
		for (int i = 0; i < 10; i++) {
			int randomNameIndex = rnd.nextInt(arrName.length);
			Student s = new Student();
			s.Hovaten = arrName[randomNameIndex];
			s.DTB = rnd.nextInt(10);

			lstStudent.add(s);
		}

		// Test
		for (Student sv : lstStudent) {
			if (sv.DTB >= 8 && sv.Hovaten.startsWith("Nguyen")) {
				System.out.println(sv.Hovaten);
				System.out.println(sv.DTB);
				System.out.println("--");
			}
		}
	}
}