package interviewPrograms;

public class First_Non_Repeated_Character_In_String {

	
	public static void main(String[] args) {
		nonrepeated("anagram");
	}
	public static void nonrepeated(String str) {
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(str.indexOf(ch)==str.lastIndexOf(ch)) {
				System.out.println(ch+ ":is the first non repeated Character in String");
				break;
			}
		}
		
	}
}
