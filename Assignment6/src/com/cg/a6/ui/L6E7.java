package com.cg.a6.ui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class L6E7 {
	
	public static Object[] getSorted (int[] arr){
		List<Integer> Lst=new ArrayList<Integer>();
		for(int i: arr) {
			int rem=0;
			while(i!=0) {
				int Digit=i%10;
				rem=rem*10+Digit;
				i/=10;
			}
			Lst.add(rem);
		}		
		Collections.sort(Lst);
		return Lst.toArray();	
	}	
	
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=sc.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Object obj[]=getSorted(arr);
		for(Object o:obj) {
		   	System.out.println(o);
		}
		sc.close();
	}

}
