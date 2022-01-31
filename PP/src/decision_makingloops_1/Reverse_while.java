package decision_makingloops_1;

import java.util.Scanner;

public class Reverse_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader=new Scanner(System.in);
		System.out.println("Please enter number: ");
		int num=reader.nextInt();
		
		int rem=0;
		int reverse=0;
		
		while(num!=0) {
			 rem=num%10;
			reverse=reverse*10+rem;
			num=num/10;
			
			
		}
		
		System.out.println(reverse);
	}

}
