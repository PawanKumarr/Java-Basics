package com.pawan.basics;

public class HelloThread extends Thread {

	public void run(){
		System.out.println("Hello from a thread!");
	}
	
	public static void main(String[] args) {
		System.out.println("Hello from main()");
		new HelloThread().start();
		
		for(int i=0; i<10; i++){
			System.out.println("Hello from main() end" + i);
		}
	}

}
