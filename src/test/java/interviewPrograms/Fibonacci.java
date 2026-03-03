package interviewPrograms;

public class Fibonacci {

	public static void main(String[] args) {
		System.out.print(first + " " + second);
		fibonacci(10);
	}

	static int first = 0;
	static int second = 1;

	public static void fibonacci(int num) {

		for (int i = 3; i <= num; i++) {
			int sum = first + second;
			System.out.print(" " + sum);
			first = second;
			second = sum;
		}
	}
}
