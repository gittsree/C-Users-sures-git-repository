package Programmin_Basics;
//import  Quotient_Reminder_scannermethod;

//public class Swap_numbers {
class Swap_numbers extends Quotient_Reminder_scannermethod{
  static int z;
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter 1st number: ");
		int x=reader.nextInt();
		System.out.println("Enter 2nd number: ");
		int y=reader.nextInt();
		System.out.println("Before Swap:");
		 System.out.println("Before Swap x is: "+x);
	        System.out.println("Before swap y is: "+y);
        z=x;
        x=y;
        y=z;
        System.out.println("After Swap:");
        System.out.println("After swap x is: "+x);
        System.out.println("After swap y is: "+y);	
	}
}
