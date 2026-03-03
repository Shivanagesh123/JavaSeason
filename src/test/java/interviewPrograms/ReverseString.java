package interviewPrograms;

import java.util.Scanner;

public class ReverseString {
	
	public static void main(String[] args) {
		System.out.println("Enter the input");
		Scanner sc=new Scanner(System.in);
		String input=sc.next();
		reverseString(input);
		sc.close();
	}
	

	
	public static void reverseString(String str) {
		String result="";
		for(int i=str.length()-1;i>=0;i--) {
			result+=str.charAt(i);
		}
		System.out.println("The reverse of a String :"+result);
	}
}
