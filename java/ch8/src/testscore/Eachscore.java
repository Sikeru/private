package testscore;

public class Eachscore {
	public static void calcScore(String[] str) {
		int length = str.length;
		String[] name = new String[length];
		int[] score = new int[length];
		int[] subNum = new int[length];
		String sName = null;
		int point = 0;
		String[] token = null;

		for (int i = 0; i < length; i++) {
			token = str[i].split(",");
			sName = token[0];
			point = Integer.parseInt(token[3]);
			for (int j = 0; j < length; j++) {
				if (sName.equals(name[j])) {
					score[j] += point;
					subNum[j]++;
					break;
				} else if (name[j] == null) {
					name[j] = sName;
					subNum[j]++;
					break;
				}
			}
		}
		for (int i = 0; i < length; i++) {
			if (name[i] != null) {
				System.out.println("이름" + name[i] + "" + " 총점" + score[i] + " 과목수" + subNum[i]);
			}
		}
	}
}
