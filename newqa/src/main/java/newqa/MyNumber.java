package newqa;

import java.util.ArrayList;

public class MyNumber {
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
			return Max[Max.length - 1];
		}

		public ArrayList<Integer> GetDistanceMinMax() {
			int[] MinMax = OrderList();
			ArrayList<Integer> DistanceMinMax = new ArrayList<Integer>();
			for (int i = 1; i <= MinMax.length - 2; i++) {
				DistanceMinMax.add(MinMax[i]);
			}
			return DistanceMinMax;
		}
	}

