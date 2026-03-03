package interviewPrograms;

import java.util.HashMap;

public class Is_Two_Strings_Are_Anagram {

	public static void main(String[] args) {
		verify("Listlem", "silenet");
		verify("earth","heart");
	}

	public static void verify(String s1, String s2) {
		HashMap<Character, Integer> map1 = new HashMap<>();
		HashMap<Character, Integer> map2 = new HashMap<>();
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		for (int i = 0; i < s1.length(); i++) {
			char ch1 = s1.charAt(i);
			/*if (map1.containsKey(ch1)) {
				int count = map1.get(ch1);
				map1.put(ch1, count + 1);
			} else {
				map1.put(ch1, 1);
			}*/
			map1.put(ch1,map1.getOrDefault(ch1, 0)+1);
		}
		for (int i = 0; i < s2.length(); i++) {
			char ch2 = s2.charAt(i);
			if (map2.containsKey(ch2)) {
				int count = map2.get(ch2);
				map2.put(ch2, count + 1);
			} else {
				map2.put(ch2, 1);
			}
		}
		System.out.println(map1);
		System.out.println(map2);
		if (map1.equals(map2)) {
			System.out.println("The Strings are anagram");
		} else {
			System.out.println("The Strings are not anagram");
		}
	}
}
