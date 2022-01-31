package decision_makingloops_1;

import java.util.Scanner;

public class power_number_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader=new Scanner(System.in);
		System.out.println("Please enter number: ");
		int num=reader.nextInt();
		System.out.println("Please enter power number: ");
		int pow=reader.nextInt();
		int result=1;
		
		while(pow>0) {
			result=result*num;
						
			--pow;
			
		}
		System.out.println(result);
			}

}
