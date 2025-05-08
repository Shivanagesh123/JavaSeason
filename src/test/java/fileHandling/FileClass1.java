package fileHandling;

import java.io.File;
import java.io.IOException;

public class FileClass1 {

	public static void main(String[] args) throws IOException {
		File file=new File("C:\\Users\\siva nagesh\\OneDrive\\Documents\\KVK\\Sample.file");
		System.out.println(file.createNewFile());
	}
}
