public class D {
public static void main(String[] args) {
	ThreadJoining t1  = new ThreadJoining();
	ThreadJoining t2 = new ThreadJoining();
	t1.start();
	
	try {
		t1.join();
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	System.out.println(t1.isAlive());
	//t1.start();
	t2.start();
}
}
class ThreadJoining extends Thread{
	@Override
	public void run() {
		for(int i=0;i<2;i++) {
			try {
				Thread.sleep(500);
				System.out.println("Current thread:"+Thread.currentThread().getName());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
