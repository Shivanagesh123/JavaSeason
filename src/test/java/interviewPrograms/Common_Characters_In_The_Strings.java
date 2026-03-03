package interviewPrograms;

import java.util.HashMap;

public class Common_Characters_In_The_Strings {
	
	public static void main(String[] args) {
		  String s1="selenium";
		  String s2="cucumber";
		  String s3="udemy";
		  char[] ch=s1.toCharArray();
		 HashMap<Character,Integer> map= new HashMap<Character,Integer>();
		  for(int i=0;i<ch.length;i++) {
			  
			  if(s1.indexOf(ch[i])!=-1&&s2.indexOf(ch[i])!=-1&&s3.indexOf(ch[i])!=-1) {
				  map.put(s1.charAt(i) , map.getOrDefault(s1.charAt(i), 0)+1);
				  
			  }
		  }
		  System.out.println(map.keySet());
	}

}
