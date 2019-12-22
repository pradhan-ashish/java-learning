package Assignments;

public class Assignment11 {

	public static void main(String[] args) {
		// 11.	Write a program to swap two numbers
		// a) using temp variable
		
		int a =5;
		int b=6;
		System.out.println("Before swapping a is:"+a);
		System.out.println("Before swapping b is:"+b);
		
		int temp = a;
		a=b;
		b=temp;
		System.out.println("After swapping a is:"+a);
		System.out.println("After swapping b is:"+b);
		
		//b) without temp variable
		
		int x =5;
		int y=6;
		System.out.println("Before swapping a is:"+x);
		System.out.println("Before swapping b is:"+y);
		
		x = x+y;
		y = x-y;
		x= x-y;
		
		System.out.println("After swapping a is:"+x);
		System.out.println("After swapping b is:"+y);
		
	}

}
