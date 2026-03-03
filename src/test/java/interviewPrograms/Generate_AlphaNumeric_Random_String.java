package interviewPrograms;

import java.util.Random;
import java.util.UUID;

public class Generate_AlphaNumeric_Random_String {
	
	public static void main(String[] args) {
	/*String random_number=	UUID.randomUUID().toString();
	random_number=random_number.replace("-", "");
	random_number=random_number.substring(0,6);
	System.out.println(random_number);*/
		int length=6;
		String characters="abcdefghijklmnopqrstuvwxyz1234567890";
		String result="";
		Random random=new Random();
		for(int i=0;i<length;i++) {
			int index=random.nextInt(characters.length());
			System.out.println(index);
			result+=characters.charAt(index);
		}
		System.out.println(result);
	}

}
