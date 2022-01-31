package Programmin_Basics;
import java.util.Scanner;

public class Scanner_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader=new Scanner(System.in);
		int s=reader.nextInt();
		System.out.println("The nextInt o/p is: "+s);
		//Closing the Scanner object
		
		float nyFloat=reader.nextFloat();
		System.out.println("My float value thru nextFloat() method: "+nyFloat);
		
        String newstring=reader.next();
        System.out.println("The Sting value thru next() method: "+newstring);	

        reader.nextLine();
        String newstringline=reader.nextLine();
        
        System.out.println("The line of string thru nextline() method: "+newstringline);
        reader.close();
        
        
        //Scanner reader1 = new Scanner (newstring str);
	}
}