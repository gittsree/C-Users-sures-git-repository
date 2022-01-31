package decision_makingloops_1;

import java.util.Scanner;

public class palindrome_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader=new Scanner(System.in);
		String str=reader.next();
		int length=str.length();
		char ch;
		String reverse = "";
		
		for (int i=length-1;i>=0;i--) {
			ch=str.charAt(i);
			reverse =reverse+ch;
			//System.out.println(ch);
			//system.out.println(reverse);
			}
		
		if (str.toLowerCase().contentEquals(reverse.toLowerCase())){
			System.out.println(reverse);
			System.out.println("its pallindrome");
		}
		else {
			System.out.println("It's not pallindorme");
			}
			}
		}


