package data_conversions;

public class boolean_tostring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean s=true;
		boolean r=false;
		//Using valueof method
		String str= String.valueOf(s);
		String str1=String.valueOf(r);
		System.out.println(str);
		System.out.println(str1);
		//Using tostring method
		String str2=Boolean.toString(s);
		String str3=Boolean.toString(r);
		System.out.println(str2);
		System.out.println(str3);
		
		

		

		

	}

}
