package server.ex3;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ScoreServer {
	public static ArrayList<String> calcScore(List<Student> list) {

		Student st = null;
		ArrayList<String> _sList = new ArrayList<String>();

		int length = list.size();
		String[] name = new String[length];
		int[] score = new int[length];
		int[] subNum = new int[length];
		String sName = null;
		int point = 0;

		for (int i = 0; i < list.size(); i++) {
			st = (Student) list.get(i);
			sName = st.getName();
			point = st.getPoint();
			for (int j = 0; j < length; j++) {
				if (sName.equals(name[j])) {
					score[j] += point;
					subNum[j]++;
					break;
				} else if (name[j] == null) {
					name[j] = sName;
					score[j] += point;
					subNum[j]++;
					break;
				}
			}

		}

		for (int i = 0; i < length; i++) {
			if (name[i] != null) {
				String res = "이름 : " + name[i] + "총점 : " + score[i] + "이름 : " + subNum[i] + "이름 : "
						+ ((float) score[i] / subNum[i]);
				_sList.add(res);
			}
		}
		return _sList;
	}

	public static void main(String[] args) {
		try {
			System.out.println("서비스하기 위해 준비중입니다.");
			ServerSocket serverSocket = new ServerSocket(5434);
			System.out.println("서버가 동작중입니다.");

			Socket s1 = serverSocket.accept();

			ObjectInputStream ois = new ObjectInputStream(s1.getInputStream());
			ObjectOutputStream oos = new ObjectOutputStream(s1.getOutputStream());

			List sList = (ArrayList) ois.readObject();
			oos.writeObject(calcScore(sList));

			oos.close();
			s1.close();
		} catch (ClassNotFoundException eof) {
			System.out.println("Client로 부터 연결이 끝어졌습니다. 종료합니다...");
			System.exit(0);
		} catch (IOException io) {
			io.printStackTrace();
		}

	}

}
