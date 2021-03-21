package _04_Thread_Pool;

import java.util.concurrent.ConcurrentLinkedQueue;

public class Worker implements Runnable {
	ConcurrentLinkedQueue<Task> taskQueue;
	

	
	
	public Worker(ConcurrentLinkedQueue<Task> taskQueue2) {
		// TODO Auto-generated constructor stub
		this.taskQueue = taskQueue;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(!taskQueue.isEmpty()) {
			Task t = taskQueue.remove();
			t.per();
		}
	}
}