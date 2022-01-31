package decision_makingloops_1;

import java.util.Scanner;

public class prime_number_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter  number: ");
		int num=reader.nextInt();
		//System.out.println("Enter max number: ");
		int i=2;
		boolean flag=false;
		while (i<=num/2) {
			if(num%i==0) {
				flag=true;
				break;			
			}
			i++;		
		}
		if (!flag)
			System.out.println(num+ " is a prime");
		else
			System.out.println(num +" is not a prime");
		

	}

}
