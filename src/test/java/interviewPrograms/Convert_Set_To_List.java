package interviewPrograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Convert_Set_To_List {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		set.add(65);
		set.add(86);
		set.add(14);
		set.add(51);
		set.add(39);
		
		List<Integer> list = new ArrayList<Integer>(set);
		System.out.println(list);
	}

}
