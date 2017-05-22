package com.pawan.basics;

public class InterruptMessages implements Runnable {

	@Override
	public void run() {
		for(int i=1; i<10; i++){
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println("Thread's sleep interrupted! No more naps!");
				return;
			}
			System.out.println("Thread taking nap " + i);
		}
	}

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Inside main(), Going to Launch a Thread!");
		
		Thread thread = new Thread(new InterruptMessages());
		thread.start();
		
		Thread.sleep(8000);
		if(!thread.isInterrupted()) {
			System.out.println("Inside main(), Going to Interrupt Thread!");
			thread.interrupt();
		}
		
		System.out.println("Inside main(), its going to end!");
	}

}
