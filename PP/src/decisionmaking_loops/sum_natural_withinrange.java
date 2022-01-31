package decisionmaking_loops;

import java.util.Scanner;

public class sum_natural_withinrange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader=new Scanner(System.in);
		System.out.println("Please enter min number: ");
		int min=reader.nextInt();
		reader.nextLine();
		System.out.println("Please enter max number: ");
		int max=reader.nextInt();
		int sum=0;
		
		for (int i=min;i<=max;i++) {
			sum=sum+i;
			
			
		}
		
		System.out.println("The sum of natural numbers in a given range is: "+sum);
		
	

	}

}
