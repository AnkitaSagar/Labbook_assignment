package com.cg.a4.ui;

import com.cg.a4.model.Book;
import com.cg.a4.model.CD;
import com.cg.a4.model.JournalPaper;
import com.cg.a4.model.Video;

public class Library {

	public static void main(String[] args) {
		Book book=new Book("B101","JavaProgramming",10,"Oracle");
		System.out.println(book);
		JournalPaper jp=new JournalPaper("J101","OOPS",5,"Oracle",1995);
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println(jp);
		Video video=new Video("V101","Java Programming Class",15,10,"Oracle","Teaching",1995);
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println(video);
		CD cd1=new CD("CD101","Java Tutorials",10,60,"Oracle","Teaching");
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println(cd1);
	}

}