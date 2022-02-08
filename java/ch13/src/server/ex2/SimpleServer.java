package server.ex2;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {
	public static void main(String[] args) {
		InputStream is;
		PrintWriter pw = null;
		ServerSocket serverSocket;
		Socket s1 = null;
		String data;
		BufferedReader br_in;

		try {
			FileWriter writer = new FileWriter("out.txt");
			serverSocket = new ServerSocket(5437);
			System.out.println("서버 실행중...");
			s1 = serverSocket.accept();
			is = s1.getInputStream();
			br_in = new BufferedReader(new InputStreamReader(is));
			pw = new PrintWriter(writer, true);

			while ((data = br_in.readLine()) != null) {
				System.out.println(data);
				pw.println(data);
			}
//			out.close();
			pw.close();
			s1.close();
		} catch (IOException ie) {
			ie.printStackTrace();
		}
	}
}
