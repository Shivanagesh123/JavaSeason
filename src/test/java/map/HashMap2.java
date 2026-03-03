package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap2 {

	public static void main(String[] args) {
		
Map<String, String> hMap=new HashMap<String, String>();
		
		
		System.out.println(hMap.size());  // 0
		
		hMap.put("Manager", "Ravi");
		
		hMap.put("Test Lead", "Gopi");
		
		hMap.put("Developer", "Kiran");
		
		hMap.put("Product Owner", "Mahesh");
		
		hMap.put("Tester", "Riyaz");
		
		System.out.println(hMap.size());
		
		System.out.println(hMap);
		
		/*Set<Entry<String, String>> entries=hMap.entrySet();
		
		for(Entry<String, String> entry:entries)
		{
			System.out.println(entry.getKey()+" is "+entry.getValue());
		}*/
		Set<Entry<String,String>> entries=hMap.entrySet();
		for(Entry<String,String> entry:entries) {
			System.out.println(entry.getKey()+" is "+entry.getValue());
		}
		 

	}

}
