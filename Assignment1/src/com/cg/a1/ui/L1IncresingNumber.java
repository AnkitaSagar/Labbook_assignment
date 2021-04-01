package com.cg.a1.ui;

import java.util.Scanner;

public class L1IncresingNumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		boolean flag=checkNumber(n);
		if(flag==true)
			System.out.println("It is an Increasing number");
		else
			System.out.println("It is not an Increasing number");
		scan.close();
	}
	
	public static boolean checkNumber(int n) {
		boolean difference=false;
		
		while(n>9) {
			int d=n%10;
			n=n/10;
			int d1=n%10;
			if((d-d1)>=0)
				difference=true;
			else {
				difference=false;
				break;
			}
		}
		
		return difference;
	}

}
