package com.cg.a2.ui;

import java.util.*;

public class L2E1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int array[]=new int[n];
		for(int i=0;i<n;i++)
			array[i]=scan.nextInt();
		
		int second=getSecondSmallest(array);
		System.out.println("The second smallest element is the array is " +second);
		scan.close();
	}
	
	public static int getSecondSmallest(int array[]) {
		Arrays.sort(array);		
		return array[1];
	}

}
