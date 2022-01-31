package Programmin_Basics;

import java.util.Scanner;

public class Frequnecy_charcater_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader=new Scanner(System.in);
		char ch=reader.next().charAt(0);
		reader.nextLine();
		String str=reader.nextLine();
		int len=str.length();
		
		int num=0;
		for (int i=0;i<len;i++) {
			if (str.charAt(i)==ch) {
				num=num+1;
			}
			
		}
		System.out.println("The number of characters "+ch+" in a given string is "+ num);


	}

}
