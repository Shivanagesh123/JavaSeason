package interviewPrograms;

public class Find_All_Subsets_Of_String {

	public static void main(String[] args) {
		subsetOfAString("abc");
	}

	public static void subsetOfAString(String str) {

		int n = str.length();
		int n1=1<<n;
		System.out.println(n1);
	//	String arr[] = new String[n * (n + 1) / 2];
	//	int temp = 0;
		for (int i = 0; i < n1; i++) {
			String s1="";
			for (int j = 0; j < n; j++) {
				//System.out.println(str.substring(i, j + 1));
				if((i&(1<<j))!=0) {
					s1+=str.charAt(j);
				}
			}
			System.out.println(s1);
		}
		// for(int i=0;i<arr.length;i++) {
		// System.out.println(arr[i]);
		// }
	}

}
