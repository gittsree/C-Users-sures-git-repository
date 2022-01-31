package decision_makingloops_1;

import java.util.Scanner;

public class pallindrome_number_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader=new Scanner(System.in);
		int original=reader.nextInt();
		int reverse=0;
		int num=original;
		
		while(num!=0) {
			int digit =num%10;
			
			reverse=reverse*10+digit;
			num=num/10;
		}
		if (original==reverse) {
			System.out.println(reverse+ " is  pallindrome");
		}
		else
       System.out.println(reverse + " is not pallindrome");
	}

}
