package com.test;

import day10.Employee;

public class box1 {
	class Box<T extends Employee> 
	{
	 private T obj;

	public T get()
	{
		return this.obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
	 
	public double getTotalsalary()
	{
	    return obj.calcTotalSalary();	
	}

	}


}
