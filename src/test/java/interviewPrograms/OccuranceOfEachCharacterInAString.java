package interviewPrograms;

import java.util.HashMap;

public class OccuranceOfEachCharacterInAString {
	
	public static void main(String[] args) {
		String input="selenium";
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		for(int i=0;i<input.length();i++) {
			/*if(map.containsKey(input.charAt(i))) {
				map.put(input.charAt(i),map.get(input.charAt(i))+1);
			}
			else {
				map.put(input.charAt(i), 1);
			}*/
			char ch=input.charAt(i);
			map.put(ch, map.getOrDefault(ch,0)+1);
		}
		System.out.println(map);
		for(Character char1:map.keySet()) {
			if(map.get(char1)==1) {
				System.out.print(char1+" ");
			}
		}
	}

}
