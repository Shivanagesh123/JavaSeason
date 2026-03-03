package interviewPrograms;

public class Remove_Numbers_In_A_String {
	
	public static void main(String[] args) {
		removeNumbersInString("ja2va658kssh9");
	}

	public static void removeNumbersInString(String str) {
		String res="";
		for(char ch:str.toCharArray()) {
			if(Character.isLetter(ch)) {
				res=res+ch;
			}
		}
		System.out.println(res);
	}
}
