package com.cg.a5.ui;

import java.util.Scanner;

import com.cg.eis.exception.EmployeeException;

public class L5E3 {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Employees's salary: ");
		int salary = scan.nextInt();
		scan.close();
		try {
			if(salary < 3000) {
				throw new EmployeeException("Salary cannot be below 3000");
			}
			else {
				System.out.println("Salary is accepted");
			}
		}
		catch(EmployeeException excep) {
			System.out.println(excep);
		}
	}
}
