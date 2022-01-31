package decisionmaking_loops;

import java.util.Scanner;

public class leap_year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader=new Scanner(System.in);
		System.out.println("Please enter Year: ");
		int year=reader.nextInt();
		int ly=year%4;
		if (ly==0) {
			System.out.println(year + " is a leapyear");
		}
			else 
				System.out.println(year + " is not a leap year");
		}	
		
	}


