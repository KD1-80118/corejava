package com.test;
import java.util.Scanner;

import day10.Manager;
import day10.Salesman;
public class Test {
	public static void main(String[ ] args)
	{
		Manager m1 = new Manager();
		m1.accept();
		m1.display();
		
		Salesman S1 = new Salesman();
		S1.accept();
		S1.display();
	}

}
