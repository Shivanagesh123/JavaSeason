package interviewPrograms;

public class PrimeNumber {
	
	public static void main(String[] args) {
		primeNumber(5);
	}
       public static void primeNumber(int num) {
    	   int count=0;
    	   for(int i=1;i<=num;i++) {
    		   if(num%i==0) {
    			   count++;
    		   }
    	   }
    	   if(count==2) {
    		   System.out.println("The given number is primeNumber");    	   
       }
    	   else {
    		   System.out.println("The given number is not primeNumber");
    	   }
}
}
