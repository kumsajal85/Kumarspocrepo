package com.sajal.java17.practice.thread;

import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
	
	//private int count=0;
	//general approach
	/*
	 * public void increament() { count++; }
	 */
	
	//using synchronized
	/*
	 * public synchronized void increament() { count++; }
	 */
	
	//using Renentarentlock
	/*
	 * private final ReentrantLock lock =new ReentrantLock();
	 * 
	 * public void increament() { lock.lock(); try { count++; }finally {
	 * lock.unlock(); } }
	 */
	
	//using AtomicInteger
	
	private AtomicInteger count= new AtomicInteger(0);
	public void increament() {
		 count.getAndIncrement();
	}
	
	/*
	 * public int getCount() { return count; }
	 */
	
	public int getCount() {
		return count.get();
	}

}
