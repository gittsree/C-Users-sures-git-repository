package decisionmaking_loops;

import java.math.BigInteger;

public class fibonacci_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BigInteger first=BigInteger.valueOf(0);
		BigInteger second=BigInteger.valueOf(1);
		BigInteger next=BigInteger.ONE;
		
		
		for (int i=0;i<=100;i++) {
		 System.out.print(first + ", ");
		   next=first.add(second);


		// long next=BigInteger.valueOf(next)+second;
		// System.out.println(next);
		 first=second;
		 second=next;
					}
	}
}

//Try with i =10 and as big as 100,1000 and so

//Try input i with 23,12,4,78 and so
