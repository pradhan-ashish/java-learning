package day10;

import java.util.Scanner;

public class ArrayDemo {
	
		public static void main(String[] args) {
			int [] arr = new int[3];
			
			//arr[0] = [5];
			//arr[1] = [6];
			//arr[2] = [7];
			
			for(int i=0; i<arr.length; i++) {
				System.out.println("Enter elements :");
				Scanner input = new Scanner(System.in);
				arr[i] = input.nextInt();
			}
			
		}
}
