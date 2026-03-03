package interviewPrograms;

import java.util.HashMap;

public class Find_Duplicate_Elements_In_An_Array2 {
	
	public static void main(String[] args) {
		int[] input= {41,10,5,26,10,15,8,5};
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(int i=0;i<input.length;i++) {
			if(map.containsKey(input[i])) {
				//map.put(input[i], map.getOrDefault(input[i],0)+1);
				map.put(input[i], map.get(input[i])+1);
			}
			else {
				map.put(input[i], 1);
			}
		}
		for(Integer keys:map.keySet()) {
			if(map.get(keys)>1) {
				System.out.println("Duplicate elements:"+keys);
			}
		}
	}

}
