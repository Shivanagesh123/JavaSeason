package interviewPrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Convert_Map_Into_List {
	
	public static void main(String[] args) {
		
		Map<String,Integer> map=new HashMap<String,Integer>();
		
		map.put("Mango", 100);
		map.put("straberry", 15);
		map.put("blueberry", 20);
		map.put("apple", 72);
		map.put("papaya", 45);
		
		List<Entry<String,Integer>> list=new ArrayList<>(map.entrySet());
		
		list.sort(Entry.comparingByValue());
		System.out.println(list);
		 for(int i=0;i<list.size();i++) {
			 System.out.println(list.get(i));
			 break;
		 }
		
	}

}
