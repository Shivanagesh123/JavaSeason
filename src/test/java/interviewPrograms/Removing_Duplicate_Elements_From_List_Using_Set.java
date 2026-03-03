package interviewPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Removing_Duplicate_Elements_From_List_Using_Set  {
	
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>(Arrays.asList(14,85,65,14,96,25,65,36,58));
		Set<Integer> set=new TreeSet<>(list);
		System.out.println(set);
	}

}
