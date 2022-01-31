package Programmin_Basics;

import java.util.Scanner;

public class terenary_operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader=new Scanner(System.in);
		int marks = reader.nextInt();
		String result = marks>65 ? "pass":"fail";
		System.out.println(result);	
		
		int input = reader.nextInt();
		String number=input>0?"Positive":"Negative";
		System.out.println(number);
		

	}

}
