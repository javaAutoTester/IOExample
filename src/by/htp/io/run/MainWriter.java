package by.htp.io.run;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class MainWriter {

	public static void main(String[] args) {
		 File f = new File("resources/sampler.txt");
		 if(!f.exists()) {
			 System.out.println("New file needs to be created.");
		 }
		 try {
			f.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		 
		try(Writer writer = new FileWriter(f, true); BufferedWriter bw = new BufferedWriter(writer) ) {
			bw.write("If you have no money\n");
		} catch (IOException e) {
			e.printStackTrace();
		}	 
	}
}
