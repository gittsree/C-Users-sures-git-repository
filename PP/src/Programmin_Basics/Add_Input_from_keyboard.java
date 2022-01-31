package Programmin_Basics;

import java.util.Scanner;

public class Add_Input_from_keyboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Reader=new Scanner(System.in);
		System.out.println("Enter first number: ");
		int first=Reader.nextInt();
		
		System.out.println("Enter Second number: ");
		int second=Reader.nextInt();
		
		int sum=first+second;
		System.out.println("The sum of "+first+","+second +": "+sum);
		
		

	}

}
