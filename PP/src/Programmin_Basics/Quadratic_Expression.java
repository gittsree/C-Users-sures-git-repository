package Programmin_Basics;

import java.util.Scanner;

public class Quadratic_Expression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader=new Scanner(System.in);
		double a= reader.nextDouble();
		double b= reader.nextDouble();
		double c= reader.nextDouble();
		
		//double a=50;
		//double b=100;
		//double c=50;
		double root1;
		double root2;
		double determinant=(b*b)-4*(a*c);
		if (determinant>0){
			System.out.println("Roots are real and different");
			// (-b ± √(b2-4ac)) / (2a)
			root1= (-b+Math.sqrt((b*b)-4*a*c))/2*a;
			root2= (-b-Math.sqrt((b*b)-4*a*c))/2*a;
			
		      System.out.format("root1 = %.2f and root2 = %.2f", root1, root2);			
			
		}
		else if(determinant==0){
			System.out.println("Roots are real and same");
			root1= (-b+Math.sqrt((b*b)-4*a*c))/2*a;
			root2= (-b-Math.sqrt((b*b)-4*a*c))/2*a;
			
		      System.out.format("root1 = %.2f and root2 = %.2f", root1, root2);	
		}
		else {
			System.out.println("Roots are real and complex");
			double real=-b/(2*a);
		      double imaginary = Math.sqrt(-determinant) / (2 * a);
		      System.out.format("root1 = %.2f+%.2fi", real, imaginary);
		      System.out.format("\nroot2 = %.2f-%.2fi", real, imaginary);


		}
			}
	}

