package interviewPrograms;

public class Find_Sum_Of_Digits_Until_It_Becomes_Single_Digit {

	public static void main(String[] args) {
		sumOfDigits(10);
	}

	public static void sumOfDigits(int num) {
		
		while(num>10) {
			int sum=0;
			while(num>0) {
				int remainder=num%10;
				sum+=remainder;
				num/=10;
			}
			num=sum;
		}
		System.out.println(num);
		/*int sum = 0;

		while (num > 10) {
			int mod = num % 10;
			sum += mod;
			System.out.println("sum:" + sum);
			num /= 10;
		}
		int total=sum+num;
		System.out.println("initialSum:"+total);
		int finalSum=0;
		while(sum>10) {
			int mod1=sum%10;
			finalSum=finalSum+mod1;
			sum/=10;
		}
		System.out.println(sum+finalSum);*/
	}
}
