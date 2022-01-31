package decision_makingloops_1;

import java.util.Scanner;

public class countNoofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	  Scanner reader= new Scanner(System.in);
	  System.out.println("Please enter number: ");
	  int num=reader.nextInt();
	  int count=0;
	  	  
	  while (num!=0) {
		  num=num/10;
		  count++;		  		  
	  }
	 	  System.out.println(count);
	}
}

//Try input -100000
            //327388
            //00000687687687