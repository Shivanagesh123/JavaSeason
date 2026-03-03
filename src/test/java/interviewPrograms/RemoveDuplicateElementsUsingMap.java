package interviewPrograms;

import java.util.HashMap;

public class RemoveDuplicateElementsUsingMap {
	
	public static void main(String[] args) {
		int[] input= {14,5,12,15,5,10,84,12,69,14};
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(int i=0;i<input.length;i++) {
			if(map.containsKey(input[i])) {
				map.put(input[i],map.get(input[i]+1) );
			}
			else {
				map.put(input[i], map.getOrDefault(input[i], 0)+1);
			}
		}
		System.out.println(map.entrySet());
		System.out.println(map.keySet());
		System.out.println(map.values());
		/*for(int key:input) {
			map.put(key, map.getOrDefault(key, 0)+1);
		}
		System.out.println(map.entrySet());*/
	}

}
