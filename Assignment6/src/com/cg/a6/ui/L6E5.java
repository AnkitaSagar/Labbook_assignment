package com.cg.a6.ui;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class L6E5 {

	public int getSecondSmallest(int[] arr) {
		
        List<Integer> list = new ArrayList<Integer>();
        for(int i: arr){
               list.add(i);
        }
        Collections.sort(list);
        return list.get(1);
	}
 public static void main(String[] args) {
	 
	 L6E5 LE = new L6E5();
        
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number of element : ");
     int n=sc.nextInt();
     int [] arr=new int[n];
     for(int i=0;i<n;i++) {
    	 arr[i]=sc.nextInt();
     }
        
     int nav = LE.getSecondSmallest(arr);
     System.out.println(nav);
     sc.close();
     }
}
