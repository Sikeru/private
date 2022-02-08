package server.ex3;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ScoreClient {
	public static void main(String[] args) throws IOException {

		if (args.length == 0) {
			System.out.println("사용법 : java SimpleClient [server_name]");
			System.out.println("server_name을 입력하시지 않으셔서 localhost로 접속을 시도합니다.");
			args = new String[] { "127.0.0.1" };
		}

		List sList = new ArrayList();

		sList.add(new Student("홍길동", 3, "국어", 80));
		sList.add(new Student("이순신", 3, "국어", 90));
		sList.add(new Student("임꺽정", 3, "국어", 78));
		sList.add(new Student("홍길동", 3, "영어", 76));
		sList.add(new Student("임꺽정", 3, "영어", 56));
		sList.add(new Student("홍길동", 3, "수학", 70));
		sList.add(new Student("이순신", 3, "수학", 67));
		sList.add(new Student("임꺽정", 3, "수학", 77));

		try {
			Socket s1 = new Socket(args[0], 5539);
			ObjectOutputStream oos = new ObjectOutputStream(s1.getOutputStream());
			ObjectInputStream ois = new ObjectInputStream(s1.getInputStream());

			oos.writeObject(sList);
			List list = (ArrayList) ois.readObject();

			for (int i = 0; i < list.size(); i++) {
				String str = (String) list.get(i);
				System.out.println(str);
			}

			ois.close();
			s1.close();
		} catch (ClassNotFoundException eof) {
			System.out.println("Server로 부터 연결이 끊어졌습니다. 종료합니다...");
			System.exit(0);
		} catch (IOException io) {
			io.printStackTrace();
		}

	}

}
