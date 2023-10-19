package com.sunbeam.book.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class TesterStoreBookList {
	
	static int menu() {
		System.out.println("**************************************************");
		System.out.println("0.EXIT");
		System.out.println("1. Add new book in list.");
		System.out.println("2. Display all books in forward order.");
		System.out.println("3. Delete at book given index");
		System.out.println("4. Check if book with given isbn is in list or not");
		System.out.println("5. Delete all books in list");
		System.out.println("6. Display number of books in list");
		System.out.println("7. Sort all books by price in desc order");
		System.out.println("Enter your choice = ");
		int choice = new Scanner(System.in).nextInt();
		System.out.println("**************************************************");
		return choice;
	}
	public static void main(String[] args) {
		int choice;
		StoreBookList book;
		List<StoreBookList> bookList = new ArrayList<>();
		while((choice=menu())!=0) {
			switch(choice) {
			case 1:
				book = new StoreBookList();
				book.accept();
				bookList.add(book);
				System.out.println("-----------------------");
				System.out.println("Book Added Successfully");
				break;
			case 2:
//				for (Iterator iterator = bookList.iterator(); iterator.hasNext();) {
//					StoreBookList showBookList = (StoreBookList) iterator.next();
//					System.out.println(showBookList);
//				}
				ListIterator<StoreBookList> list= bookList.listIterator();
				while(list.hasNext()) {
					
				}
				break;
			case 3:
	
				break;
			case 4:
	
					break;
			case 5:
	
				break;
			case 6:
	
				break;
			case 7:
	
				break;
			default:
				System.out.println("Wrong Choice...:(");
				break;
			}
		}
		System.out.println("Thank you for using our app...:)");
	}
}











