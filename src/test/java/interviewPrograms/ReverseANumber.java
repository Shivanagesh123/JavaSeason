package interviewPrograms;

public class ReverseANumber {
	public static void main(String[] args) {
		//ReverseANumber reverse=new ReverseANumber();
		reverseNumber(254);
	}
  public static  void reverseNumber(int num) {
	
	  int num1=num;
	  int rev=0;
	  while(num>0) {
		  rev=rev*10+num%10;
		  num=num/10;
	  }
	  System.out.println("Reverse of a "+ num1+" is:"+rev);
  }
}
