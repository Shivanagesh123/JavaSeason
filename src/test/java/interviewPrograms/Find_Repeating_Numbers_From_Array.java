package interviewPrograms;

public class Find_Repeating_Numbers_From_Array {

	public static void main(String[] args) {
		int[] input = { 12, 5, 52, 2, 5, 6, 12, 42, 85, 21, 5 };

		/*
		 * for (int num1 : input) { int count = 0; for (int num2 : input) { if (num1 ==
		 * num2) { count++; } } if (count >= 2) {
		 * System.out.println("The repeated numbers in an array:" + num1); count = 0; }
		 * }
		 */

		for (int i = 0; i < input.length; i++) {
			for (int j = i + 1; j < input.length; j++) {
				if (input[i] == input[j]) {
					System.out.println("The repeating numbers from array:" + input[i]);
					break;
				}

			}

		}

	}
}
