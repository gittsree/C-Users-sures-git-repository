package data_conversions;

public class string_toint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="This is a string";
		String str1="23";
	   //Using parseInt() method
	    //int num=Integer.parseInt(str); // This thros number format exception
	    //System.out.println(num);

		int num1=Integer.parseInt(str1);
	    System.out.println(num1);
	    
	    //Using valueof() method	    
	    int num2= Integer.valueOf(str1);
	    System.out.println(num2);

	}

}
