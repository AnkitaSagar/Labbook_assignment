package com.cg.a3.ui;

import java.time.LocalDate;
import java.time.Period;

public class L3E9 {
	public static void main(String[] args) 
	{
		
		LocalDate pdate = LocalDate.of(2021, 02, 14);
        LocalDate now = LocalDate.now();
 
        Period diff = Period.between(pdate, now);
 
        System.out.printf("\nDifference is "+ diff.getYears() + " years, " + diff.getMonths() + " months and " + diff.getDays() + " days.");
	}

}
