package decision_makingloops_1;

import java.util.Scanner;

public class power_number_powFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader=new Scanner(System.in);
		System.out.println("Please enter number: ");
		int num=reader.nextInt();
		System.out.println("Please enter power number: ");
		int pow=reader.nextInt();
		
		double result=Math.pow(num, pow);
		System.out.println(result);
	}

}
//Try input 3,-4
// -4,2
//-2,-4