package interviewPrograms;

import java.util.Arrays;

public class Is_Strings_Are_Anagram {

	public static void main(String[] args) {
		anagram("listen", "silent");
		anagram("world","would");
		anagram("racecar","carrace");
	}

	public static void anagram(String s1, String s2) {
		if (s1.length() != s2.length()) {
			System.out.println(false);
		}
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		if (Arrays.equals(ch1, ch2)) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}
}
