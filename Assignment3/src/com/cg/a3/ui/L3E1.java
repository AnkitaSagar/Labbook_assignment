package com.cg.a3.ui;

import java.util.Scanner;
import java.util.StringTokenizer;

public class L3E1 {
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int number;
		int sum=0;
		System.out.println("Enter the numbers with one space gap");
		String str=sc.nextLine();
		StringTokenizer st=new StringTokenizer(str," ");
		while(st.hasMoreTokens())
		{
			String s=st.nextToken();
			number=Integer.parseInt(s);
			System.out.print(number + " ");
			sum+=number;
		}
		System.out.println();
		System.out.println("Sum is "+sum);
		sc.close();
	}
	
}
