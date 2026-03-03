package interviewPrograms;

public class Armstrong3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            armstrong(153);
	}

	 public static void armstrong(int num){
		    int len=String.valueOf(num).length();
		    
		    int num1=num;
		    int sum=0;
		   // int rev=0;
		    while(num>0){
		      int  rev=num%10;
		        sum+=Math.pow(rev,len);
		        num/=10;
		    }
		    if(sum==num1){
		        System.out.println("Given number "+num1+" is armstrong");
		    }
		    else{
		        System.out.println("Given number"+num1+" is not a armstrong");
		    }
	 }
}
