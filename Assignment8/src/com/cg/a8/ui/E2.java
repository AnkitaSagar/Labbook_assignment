package com.cg.a8.ui;

import com.cg.a8.threads.TimerThread;

public class E2 {

	public static void main(String[] args) {
		TimerThread timer=new TimerThread();
		Thread t1=new Thread(timer);
		t1.start();
		
		
	}

}