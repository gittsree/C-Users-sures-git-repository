package data_conversions;

public class int_string_convesrion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=23;
		String s=String.valueOf(x);
		System.out.println("The integer value: "+x);
		System.out.println("The String value after conversion is: "+s);
		
		//Conversion from float to string
		float a=23.33f;
		String data=String.valueOf(a);
		System.out.println("The integer value: "+a);
		System.out.println("The String value after conversion is: "+data);
		
		//Type conversion from string to int
		String data1="10";
		int data2=Integer.parseInt(data1);
		System.out.println("The integer value: "+data1);
		System.out.println("The String value after conversion is: "+data2);
		

	}

}
