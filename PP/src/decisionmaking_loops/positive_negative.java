package decisionmaking_loops;

import java.util.Scanner;

public class positive_negative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader=new Scanner(System.in);
		double num=reader.nextDouble();
		if (num<0.0) {
			System.out.println(num+" is a Negative number");
		}
			else if (num>0.0) {
				System.out.println(num+ " is a positive number");
			}
				else 
					System.out.println("The number is Zero");
			}
		
		
	}
//Try inputs
/*0.3333
0.00000
00.000
0
23
-89*/
