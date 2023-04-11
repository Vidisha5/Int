
public class Syn {

	public static synchronized void main(String[] args) throws InterruptedException {
		Thread t = new Thread();
		t.start();
		System.out.println("x");
		synchronized (t) {
			t.wait(1000);
		}
		System.out.println("y");
	}
}
