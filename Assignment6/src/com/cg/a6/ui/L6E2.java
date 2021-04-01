package com.cg.a6.ui;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class L6E2 {
	
	public static void countChars(char[] c) {
		Map<Character, Integer> m=new HashMap<Character, Integer>();
		for(char c1:c) {
			if(m.containsKey(c1)){
				int a=m.get(c1);
				m.put(c1,a+1);
			}
			else {
				m.put(c1,1);
			}
		}
		System.out.println(m);			
	}
		
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the character : ");
		String str=scan.next();
		String newStr=str.toLowerCase();
		char arr[]=newStr.toCharArray();
		L6E2.countChars(arr);	
		scan.close();
	}

}
