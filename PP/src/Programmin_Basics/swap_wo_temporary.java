package Programmin_Basics;

class swap_wo_temporary extends Swap_numbers{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number: ");
				float x= reader.nextFloat();
		System.out.println("Enter number: ");

		int y=reader.nextInt();
		System.out.println("Before Swap: ");
		System.out.println("1st number: "+x);
		System.out.println("2nd  number: "+y);

		x = x - y;
        y = (int) (x + y);
        x = y - x;
		
		System.out.println("After Swap: ");
		System.out.println("1st number: "+x);
		System.out.println("2nd  number: "+y);
}}
