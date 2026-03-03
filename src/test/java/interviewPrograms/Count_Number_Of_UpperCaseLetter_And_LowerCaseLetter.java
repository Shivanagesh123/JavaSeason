package interviewPrograms;

public class Count_Number_Of_UpperCaseLetter_And_LowerCaseLetter {
	
	public static void main(String[] args) {
		isUpper("WelcoMe To AutomatIon Testinhg");
	}

	static  int countupper=0;
	static int countlower=0;
	public static void isUpper(String str) {
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>=65&&str.charAt(i)<=91) {
				countupper++;
			}
			else {
				countlower++;
			}
		}
		
		System.out.println(countupper);
		System.out.println(countlower);
	}
}
