package Assignments;

import java.util.Scanner;

public class Assignment8 {

	public static void main(String[] args) {
		// Accept temperature in celsius and convert it to fahrenheit
		
		Scanner sc = new Scanner(System.in);
		System.out.println("What unit of temperature do you have?"+ "  Enter 'c' or 'f'");
		String initialUnit= sc.next();
		
		
		
		switch(initialUnit) {
		case "c":
				System.out.println("Enter the celsius temperature: ");
				double celsius = sc.nextDouble();
		
				double fahrenheit = (1.8*celsius)+32;
				System.out.println(celsius+" degree celsius is equals to "+fahrenheit+" degree fahrenheit.");
				System.out.println("=======================================================================");
				
				System.out.println("Do you also want to convert F to C?" +" type  yes or no.");
				String yesOrNo= sc.next();
				if (yesOrNo.equals("no")) {
					break;// break will bring it to line 38
				}
				
		case"f":
				System.out.println("Enter the fahrenheit temperature: ");
				 fahrenheit = sc.nextDouble();
	
				 celsius = (fahrenheit-32)/1.8; 
				System.out.println(fahrenheit+" degree fahrenheit is equals to "+celsius+" degree celsius.");
				
		}		System.out.println("=======================================================================");
		System.out.println("Thank you. Goodbye");
		
	}

}
