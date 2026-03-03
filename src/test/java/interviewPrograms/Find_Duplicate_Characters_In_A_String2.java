package interviewPrograms;

import java.util.Arrays;

public class Find_Duplicate_Characters_In_A_String2 {
	
	public static void main(String[] args) {
		duplicate("programming");
	}
       public static void duplicate(String str) {
    	 //  char[] ch=str.toCharArray();
    	   //Arrays.sort(ch);
    	  
    	 for(int i=0;i<str.length();i++) {
    		 int count=0;
    		 for(int j=i+1;j<str.length();j++) {
    			 if(str.charAt(i)==str.charAt(j)) {
    				 count++;
    			 }
    		 }
    		 if(count==1) {
    			 System.out.println(str.charAt(i));
    		 }
    	 }
       }
}
