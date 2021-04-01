package com.cg.a5.ui;

import java.util.Scanner;

public class L5E1 extends Exception{
	
	private static final long serialVersionUID = 1L;

	public L5E1(String errMsg) {
		super(errMsg);
	}
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age = scan.nextInt();
		scan.close();
		
		try {
			if(age<15) {
				throw new L5E1("INVALID AGE! Age should be above 15"); 
			}
			else {
				System.out.println("VALID AGE");
			}
		}
		catch(L5E1 excep) {
			System.out.println(excep);
		}
	}
}
