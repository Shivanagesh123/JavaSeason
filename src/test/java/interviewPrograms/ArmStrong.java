package interviewPrograms;

public class ArmStrong {
	
	public static void main(String[] args) {
		armstrong(23);
	}
    
	
	public static void armstrong(int num) {
		int original=num;
		int length=String.valueOf(num).length();
		int sum=0;
		while(num>0) {
			int remainder=num%10;
			sum+=Math.pow( remainder,length);
			num/=10;
		}
		if(original==sum) {
			System.out.println("The given number armstrong");
		}
		else {
			System.out.println("The given number is not armstrong");
		}
	}
}
