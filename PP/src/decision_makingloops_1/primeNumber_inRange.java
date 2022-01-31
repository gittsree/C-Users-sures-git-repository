package decision_makingloops_1;

import java.util.Scanner;

public class primeNumber_inRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter lowee limit number: ");
		int min=reader.nextInt();
		System.out.println("Enter max limit number: ");
		int max=reader.nextInt();
		boolean flag=false;
		
		while (min<max) {
			for (int i=2;i<=min/2;i++){
				if(min%i==0)
				{
					flag=true;
					break;
				}}
			      
				if (!flag&&min!=0&&min!=1)
				
		                System.out.print(min + " ");
	            min+;				
			}flag=false;
	}
}
