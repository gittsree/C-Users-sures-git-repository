
package data_conversions;

public class string_toboolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="    ";
		//Parseboolean() method to convert
		Boolean b= Boolean.parseBoolean(str);
		System.out.println(b);
		
		//Using valueOf method
		boolean b1=Boolean.valueOf(str);
		System.out.println(b1);
		
		

		

	}

}
//Why it is retruning false in this case?
