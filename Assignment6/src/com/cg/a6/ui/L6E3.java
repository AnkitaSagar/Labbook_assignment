package com.cg.a6.ui;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class L6E3 {
	
	public static HashMap<Integer,Integer> getSquares(int[] array) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int n : array) {
			map.put(n, n * n);
		}
		return map;
	}

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of element : ");
        int n=scan.nextInt();
        int [] array=new int[n];
        for(int i=0;i<n;i++) {
        	array[i]=scan.nextInt();
        }
		
		
		HashMap<Integer, Integer> map =getSquares(array);

		Iterator<Integer> it = map.keySet().iterator();
		while (it.hasNext()) {
			Integer key = it.next();
			System.out.println(key + " : " + map.get(key));
		}
		scan.close();
	}

}
