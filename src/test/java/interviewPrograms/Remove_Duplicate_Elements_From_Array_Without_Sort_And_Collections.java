package interviewPrograms;

public class Remove_Duplicate_Elements_From_Array_Without_Sort_And_Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = { 1, 4, 2, 5, 8, 6, 2, 7, 5, 9, 10, 2 };//2,5,
		int[] unique = new int[input.length];
		int uniqueIndex = 0;
		for (int i = 0; i < input.length; i++) {
			boolean flag=false;
			for (int j = 0; j < uniqueIndex; j++) {
				if (input[i] == unique[j]) {
					flag = true;
					break;
				}
			}
			if (flag == false) {
				unique[uniqueIndex] = input[i];//1,
				uniqueIndex++;
			}
		}
		for (int i = 0; i < uniqueIndex; i++) {
			System.out.print(unique[i]+" ");
		}
	}

}
