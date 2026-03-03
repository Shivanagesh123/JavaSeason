package interviewPrograms;

public class Subsets_Of_A_String {

	public static void main(String[] args) {
		allSubsetsinString("dog");
	}
	public static void allSubsetsinString(String str) {
		int len=str.length();
		int total=1<<len;
		for(int i=0;i<total;i++) {
			String output="";
			for(int j=0;j<len;j++) {
				if((i&(1<<j))!=0) {
					output+=str.charAt(j);
				}
			}
			System.out.println(output);
		}
	}
}
