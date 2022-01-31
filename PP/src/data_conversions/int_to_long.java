package data_conversions;

import java.util.Scanner;

public class int_to_long {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner reader = new Scanner("System.in");
    //int num=reader.nextInt();
   int num1=444;
    Long obj = Long.valueOf(num1);
    //Another way for wide typecasting
    long num2 =num1;    
    System.out.println(obj);
    System.out.println(num2);

	}

}
