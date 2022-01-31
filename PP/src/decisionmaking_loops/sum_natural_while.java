package decisionmaking_loops;

import java.util.Scanner;

public class sum_natural_while {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Scanner reader=new Scanner(System.in);
		System.out.println("Please enter min number: ");
		int min=reader.nextInt();
		reader.nextLine();
		System.out.println("Please enter max number: ");
		int max=reader.nextInt();	
		int sum=0;
		//int temp=0;
		
		while (min<=max) {
			
			sum=sum+min;
			min++;
			//System.out.println("The sum : "+sum);

			    }
		System.out.println("The sum of natural numbers: "+sum);

			}	
}
			


