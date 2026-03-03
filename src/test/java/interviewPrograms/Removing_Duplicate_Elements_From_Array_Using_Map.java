package interviewPrograms;

import java.util.HashMap;

public class Removing_Duplicate_Elements_From_Array_Using_Map {
	
	public static void main(String[] args) {
		int[] input= {5,8,4,6,8,2,4,3,1};//4,8
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<input.length;i++) {
			map.put(input[i], map.getOrDefault(input[i], 0)+1);
		}
		System.out.print(map.keySet());
		for(int key:map.keySet()) {
			if(map.get(key)==1) {
				System.out.print(key+" ");
			}
		}
	}

}
