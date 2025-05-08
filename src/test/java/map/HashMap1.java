package map;

import java.util.Map.Entry;
//import java.util.Map.Entry;
import java.util.*;
public class HashMap1 {
	
	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<Integer, String>();
		map.put(101, "Aravind");
		map.put(102, "Bhanu");
		map.put(103, "Chandu");
		map.put(104, "Devaraj");
		map.put(105, "Eesha");
		System.out.println(map);
		Set<Integer> set=map.keySet();
		System.out.println(set);
		Collection<String> list= map.values();
		System.out.println(list);
		Set<Entry<Integer, String>> set1= map.entrySet();
		for(Entry<Integer,String> entries:set1) {
			System.out.println(entries.getValue()+" role number is:"+entries.getKey());
		}
	}

}
