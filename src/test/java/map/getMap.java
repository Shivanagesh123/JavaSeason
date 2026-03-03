package map;

import java.util.HashMap;

public class getMap {
	
	public static void main(String[] args) {
		HashMap<Integer,Integer> map=new HashMap<>();
		int[] input= {12,12};
		for(int i=0;i<input.length;i++) {
			map.put(input[i], map.getOrDefault(input[i],0)+1);
			/*if(map.containsKey(input[i])){
				map.put(input[i], map.get(input[i])+1);
			}
			else {
				map.put(input[i],0);
			}*/
		}
		System.out.println(map);
	}

}
