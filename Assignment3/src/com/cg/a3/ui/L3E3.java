package com.cg.a3.ui;

import java.util.Scanner;

public class L3E3 {
	
	static boolean isVowel(char ch) {
		if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') 
            return false;
		else
			return true;
	}
	
	static String alterString(char str[]) {
		
		for (int i = 0; i < str.length; i++) { 
            if (!isVowel(str[i])) { 
            	
                if (str[i] == 'z')  
                	str[i] = 'b'; 
                
                else {
                	str[i] = (char) (str[i] + 1);  
                    if (isVowel(str[i]))
                        str[i] = (char) (str[i] + 1);
                }
            }
        }
        return String.valueOf(str); 
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your value: ");
		String str=sc.nextLine();
		char str1[]=str.toCharArray();
		System.out.println("The altered string is: ");
		System.out.println(alterString(str1));
		sc.close();

	}

}
