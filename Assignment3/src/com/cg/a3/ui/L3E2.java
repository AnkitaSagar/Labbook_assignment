package com.cg.a3.ui;

import java.util.Scanner;

public class L3E2 {
	
	public void getImage(String str) {	
		StringBuilder sb=new StringBuilder(str);
		StringBuilder s=sb.reverse();
		System.out.println("String Image ");
		System.out.println(str+"|"+s);		
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String ss=sc.nextLine();

		L3E2 obj=new L3E2();
		obj.getImage(ss);
		sc.close();
	}

}
