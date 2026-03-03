package interviewPrograms;

public class SwappingOfTwoVariablesWithThirdVariable {
	
	public static void main(String[] args) {
		int a=10;
		int b=20;
		int temp;
		System.out.println("The  value of a before swapping:"+a);
		System.out.println("The values of b before swapping:"+b);
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("The value of a after swapping:"+a);
		System.out.println("The value of b after swapping:"+b);
		
	}

}
