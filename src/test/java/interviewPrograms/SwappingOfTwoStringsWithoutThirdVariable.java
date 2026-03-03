package interviewPrograms;

public class SwappingOfTwoStringsWithoutThirdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		swappingofTwoString("Hello","Java");
	}

	public static void swappingofTwoString(String str1,String str2) {
		str1=str1+str2;
		str2=str1.substring(0,str1.length()-str2.length());//hello
		//str1=str1.replace(str2, "");
		str1=str1.substring(str2.length());
	    System.out.println(str1);
	    System.out.println(str2);
	}}
