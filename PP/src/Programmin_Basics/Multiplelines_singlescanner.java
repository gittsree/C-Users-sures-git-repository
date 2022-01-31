package Programmin_Basics;

import java.util.Scanner;

public class Multiplelines_singlescanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter Iterations: ");

		int [] input=new int[reader.nextInt()];
		reader.nextLine();
		for (int i=0;i<input.length;i++) {
			input[i]=reader.nextInt();								
		}
		System.out.println("The entered inputs are: ");
		for (int i=0;i<input.length;i++) {
			int largest=(input[i]>input[i+1])?(input[i]>input[i+2])?input[i]:input[i+1]:(input[i+1]>=input[i+2]?input[i+1]:input[i+2]);
			//(x>=y)?(x>=z)?x:y:(y>=z)?y:z;
		System.out.println(largest);}
	}}


	
	