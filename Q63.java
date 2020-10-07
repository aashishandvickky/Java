/* 63. Write a program to count how many times character ‘t’ occurs in a file. 
 */

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Q63 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("D:\\Ashish\\DAC\\Java\\file1.txt");
		if(!f.exists()){
			f.createNewFile();
			
		}
		FileWriter f1 = new FileWriter("D:\\Ashish\\DAC\\Java\\file1.txt");
		String str = "how are you t and t are u there t ttt";
		BufferedWriter b1 = new BufferedWriter(f1);
		f1.write(str);
		b1.flush();
		b1.close();
		FileReader r1 = new FileReader("D:\\Ashish\\DAC\\Java\\file1.txt");
		int ch ;
		int count = 0;
		while((ch = r1.read()) != -1) {
			if((char)ch == 't') {
				count++;
			}
		}
		System.out.println("Count : "+ count);
		f1.close();
	
		
	}

}
