package strem;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class WriteFile {

	public static void main(String[] args) {
		File file = new File("write.txt");
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter out = new PrintWriter(new FileWriter(file, true));
			String s;
			System.out.println("Exit : Ctrl + Z");
			while ((s = in.readLine()) != null) {
				out.println(s);
			}
			in.close();
			out.close();
		} catch (IOException e) {
			System.out.println("IOException");
		}
	}

}
