package data_conversions;

import java.util.Scanner;

public class char_to_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x =55454;
		
		
		Scanner reader = new Scanner(System.in);
		char ch=reader.next().charAt(0);
		String st=Character.toString(ch);

		System.out.println("The converted string is: "+st);
		System.out.println("The value is: "+st.getClass().getName());
		

		
			}
}
//input: This is a char to string conversion
