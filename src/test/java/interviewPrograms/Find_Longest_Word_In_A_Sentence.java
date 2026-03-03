package interviewPrograms;

public class Find_Longest_Word_In_A_Sentence {
	
	public static void main(String[] args) {
		longestWord("java is a independent programming language");
	}

	public static void longestWord(String str) {
		String[] splitArray=str.split("\\s");
		String result="";
		for(int i=0;i<splitArray.length;i++) {
			if(result.length()<splitArray[i].length()) {
				result=splitArray[i];
			}
		}
		System.out.println(result);
	}
	
}
