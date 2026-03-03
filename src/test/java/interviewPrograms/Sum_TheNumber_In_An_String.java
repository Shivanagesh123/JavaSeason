package interviewPrograms;

public class Sum_TheNumber_In_An_String {
	
	public static void main(String[] args) {
		sumOfNumberInString("as23&*$%27,.");
	}

	public static void sumOfNumberInString(String str) {
		char[] ch=str.toCharArray();
		int sum=0;
		for(int i=0;i<ch.length;i++) {
			if(Character.isDigit(ch[i])) {
				//sum+=Character.getNumericValue(ch[i]);
				sum+=ch[i]-'0';
				System.out.println("sum:"+sum);
			}
		}
		System.out.println("Sum of the digits in a String:"+sum);
	}
}
