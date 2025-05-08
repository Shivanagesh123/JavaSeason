package fileHandling;

import java.io.File;

public class CreateAFolder {

	public static void main(String[] args) {
		File folder = new File("C:\\Users\\siva nagesh\\OneDrive\\Documents\\KVK\\SampleFolder");
		System.out.println(folder.mkdir());
	}

}
