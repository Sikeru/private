package strem;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopy {

	public static void main(String[] args) {
		try {
			FileInputStream input = new FileInputStream("th1.jpg");
			FileOutputStream output = new FileOutputStream("th2.jpg");
			int data;
			while ((data = input.read()) != -1) {
				output.write(data);
			}
			input.close();
			output.close();
			System.out.println("이미지를 복사했습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
