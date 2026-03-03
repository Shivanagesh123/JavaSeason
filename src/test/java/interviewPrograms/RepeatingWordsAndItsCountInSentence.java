package interviewPrograms;

import java.util.HashMap;

public class RepeatingWordsAndItsCountInSentence {
	
	public static void main(String[] args) {
		String str="python java clanguage sql java oracle clanguage java sql";
		String[] strArray=str.split(" ");
		
		HashMap<String,Integer> map=new HashMap<>();
		for(String key:strArray) {
			if(map.containsKey(key)) {
				map.put(key,map.get(key)+1);
			}
			else {
				map.put(key, 1);
			}
		}
		
		for(String result:map.keySet()) {
			if(map.get(result)>1) {
				System.out.println(result+" :"+map.get(result));
			}
		} 
		
		
		
	}

}
