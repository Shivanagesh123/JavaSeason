package interviewPrograms;

import java.util.HashMap;

public class RepeatingNumbersInAnArray {
	
	public static void main(String[] args) {
		int[] input= {5,5,25,2,8,5,2,3};
		
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(int i=0;i<input.length;i++) {
			map.put(input[i], map.getOrDefault(input[i], 0)+1);
		}
		for(int output:map.keySet()) {
			if(map.get(output)>1) {
				System.out.print(output+" ");
			}
		}
	}
}
