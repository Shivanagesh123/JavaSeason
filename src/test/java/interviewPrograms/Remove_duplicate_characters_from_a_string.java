package interviewPrograms;

import java.util.Arrays;

public class Remove_duplicate_characters_from_a_string {
	
	public static void main(String[] args) {
		duplicates("selenium");
	}

	public static void duplicates(String str) {
		str=str.toLowerCase();
		String result="";
		char[] ch=str.toCharArray();
		Arrays.sort(ch);
		System.out.println(Arrays.toString(ch));
		for(int i=0;i<ch.length-1;i++) {
			if(ch[i]!=ch[i+1]) {
				result+=ch[i];
			}
		}
		result+=ch[ch.length-1];
		System.out.println(result);
	}
}
