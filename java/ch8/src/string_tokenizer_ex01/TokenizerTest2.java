package string_tokenizer_ex01;

import java.util.StringTokenizer;

public class TokenizerTest2 {

	public static void main(String[] args) {
		String str = "2012-01-02 13:09:23";
		String[] date = new String[3];
		String[] time = new String[3];
		String temp = null;
		StringTokenizer tokenizer = null;
		StringTokenizer st = new StringTokenizer(str);

		while (st.hasMoreTokens()) {
			temp = st.nextToken();
			tokenizer = new StringTokenizer(temp, "-");
			if (tokenizer.countTokens() > 1) {
				while (tokenizer.hasMoreElements()) {
					date[0] = tokenizer.nextToken();
					date[1] = tokenizer.nextToken();
					date[2] = tokenizer.nextToken();
				}
				continue;
			}
			tokenizer = new StringTokenizer(temp, ":");
			if (tokenizer.countTokens() > 1) {
				while (tokenizer.hasMoreElements()) {
					time[0] = tokenizer.nextToken();
					time[1] = tokenizer.nextToken();
					time[2] = tokenizer.nextToken();
				}
			}

			System.out.println(date[0] + "년" + date[1] + "월" + date[2] + "일" + " " + time[0] + "시" + time[1] + "분"
					+ time[2] + "초");
		}
	}

}
