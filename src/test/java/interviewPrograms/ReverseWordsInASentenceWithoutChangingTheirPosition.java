package interviewPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseWordsInASentenceWithoutChangingTheirPosition {

	public static void main(String[] args) {

		String str = "java is a powerful language";
		String[] strArray = str.split(" ");
		System.out.println(Arrays.toString(strArray));

		String result = "";
		for (int i = 0; i < strArray.length; i++) {
			String s1 = strArray[i];
			for (int j = s1.length() - 1; j >= 0; j--) {
				result += s1.charAt(j);
			}
			result += " ";
		}
		System.out.println(result.trim());

	}
}
