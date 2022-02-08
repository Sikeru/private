package javaextra.ex3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class SimpleClient {
	public static void main(String[] args) {

		InputStream is;
		OutputStream os;
		BufferedReader br_in;
		BufferedReader br_out;
		PrintWriter pw = null;
		BufferedWriter bw = null;
		List list = new ArrayList() {
		};

		try {
			Socket s1 = new Socket("127.0.0.1", 1642);
			is = s1.getInputStream();
			os = s1.getOutputStream();
			br_in = new BufferedReader(new InputStreamReader(is));
			br_out = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new OutputStreamWriter(os));
			pw = new PrintWriter(bw, true);

			while (true) {

			}

		} catch (Exception e) {

		}

	}
}
