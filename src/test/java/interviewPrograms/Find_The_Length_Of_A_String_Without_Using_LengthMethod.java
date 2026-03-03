package interviewPrograms;

public class Find_The_Length_Of_A_String_Without_Using_LengthMethod {

	public static void main(String[] args) {
		lengthOfString("selenium ");
	}

	public static void lengthOfString(String str) {
     int count=0;
		for(int i=0;i<str.length();i++) {
			if(Character.isLetter(str.charAt(i))||!Character.isDigit(str.charAt(i))) {
				count++;
			}
		}
		System.out.println(count);
	}

}
