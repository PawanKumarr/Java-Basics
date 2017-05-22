package com.pawan.basics;

public class SleepMessages {

	public static void main(String[] args) throws InterruptedException {
		for(int i=1; i<6; i++){
			Thread.sleep(2000);
			System.out.println("Hello from main() " + i);
		}
	}

}
