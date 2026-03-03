package interviewPrograms;

public class Find_Vowel_Characters_From_String {
	
	public static void main(String[] args) {
		vowel("java is a powerful language");
	}

	
	public static void vowel(String str) {
		str=str.toLowerCase();
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
				System.out.print(ch[i]+" ");
			}
		}
	}
}
