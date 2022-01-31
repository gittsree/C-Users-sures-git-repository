package Programmin_Basics;
//A terenary operator inside another terenary operator is nested terenary operator
import java.util.Scanner;
import java.util.ArrayList;
//import java.util.Scanner;
public class nested_terenary_operator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		    ArrayList<Integer> list = new ArrayList<Integer>();
		    System.out.println("Enter your number");
		    Scanner scan = new Scanner(System.in);
		    int n=0;
		    while (n<3) {
		    int num = scan.nextInt();
		    n++;
		    }
		    int max = Integer.MIN_VALUE;
		    for (int i =0; i<list.size(); i++) {
		        if (list.get(i)>max) {
		            max=list.get(i);
		        }
		    }
		    System.out.println(max);
		        }
		    }


