package com.pawan.basics;

public class HelloRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("Hello from a Thread!");
	}

	public static void main(String[] args) {
		System.out.println("Hello from main()");
		new Thread(new HelloRunnable()).start();
	}

}
