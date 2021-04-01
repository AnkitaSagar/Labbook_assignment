package com.cg.a2.ui;

import java.util.Arrays;
import java.util.Scanner;

public class L2E3 {
	
	public void getSorted(int arr[], int n){
		
		int arr1[]=new int[n];
		int j=n;
		
		for(int i=0;i<n;i++){
			arr1[j-1]=arr[i];
			j=j-1;
		}
		for(int k:arr1){
			System.out.print(k+" ");
		}
		System.out.println();
		System.out.println("------------------------");
		Arrays.sort(arr1);
		for(int x:arr1)
		{
			System.out.print(x+" ");
		}		
			
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of array ");
		int num=sc.nextInt();
		int ar[]=new int[num];
		System.out.println("Enter the Elements");
		for(int y=0;y<num;y++){
			ar[y]=sc.nextInt();
		}
		
		L2E3 obj=new L2E3();
		obj.getSorted(ar, num);	
		sc.close();
	}

}
