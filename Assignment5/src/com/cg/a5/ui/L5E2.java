package com.cg.a5.ui;

import java.util.Scanner;

public class L5E2 extends Exception{
	
	private static final long serialVersionUID = 1L;

	public L5E2(String errMsg) {
		super(errMsg);
	}
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your first name: ");
		String fName = scan.nextLine();
		System.out.println("Enter your last name: ");
		String lName = scan.nextLine();
		scan.close();
		
		try {
			if(fName.isBlank() || lName.isBlank()) {
				throw new L5E2("First name or Last name should not be blank"); 
			}
			else {
				System.out.println(fName + " " + lName);
			}
		}
		catch(L5E2 excep) {
			System.out.println(excep);
		}
	}

}
