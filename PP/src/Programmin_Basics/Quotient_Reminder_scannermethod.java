package Programmin_Basics;

import java.util.Scanner;

public class Quotient_Reminder_scannermethod {

	static Scanner reader=new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number: ");
		int dividend = reader.nextInt();
		System.out.println("Enter number: ");
		int divisor =reader.nextInt();
		System.out.println("The quotient is: "+dividend/divisor);
		System.out.println("The reminder is: "+dividend%divisor);

		
		

		
	}

}
