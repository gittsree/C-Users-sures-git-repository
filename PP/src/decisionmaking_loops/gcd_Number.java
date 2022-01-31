package decisionmaking_loops;

public class gcd_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1=36;
		int num2=60;
		int gcd = 0;	
		
		for (int i=1;i<=num1 && i<=num2;i++) {
			if ((num1%i==0)&& (num2%i==0)){
			 gcd=i;					
			}
		}		
		System.out.println("The GCD of "+ num1 + " & "+num2 + " is  " +gcd);
	}

}
