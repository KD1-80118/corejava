

package day10;

import java.util.Arrays;

/**
 * Core Java @ Sunbeam Karad Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-10-17 10:02
 */

public class Demo03Main {
	public static void main(String[] args) {
		Name[] arr = new Name[5];
		arr[0] = new  Name(3, "Nilesh", 50000.0);
		arr[1] = new  Name(1, "Sarang", 70000.0);
		arr[2] = new  Name(4, "Vishal", 60000.0);
		arr[3] = new  Name(5, "Prashant", 30000.0);
		arr[4] = new Name(2, "Nitin", 40000.0);

		System.out.println("Before Sort: ");
		for (Name e : arr)
			System.out.println(e);

		Arrays.sort(arr);
	
		System.out.println("After Sort: ");
		for (Name e : arr)
			System.out.println(e);
	}
}
