package server_ex1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {
	public static void main(String[] args) {
		InputStream is;
		BufferedReader br_in;
		BufferedReader br_out;
		BufferedWriter bw;
		PrintWriter pw = null;
		OutputStream os;
		ServerSocket serverSocket;
		Socket s1 = null;
		InetAddress ipAddrs = null;
		String connectedClient = null;
		String outMessage = null;
		String inMessage = null;

		try {
			serverSocket = new ServerSocket(5434);
			System.out.println("서버실행중...");
			while (true) {
				s1 = serverSocket.accept();
				is = s1.getInputStream();
				os = s1.getOutputStream();
				br_out = new BufferedReader(new InputStreamReader(System.in));
				br_in = new BufferedReader(new InputStreamReader(System.in));
				bw = new BufferedWriter(new OutputStreamWriter(os));
				pw = new PrintWriter(bw, true);
				pw.println("server : 서버 접속을 환영합니다.");

				while (true) {
					inMessage = br_in.readLine();
					System.out.println(inMessage);
					outMessage = br_out.readLine();
					if (outMessage.equals("exit"))
						break;
					pw.println("server : " + outMessage);
				}
				pw.close();
				s1.close();
			}
		} catch (IOException ie) {
			ie.printStackTrace();
		}
	}

}
