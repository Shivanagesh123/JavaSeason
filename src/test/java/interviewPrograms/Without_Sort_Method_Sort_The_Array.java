package interviewPrograms;

import java.util.Arrays;

public class Without_Sort_Method_Sort_The_Array {

	public static void main(String[] args) {
		int[] input = { 5, 8, 2, 4, 3, 9 };
		for (int i = 0; i < input.length; i++) {
			for (int j = i + 1; j < input.length; j++) {
				if (input[i] > input[j]) {
					int temp = input[i];
					input[i] = input[j];
					input[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(input));
	}

}
