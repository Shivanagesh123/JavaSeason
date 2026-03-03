package interviewPrograms;

public class SwappingOfTwoVariablesWithoutThirdVariable {

	public static void main(String[] args) {
		int a = 50;
		int b = 100;
		System.out.println("The value of 'a' before swapping:" + a);
		System.out.println("The value of 'b' after swapping:" + b);
		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("The value of 'a' after swapping:" + a);
		System.out.println("The value of 'b' after swapping:" + b);
	}
}
