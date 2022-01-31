package decision_makingloops_1;

import java.util.Scanner;

public class reverse_forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader =new Scanner(System.in);
		System.out.println("Please enter number: ");
		int num=reader.nextInt();
		num=(num>0)?num:(-num);
		int rem=0;
		int reverse=0;
		
		for (;num>0;) {
			rem=num%10;
			reverse=reverse*10+rem;
			num=num/10;
		}
		System.out.println(reverse);
	}
}

//Try input 1.001245 >>>. Throws an mismatch error
          //  00012212
          //  -12345