package decisionmaking_loops;

import java.util.Scanner;

public class facctorial_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader=new Scanner(System.in) ;	
		System.out.println("Please enter number: ");
		int num=reader.nextInt();
		double fact=1;
		
		for (int i=1;i<=num;i++) {
			fact*=i;
			//same as above fact=(fact*i);
			
		}
		
	  System.out.println(fact);
		
	}

}
/* try input: 5
25
15
*/