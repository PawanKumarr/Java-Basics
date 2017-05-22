package com.pawan.basics;

public class JoinDemo implements Runnable {

	@Override
	public void run() {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws InterruptedException {
		long startTime = System.currentTimeMillis();
		System.out.println("Start of main()");
		Thread thread = new Thread(new JoinDemo());
		thread.start();
		
		thread.join();
		
		long endTime = System.currentTimeMillis();
		long timeTaken = (endTime - startTime) / 1000;
		System.out.println("End of main() after " + timeTaken + " seconds!");
	}

}
