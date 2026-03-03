package interviewPrograms;

import java.util.HashMap;

public class Find_The_Repeating_Words_And_Its_Count_In_Sentence2 {
	
	public static void main(String[] args) {
	String str="python java clanguage sql java oracle clanguage java sql";
	
	String[] st=str.split(" ");
	HashMap<String,Integer> map=new HashMap<>();
	for(int i=0;i<st.length;i++) {
		map.put(st[i], map.getOrDefault(st[i],0)+1);
	}
	for(String word:map.keySet()) {
		if(map.get(word)>1) {
			System.out.println(word+":"+map.get(word));
		}
	}
	}
}
	
