package interviewPrograms;

public class Sum_Entire_Numbers_In_String {
	
	public static void main(String[] args) {
		//ad12hgg10
		sumEntireNumbers("ad12hg2g");
	}
  public static void sumEntireNumbers(String str) {
	int   sum=0;
	String num="";
	 for(int i=0;i<str.length();i++) {
		 char ch=str.charAt(i);
		 if(Character.isDigit(ch)) {
			 num+=ch;
		 }
		 else {
			 if(!num.isEmpty()) {
				 sum+=Integer.parseInt(num);
				 num="";
				 System.out.println(sum);			 }
		 }
	 }
	 if(!num.isEmpty()) {
		 sum+=Integer.parseInt(num);
	 }
	 System.out.println(sum);
  }
}
