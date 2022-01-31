package decisionmaking_loops;

import java.util.Scanner;

public class print_table_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader=new Scanner(System.in);
		System.out.println("please enter number of table to be printed: ");
		int  num=reader.nextInt();
		System.out.println("Please enter limit: ");
		int num1=reader.nextInt();
		System.out.println("The tbale for "+num+" is: ");
		int i=1;
		//int tab;
		
		while(i<=num1) {
			 int tab=num*i;
			System.out.println(num+"*"+i+"="+tab);
			i++;
		}

	}

}
