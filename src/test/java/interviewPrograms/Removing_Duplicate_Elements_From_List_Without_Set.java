package interviewPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Removing_Duplicate_Elements_From_List_Without_Set  {
	
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>(Arrays.asList(14,85,65,14,96,25,65,36,58,14));
		    
		for(int i=0;i<list.size();i++) {
			for(int j=i+1;j<list.size();j++) {
				if(list.get(i).equals(list.get(j))) {
					list.remove(j);
					j--;
				}
			}
		}
		System.out.println(list);
	}

}
