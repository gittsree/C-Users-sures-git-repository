package data_conversions;

public class primitive_objects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Conversion of primitive to data objects
		int a = 3434;
		Integer aobj=Integer.valueOf(a);
		
		double b=242424434;
		Double bobj=Double.valueOf(b);
		
		boolean  c=true;
		Boolean cobj=Boolean.valueOf(c);
		
		if (aobj instanceof Integer) {
			System.out.println("A Integer dataobject is created");
			
		}
		
		if (bobj instanceof Double) {
			System.out.println("A Double dataobject is created");
			
		}
		
		if (cobj instanceof Boolean) {
			System.out.println("A Boolean dataobject is created");

		}
		
	}

}
