package data_conversions;

public class wrapper_object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer obj1=Integer.valueOf(23);
		int val1=obj1.intValue();
		System.out.println(val1);

		Double obj2=Double.valueOf(232232323);
		double val2=obj2.doubleValue();
		System.out.println(val2);
		
		Boolean obj3=Boolean.valueOf(false);
		Boolean val3=obj3.booleanValue();
		System.out.println(val3);
	}

}
