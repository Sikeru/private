package ex;

public class Start3 {

	public static void main(String[] args) {
		int[] arr = new int[] { 7, 4, 5, 10, 1 };
		shuffle(arr);

	}

	public static void shuffle(int[] par) {
		int t = 0;
		int i, j;

		for (i = 0; i < 5; i++) {
			for (j = 0; j < 5; j++) {
				if (par[j] > par[i]) {
					t = par[i];
					par[i] = par[j];
					par[j] = t;
				}
			}
		}

		for (i = 0; i < 5; i++) {
			System.out.println(par[i]);
		}
	}

//	public void shuffle()
}
