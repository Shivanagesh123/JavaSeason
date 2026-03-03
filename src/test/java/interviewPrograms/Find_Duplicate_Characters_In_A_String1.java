package interviewPrograms;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Find_Duplicate_Characters_In_A_String1 {
	
	public static void main(String[] args) {
		duplicate("character");
	}
       public static void duplicate(String str) {
    	   Map<Character,Integer> map=new LinkedHashMap<Character,Integer>();
    	   char[] ch=str.toCharArray();
    	   for(char char1:ch) {
    		   map.put(char1, map.getOrDefault(char1, 0)+1);
    	   }
    	   for(char key:map.keySet()) {
    		   if(map.get(key)>1) {
    			   System.out.print(key+" ");
    		   }
    	   }
       }
}
