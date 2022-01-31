package Programmin_Basics;

import java.util.Scanner;

public class Remove_digits_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader=new Scanner(System.in);
		String str=reader.nextLine();
		str=str.replaceAll("\\d", "");
        //sentence = sentence.replaceAll("\\s", "");
		System.out.println("The modified String is: "+str);
		
	}

}
//Input:Th2is 1is a String3
