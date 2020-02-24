package Core_Java_Lab_Code_8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileProgram_1A
{

	public static void main(String[] args) throws FileNotFoundException {
		
		FileInputStream inputStream = new FileInputStream("source.txt");
		
		FileOutputStream outputStream = new FileOutputStream("target.txt");
		
		new CopyDataThread_1B(inputStream, outputStream).start();
	}
}
