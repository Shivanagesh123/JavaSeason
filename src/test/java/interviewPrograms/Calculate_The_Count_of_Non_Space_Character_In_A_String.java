package interviewPrograms;

public class Calculate_The_Count_of_Non_Space_Character_In_A_String {
	
	public static void main(String[] args) {
		countNonSpaceCharacter("This is a String");
	}

	
	public static void countNonSpaceCharacter(String str) {
	int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=' ') {
				count++;
			}
		}
		System.out.println(count);
	}
	
}
