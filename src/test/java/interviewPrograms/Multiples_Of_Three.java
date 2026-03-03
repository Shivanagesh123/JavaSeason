package interviewPrograms;

import java.util.Arrays;

public class Multiples_Of_Three {
	
	public static void main(String[] args) {
		int[] input= {5,41,15,20,6,8,21};
		int k=0;
		for(int i=0;i<input.length;i++) {
			if(input[i]%3==0) {
				
				int temp=input[i];
				input[i]=input[k];
				input[k++]=temp;
			}
		}
		System.out.println(Arrays.toString(input));
	}

}
