package Programmin_Basics;

import java.util.Scanner;

public class Even_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader=new Scanner(System.in);
		System.out.println("Enter any number: ");
		int x=reader.nextInt();
		/*if (x%2==0){
			System.out.println(x +" Is a even number");}
		
			else 
				System.out.println(x+ " Is a odd number");			
			}
		*/
		String evenOdd = (x % 2 == 0) ? "even" : "odd";

        System.out.println(x + " is " + evenOdd);
		
	}}


