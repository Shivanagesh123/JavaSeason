package interviewPrograms;

public class FindTheRepeatingWordsAndItsCountInSentence {
	
	public static void main(String[] args) {
	String str="python java clanguage sql java oracle clanguage java sql";
	
	String[] st=str.split(" ");
	for(int i=0;i<st.length;i++) {
		int count=0;
		for(int j=i+1;j<st.length;j++) {
			if(st[i].equals(st[j])) {
				st[j]="-";
				count++;
			}
		}
		if(st[i]!="-"&&count>0) {
			System.out.println(st[i] +" ---- "+ count);
		}
		//count=0;
	}
	}
}
	
