package decisionmaking_loops;

import java.util.Scanner;

public class sum_natural {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader=new Scanner(System.in);
		System.out.println("Please enter max limit: ");
		int max=reader.nextInt();
		int sum=0;
		
		for (int i=0;i<=max;i++) {
			sum=sum+i;
			
		}
		System.out.println("The sum of natural numbers: " +sum);

	}

}
