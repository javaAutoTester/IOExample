package by.htp.io.run;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class MainReader {

	public static void main(String[] args) {
		
		File f = new File("resources/sampler.txt");
		 if(!f.exists()) {
			 System.out.println("create new file");
			 try {
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		 }
		try (Reader reader = new FileReader(f);
			 BufferedReader br = new BufferedReader(reader) ) {
			String str = null;
			while((str=br.readLine())!= null) {
				System.out.println(str);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
