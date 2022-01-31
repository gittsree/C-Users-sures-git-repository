package data_conversions;

public class double_toString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double d1=8789789;
		//Using valueof() method
		String str=String.valueOf(d1);
		System.out.println(str);
		
		//Using tostring() method
		String str1=Double.toString(d1);
		System.out.println(str1);
		
		//Using +operator
		System.out.println(""+d1);
		
		//using fromat() method
		String str2=String.format("%f", d1);
		System.out.println(str2);
		

	}

}
