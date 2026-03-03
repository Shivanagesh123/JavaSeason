package interviewPrograms;

import java.util.HashMap;
import java.util.Map;

public class Count_Occurences_Of_Specific_Words_In_Sentence {
	
	public static void main(String[] args) {
		
		String input="India is my country.My country is india";
		
		input=input.toLowerCase().replace(".", " ");
		
		String[] strArray=input.split("\\s");
		Map<String,Integer> map=new HashMap<String,Integer>();
		for(String str:strArray) {
			
			map.put(str, map.getOrDefault(str,0)+1);
		}
		System.out.println(map);
	}

}
