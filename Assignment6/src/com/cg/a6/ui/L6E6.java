package com.cg.a6.ui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class L6E6 {
	
	public static  List<Integer> votersList(Map<Integer,Integer> M) {
		List<Integer> list=new ArrayList<Integer>();
		Set<Integer> s= M.keySet();
		for(int k:s) {
			if(M.get(k)>18) {
				list.add(k);
			}
		}
		return list;
	}
	public static void main(String[] args) {
		Map<Integer,Integer> nav=new HashMap<Integer,Integer>();
		
		System.out.println("Total no. of Person details to be enter : ");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++) {
			Integer x=s.nextInt();
			Integer y=s.nextInt();
			nav.put(x, y);
		}	
		System.out.println(votersList(nav));	
		s.close();
	}

}
