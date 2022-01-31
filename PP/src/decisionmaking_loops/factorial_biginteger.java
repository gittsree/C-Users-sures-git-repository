package decisionmaking_loops;

import java.math.BigInteger;
import java.util.Scanner;

public class factorial_biginteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader=new Scanner(System.in);
		System.out.println("Please enter number: ");
		int num=reader.nextInt();
		BigInteger fact = BigInteger.ONE;
		
		for (int i=1;i<=num;i++) {
			fact=fact.multiply(BigInteger.valueOf(i));
			
		}
		
		System.out.println("The factorial: "+fact);
		
	}

}
