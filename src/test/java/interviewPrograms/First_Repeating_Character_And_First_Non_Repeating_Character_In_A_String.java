package interviewPrograms;

public class First_Repeating_Character_And_First_Non_Repeating_Character_In_A_String {

	public static void main(String[] args) {
		repeatingAndNonrepeating("seleniums");
	}

	public static void repeatingAndNonrepeating(String str) {
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (str.indexOf(ch) == str.lastIndexOf(ch)) {

				System.out.println("firstNonRepeating character is:" + ch);
				break;
			} 
		}
		for(int i=0;i<str.length();i++) {
			if(str.indexOf(str.charAt(i))!=str.lastIndexOf(str.charAt(i))) {
				System.out.println("The first repeating character:"+str.charAt(i));
				break;
			}
		}
	}
}
