package interviewPrograms;

import java.util.Arrays;

public class RemoveDuplicatesInAnArray {
    
	public static void main(String[] args) {
		int[] arr= {12,5,74,6,5,25,65,74,21,36,85,9};
		
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int[] temp=new int[arr.length];
		int j=0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]!=arr[i+1]) {
				temp[j++]=arr[i];
			}
		}
		temp[j++]=arr[arr.length-1];
		for(int k=0;k<j;k++) {
			System.out.print(temp[k]+" ");
		}
		
	}
}
