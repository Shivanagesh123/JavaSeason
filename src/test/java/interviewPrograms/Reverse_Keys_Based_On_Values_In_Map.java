package interviewPrograms;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Reverse_Keys_Based_On_Values_In_Map {

	public static void main(String[] args) {
		Map<String, Integer> tMap = new HashMap<String, Integer>();
		tMap.put("Telangana", 65);
		tMap.put("Karnataka", 55);
		tMap.put("Maharastra", 27);
		tMap.put("Tamilnadu", 48);
		tMap.put("Andhrapradesh", 59);
		tMap.put("Kerala", 24);

		List<Entry<String, Integer>> list = new LinkedList<Entry<String, Integer>>(tMap.entrySet());

		list.sort(Entry.comparingByKey());

		System.out.println(list);
	}
}
