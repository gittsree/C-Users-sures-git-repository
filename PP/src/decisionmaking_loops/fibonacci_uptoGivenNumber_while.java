package decisionmaking_loops;

import java.util.Scanner;

public class fibonacci_uptoGivenNumber_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     int first=0;
     int second=1;
     int i=1;
      while (first<=1000) {
    	  System.out.print(first+",");
    	  int next=first+second; 	  
     	  first=second;
 	      second=next;
    	  i++;
    	  
      }
		

	}

}
