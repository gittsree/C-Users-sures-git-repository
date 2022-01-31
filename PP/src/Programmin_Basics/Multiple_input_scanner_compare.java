package Programmin_Basics;

import java.util.Scanner;

public class Multiple_input_scanner_compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter number: ");
		int[] input = new int[ reader.nextInt()];
		reader.nextLine();
		for (int i=0;i<input.length;i++) {
			input[i]=reader.nextInt();
				}
		int max=input[0];
		for (int i =0;i<input.length;i++) 
			if (input[i]>max)
			max=input[i];
		System.out.println("The largest number of all is: "+max);
			     
			}}