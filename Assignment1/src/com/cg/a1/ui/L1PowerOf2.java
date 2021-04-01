package com.cg.a1.ui;

import java.util.Scanner;

public class L1PowerOf2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		boolean flag=checkNumber(n);
		if(flag==true)
			System.out.println("It is Power of 2");
		else
			System.out.println("It is not Power of 2");
		scan.close();

	}
	
	public static boolean checkNumber(int n) {
		boolean check=false;
		int number=2;
		while(number<=n) {
			if(number==n) {
				check=true;
				break;
			}
			number*=2;
		}
		return check;
	}
}
