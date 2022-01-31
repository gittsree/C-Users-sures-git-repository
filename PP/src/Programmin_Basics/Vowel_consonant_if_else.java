package Programmin_Basics;

import java.util.Scanner;

public class Vowel_consonant_if_else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader =new Scanner(System.in);
		char ch=reader.next().charAt(0);
		//char ch='e';
		 if(ch == 'a'|| ch == 'e' || ch == 'i'|| ch == 'o'|| ch == 'u' )
	            System.out.println(ch + " is vowel");
	        else
	            System.out.println(ch + " is consonant");			
		}
	}