package by.htp.io.run;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class MainInputStream {

	public static void main(String[] args) {
		File f = new File("resources/sampler.txt");
		if(!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		try(InputStream is= new FileInputStream(f) ) {
			int avaliable = is.available();
			System.out.println("Bytes avaliable: "+avaliable);
			byte[] data = new byte[avaliable];
			is.read(data);
			System.out.println(new String(data));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}
