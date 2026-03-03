package interviewPrograms;

import java.util.HashMap;

public class RepeatingCharacterInAString {
	
	public static void main(String[] args) {
		String str="seleniumis";
		HashMap<Character,Integer> map=new HashMap<>();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		System.out.println(map);
		for(char result:map.keySet()) {
			if(map.get(result)>1) {
				System.out.print(result+" ");
			}
		}
	}

}
