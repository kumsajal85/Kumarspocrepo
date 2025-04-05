package com.sajal.pratice.java17.feature;

public class VirtualThreadPoc {

	public static void main(String[] args) {

		Thread vThread=Thread.ofVirtual().start(()->
		System.out.println("Hello from virtual thread!"));
		
		try {
			vThread.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Main thread finished !!");
	}

}
