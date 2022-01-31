package Programmin_Basics;

import java.util.Scanner;
public class Multiply_from_keyboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter first number: ");
		float first=reader.nextFloat();
		System.out.println("Enter second number: ");
		float second=reader.nextFloat();
		float mul=first*second;
		System.out.println("The product of "+first+","+second+ "is: "+ mul);				
		

	}

}
