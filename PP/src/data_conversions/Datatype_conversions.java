package data_conversions;

public class Datatype_conversions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Widening cast example which converts from lower to higher data type
		/*int x=5;
		float y =x;
		long z= x;
		float l=z;
		System.out.println("The value before conversions: "+x);
		System.out.println("The value after conversions: "+y);
		System.out.println("The value later conversions: "+z);
		
		
		//Narrow casting example:Which converts from higher to lower data type
		//double>>float>>long>>int>>char>>short>>byte
		*/
		
		//Conversion from float/long to int
		float a= 45.55f;
		//long b =(long) a;
		int c =(int) a;
		System.out.println("The value before conversions: "+a);
		//System.out.println("The value before conversions,long: "+b);
		System.out.println("The value before conversions,int: "+c);	
		
		

	}

}
