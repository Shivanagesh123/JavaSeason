package interviewPrograms;

public class Armstrong1 {
	
	public static void main(String[] args) {
		armstrong(158);
	}
             public static void armstrong(int num) {
            	 int original=num;
            	 int sum=0;
            	 int length=String.valueOf(num).length();
            	
            	 while(num>0) {
            		 int pow=1;
            		 int remainder=num%10;
            		 for(int i=0;i<length;i++) {
            			 
            			 pow=pow*remainder;
            			 
            		 }
            		 sum+=pow;
            		 num/=10;
            	 }
            	 if(original==sum) {
            		 System.out.println("The given number is armstrong");
            	 }
            	 else {
            		 System.out.println("The given number is not armstrong");
            	 }
             }
}
