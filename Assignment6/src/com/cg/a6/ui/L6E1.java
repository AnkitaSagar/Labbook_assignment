package com.cg.a6.ui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class L6E1 {
	
	public static ArrayList<Integer> getValues(HashMap<String, Integer> h) {
		ArrayList<Integer> li = new ArrayList<>(h.values());
		Collections.sort(li); 
		return li;
	}

	public static void main(String[] args) {
		
		HashMap<String, Integer> h=new HashMap<>();
		System.out.println("size of HashMap : ");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		
		for(int i=0;i<n;i++) {
			String x=scan.next();
			Integer y=scan.nextInt();
			h.put(x, y);
		}
		scan.close();
		
		System.out.println(getValues(h));
	}

}
