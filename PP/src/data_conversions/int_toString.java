package data_conversions;

public class int_toString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 23;
		//Using valueof() methid
		String str=String.valueOf(num);
		System.out.println(str);
		
		//Using .toString() method
		String str1=Integer.toString(num);
		System.out.println(str1);
       
		//Using Java String fromat() method
		
		String str2=String.format("%d",num);
		System.out.println(str2);
		
		//Another way of using String format()
		String str3=String.format("Number %s", num);
		System.out.println(str3);
		
		//Hexadecimal format() method
		String str4= String.format("Hexadecimal %x", num);
		System.out.println(str4);
		
		
	}

}
