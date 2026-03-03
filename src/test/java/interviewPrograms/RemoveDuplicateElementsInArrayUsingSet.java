package interviewPrograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicateElementsInArrayUsingSet {
	
	public static void main(String[] args) {
		int[] input= {10,12,19,5,78,52,10,63,47,12,25,65,47};
		
		Set<Integer> set=new TreeSet<>();
		for(int i=0;i<input.length;i++) {
			set.add(input[i]);
		}
		System.out.println(set);
		int[] arr=new int[set.size()];
		int i=0;
		for(int arr1:set) {
			arr[i++]=arr1;
		}
		System.out.println("The array:"+Arrays.toString(arr));
	}

}
