package interviewPrograms;

public class FactorialOfANumber {
	
	public static void main(String[] args) {
		m1(5);
	}
   
	public static void m1(int num) {
		
		
		int num1=1;
		for(int i=1;i<=num;i++) {
			num1=num1*i;
					}
		
		System.out.println(num1);
	}
}
