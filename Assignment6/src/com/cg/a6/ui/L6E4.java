package com.cg.a6.ui;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class L6E4 {
	public HashMap<String, String> getStudents(HashMap<String,Integer> nav)
    {
           HashMap<String,String> medal = new HashMap<>();
           Set<String> set = nav.keySet();
           for(String s:set)
           {
                  Integer marks = nav.get(s);
                  if(marks>=90)
                  {
                        medal.put(s,"Gold");
                  }
                  else if(marks >=80)
                  {
                        medal.put(s,"Silver");
                  }
                  else if(marks>=70)
                  {
                        medal.put(s,"Bronze");
                  }
           }
           return medal;
    }
    public static void main(String[] ar) {
    	HashMap<String,Integer> h = new HashMap<>();
        L6E4 p = new L6E4();
	    System.out.println("size of HashMap : ");
	   	Scanner scan=new Scanner(System.in);
	   	int n=scan.nextInt();
	   	for(int i=0;i<n;i++) {
	   		String x=scan.next();
	   		Integer y=scan.nextInt();
	   		h.put(x, y);
	   	}
   		scan.close();

        System.out.println(p.getStudents(h));
    
    }

}
