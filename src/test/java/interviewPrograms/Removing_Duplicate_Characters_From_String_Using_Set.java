package interviewPrograms;

import java.util.LinkedHashSet;


public class Removing_Duplicate_Characters_From_String_Using_Set {
	
	public static void main(String[] args) {
		duplicates("java");
	}

	public static void duplicates(String str) {
		char[] ch=str.toLowerCase().toCharArray();
	LinkedHashSet<Character>set=	new LinkedHashSet<>();
	for(int i=0;i<ch.length;i++) {
		set.add(ch[i]);
	}
		System.out.println(set);
	}
	
}
