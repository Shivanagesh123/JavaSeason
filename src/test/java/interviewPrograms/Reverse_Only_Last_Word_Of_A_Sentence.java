package interviewPrograms;

public class Reverse_Only_Last_Word_Of_A_Sentence {

	public static void main(String[] args) {

		reverseLastWord("I love java Programming");

	}

	public static void reverseLastWord(String str) {
		String[] s1 = str.split("\\s");
		String original = "";
		for (int i = 0; i < s1.length; i++) {
			if (i == s1.length - 1) {
				 String word=s1[i];
				for (int j = word.length() - 1; j >= 0; j--) {
					original = original + word.charAt(j);
				}
			} else {
				original = original + s1[i] + " ";
			}
		}

		System.out.println(original);
	}

}
