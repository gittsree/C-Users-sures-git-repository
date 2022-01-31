package data_conversions;

import java.util.Scanner;

public class char_to_int {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader=new Scanner(System.in);
		char ch=reader.next().charAt(2);
		/*int num=Character.getNumericValue(ch);
		System.out.println(num);*/
		
		System.out.println(Integer.parseInt(String.valueOf(ch)));

	}

}
