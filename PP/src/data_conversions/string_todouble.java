package data_conversions;

public class string_todouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//This throws an numberformatexception as string variable should contain numbers only
		String str="This is a String ";
		//double d1=Double.parseDouble(str);
		//System.out.println(d1);
		
		
		//Correct form of expression for converions
		String str1="687678687";
		double d2=Double.parseDouble(str1);
		System.out.println(d2);
		
		//Using valueof() method
		
		double d3=Double.valueOf(str1);
		System.out.println(d3);
		
		//Convert string containing comma to double
		
		String str2="2323,42,342";		
		str=str2.replaceAll("\\,", "");
		
		String str3="343,2233";
		String str4=str3.replace(',', '.');
		double d4=Double.parseDouble(str);
		System.out.println(d4);
		
	}

}
