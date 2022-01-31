package Programmin_Basics;

import java.util.Scanner;

public class FindLargest_NestedTerenary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.println("Please enter 1st number: ");
		int x=reader.nextInt();
		System.out.println("Please enter 2nd number: ");
		int y=reader.nextInt();
		System.out.println("Please enter 3rd number: ");
		int z=reader.nextInt();
		int largest = (x>=y)?(x>=z)?x:y:(y>=z)?y:z;
		System.out.println("The largest number is: "+ largest);		
			}
}
