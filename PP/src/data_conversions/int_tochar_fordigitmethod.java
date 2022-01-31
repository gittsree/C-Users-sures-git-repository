package data_conversions;

public class int_tochar_fordigitmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=15;//this is not working
		har ch=Character.forDigit(num, 16);
		System.out.println(ch);

	}

}

//its not workinf ig the number is greater than 16
//for numbers greater than 16,what should be the radix number?