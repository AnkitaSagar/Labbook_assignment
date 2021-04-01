package com.cg.a8.threads;

import java.util.Date;

public class TimerThread implements Runnable{
	
	@Override
	public void run() {
		while(true) {
			
			System.out.println("Timer: "+ new Date());
			
			try {
				Thread.sleep(10000);
			} 
			
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	

}