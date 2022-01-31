package decisionmaking_loops;

import java.math.BigInteger;
import java.util.Scanner;

public class factorial_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader=new Scanner(System.in);
		System.out.println("Please enter number: ");
		int  num=reader.nextInt();
		int i=0;
		BigInteger fact=BigInteger.ONE;
		
		while( i<=num) {
			fact=fact.multiply(BigInteger.valueOf(i));
			
				}
	
		System.out.println("The factorial is: "+fact);

	}

}
