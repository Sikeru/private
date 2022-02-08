package thread.ex1;

public class Blue extends Thread {
	public void run() {
		while (true) {
			System.out.println("청기 올려!!!");
		}
	}
}
