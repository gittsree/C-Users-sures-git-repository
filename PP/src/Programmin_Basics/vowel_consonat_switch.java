package Programmin_Basics;

import java.util.Scanner;

public class vowel_consonat_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);
		System.out.println("Enter no.of characters: ");
		int [] input= new int[reader.nextInt()];
		reader.next();
		
		for (int i=0;i<=input.length;i++) {
			System.out.flush();
			input[i]=reader.next().charAt(i);			
		}
		
		/*for (int i=0;i<=input.length;i++) {
			switch (input[i]) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.println("Vowel");
				break;	
			// if((input[i]) == 'a'||(input[i]) == 'e' || (input[i]) == 'i'|| (input[i]) == 'o'|| (input[i]) == 'u' )
		     //       System.out.println((input[i]) + " is vowel");
		       // else
		         //   System.out.println((input[i]) + " is consonant");	
			}
			}		*/
	}}

