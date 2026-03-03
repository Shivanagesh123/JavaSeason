package interviewPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Sort_The_ArrayList {
	
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(56);
		list.add(64);
		list.add(687);
		list.add(14);
		list.add(256);
		List<Integer> set1=new ArrayList<Integer>(list);	
		Collections.sort(set1,Collections.reverseOrder());
		for(int num:set1) {
			System.out.println(num);
		}
		}
	}


