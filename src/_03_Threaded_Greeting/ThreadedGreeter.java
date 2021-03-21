package _03_Threaded_Greeting;

public class ThreadedGreeter implements Runnable {
int a;
	public ThreadedGreeter(int i) {
		// TODO Auto-generated constructor stub
		a = i;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Hello from thread number: " + a);
		if (a < 50) {
			Thread t = new Thread(()->{
				new ThreadedGreeter(a+1);
			});
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}}
		

}
