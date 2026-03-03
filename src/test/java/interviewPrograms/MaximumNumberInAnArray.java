package interviewPrograms;

public class MaximumNumberInAnArray {

	public static void main(String[] args) {
		int[] input = { 12, 23, 55, 69, 4, 17, 45, 60, 59 };
		int max1 = Integer.MIN_VALUE;
		int max2 = 0;
		int max3 = 0;
		for (int i = 0; i < input.length; i++) {
			if (input[i] > max1) {
				max3 = max2;
				max2 = max1;
				max1 = input[i];
			} else if (input[i] > max2 && input[i] <max1) {
				max3 = max2;
				max2 = input[i];
			} else if (input[i] > max3 && input[i] < max1 && input[i] < max2) {
				max3 = input[i];
			}
		}

		System.out.println("The maximum number in a array:" + max1);
		System.out.println("The second maximum number in a array:" + max2);
		System.out.println("The third maximum number in a array:" + max3);
	}

}
