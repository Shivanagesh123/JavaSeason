package interviewPrograms;

public class Perfect_Number {
	
	public static void main(String[] args) {
		perfect(10);
		perfect(6);
	}
     public static void perfect(int num) {
    	 int original=num;
    	 int sum=0;
    	 for(int i=1;i<num;i++) {
    		 if(num%i==0) {
    			 sum+=i;
    		 }
    	 }
    	 if(sum==original) {
    		 System.out.println(original+" is perfect number");
    	 }
    	 else {
    		 System.out.println(original +" is not a perfect number");
    	 }
     }
}
