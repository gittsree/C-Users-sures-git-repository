package data_conversions;

import java.util.Scanner;

public class String_Empty_null {

	
		  public static void main(String[] args) {
			  String str1 = null;
			    String str2 = "";
			    String str3 = "  ";

			    // check if str1 is null or empty
			  //  System.out.println("str1 is " + isNullEmpty(str1));
			  Scanner reader=new Scanner(System.in);
			  String str= reader.nextLine();
			  System.out.println("The String is "+str.isEmpty());
			  System.out.println("The String is "+str.isBlank());
			  System.out.println("The length of String is "+str.length());    
		    
		    }}
//input: Enter only space and check
//2. null
//3. vbv bnbyu buih 
//4. bjhghjbjghj
