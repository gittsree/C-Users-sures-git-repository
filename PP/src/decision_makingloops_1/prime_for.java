package decision_makingloops_1;

import java.util.Scanner;

public class prime_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader=new Scanner(System.in);
		int num1=reader.nextInt();
		num1=(num1>0)?num1:(-num1);
		double num=Double.valueOf(num1);
		boolean flag=false;
		
		for (int i =2;i<num/2;i++) {
			if(num%i==0) {
				flag=true;
				break;
				
			}}
			if(!flag) 
				System.out.println(num+ " is   a prime");
			
			else
				System.out.println(num+ " is not  a prime");
		

	}

}
