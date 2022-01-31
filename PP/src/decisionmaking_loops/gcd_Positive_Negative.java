package decisionmaking_loops;

import java.util.Scanner;

public class gcd_Positive_Negative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.println("Please enter first number: ");
		int num1= reader.nextInt();
		System.out.println("Please enter second number: ");
		int num2=reader.nextInt();		
		int gcd=0;
		int i=1;
		num1=(num1>0)?num1:-num1;
		num2=(num2>0)?num2:(-num2);
		
		while (i<=num1 && i<=num2) {
			if (num1%i==0 && num2%i==0) {
				gcd=i;
			}
			i++;
		}
		System.out.println("The GCD of "+ num1 + " & "+num2 + " is  " +gcd);
	}
		
		
			
		}
    
    



