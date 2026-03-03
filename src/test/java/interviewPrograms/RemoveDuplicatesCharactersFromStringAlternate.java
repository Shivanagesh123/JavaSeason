package interviewPrograms;

public class RemoveDuplicatesCharactersFromStringAlternate {
	public static void main(String[] args) {
        removeDuplicates("selenium");
        removeDuplicates("programming");
    }

    public static void removeDuplicates(String str) {
      /*  str = str.toLowerCase();
        String result = ""; // using plain String

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // Check if ch is already in result
            if (result.indexOf(ch) == -1) {
                result += ch;  // append only if not already present
            }
        }

        System.out.println("After removing duplicates: " + result);*/
    	
    	str=str.toLowerCase();
    	String result="";
    	for(int i=0;i<str.length();i++) {
    		char ch=str.charAt(i);
    		if(result.indexOf(ch)==-1) {
    			result+=ch;
    		}
    	}
    	System.out.println(result);
    }
}
