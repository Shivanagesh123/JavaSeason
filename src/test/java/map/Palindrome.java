package map;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1(151);
	}

	public static void m1(int num) {
		int original = num;
		int rev=0;
		while(num>0) {
			rev=rev*10+num%10;
			num/=10;
		}
		System.out.println(rev);
		if(rev==original) {
			System.out.println("The given number "+original+" is palindrome");
		}
		}}


