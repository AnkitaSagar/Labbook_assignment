package com.cg.a2.ui;

import java.util.Arrays;
import java.util.Scanner;

public class L2E2 {
	public void sortStrings(String arr[])
	{
		Arrays.sort(arr);
		for(String i:arr)
		{
			System.out.print(i+" ");
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of array");
		int n=sc.nextInt();
		System.out.println("Enter array of Strings");
		String str[]=new String[n+1];
		
		for(int i=0;i<str.length;i++)
		{
			str[i]=sc.nextLine();
		}		
		L2E2 obj=new L2E2();
		obj.sortStrings(str);
		sc.close();

	}

}
