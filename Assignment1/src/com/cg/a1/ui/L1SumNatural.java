package com.cg.a1.ui;

import java.util.Scanner;

public class L1SumNatural {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int sum=calculateSum(n);
		System.out.println("The sum is " + sum);
		scan.close();
	}
	
	public static int calculateSum(int n) {
		int sum=0;
		for(int i=3;i<=n;i++) {
			if(i%3==0 || i%5==0)
				sum+=i;
		}
		return sum;
	}

}
