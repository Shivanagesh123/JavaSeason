package interviewPrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Print_Only_Unique_Elements_In_The_List {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(25);
		list.add(12);
		list.add(68);
		list.add(29);
		list.add(12);
		list.add(84);
		list.add(47);
		list.add(29);
		list.add(56);
		list.add(63);// 12,29
     HashMap<Integer,Integer> map= new HashMap<Integer,Integer>();
     for(int i=0;i<list.size();i++) {
    	 int num=list.get(i);
    	 map.put(num, map.getOrDefault(num, 0)+1);
     }
     for(int unique:map.keySet()) {
    	 if(map.get(unique)==1) {
    		 System.out.print(unique+" ");
    	 }
     }
		System.out.println(map);
	}
}
