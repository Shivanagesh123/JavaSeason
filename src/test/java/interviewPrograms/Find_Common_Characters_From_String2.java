package interviewPrograms;

import java.util.HashSet;

public class Find_Common_Characters_From_String2 {
	
	public static void main(String[] args) {
		String str1="listwen";
		String str2="silent";
		
		HashSet<Character> set1 = new HashSet<Character>();
		HashSet<Character> set2 = new HashSet<Character>();
		
		for(char ch1:str1.toCharArray()) {
			set1.add(ch1);
		}
		for(char ch2:str2.toCharArray()) {
			if(set1.contains(ch2)) {
				set2.add(ch2);
			}
		}
		System.out.println(set2);
	}

}
