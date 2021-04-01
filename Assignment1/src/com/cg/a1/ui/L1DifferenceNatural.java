package com.cg.a1.ui;

import java.util.Scanner;

public class L1DifferenceNatural {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int difference=calculateDifference(n);
		System.out.println("The difference is " + Math.abs(difference));
		scan.close();
	}
	public static int calculateDifference(int n) {
		int difference=0;
		int sum1=0, sum2=0;
		for(int i=1;i<=n;i++) {
			sum1+=(i*i);
			sum2+=i;
		}
		difference=(sum2*sum2)-sum1;
		return difference;
	}

}
