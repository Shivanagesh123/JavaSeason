package interviewPrograms;

public class Remove_All_NonAlphabetic_Characters_From_String {
	
	public static void main(String[] args) {
		nonAlphabetic("jav28ua");
	}
	public static void nonAlphabetic(String str) {
		String result="";
		for(int i=0;i<str.length();i++) {
			if(Character.isAlphabetic(str.charAt(i))) {
				result=result+str.charAt(i);
			}
	}
		System.out.println(result);
		}
	
}
