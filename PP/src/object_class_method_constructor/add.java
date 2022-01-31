package object_class_method_constructor;

public class add {
	int x;
	int y;
	
	void dsiplay() {
		System.out.println();
	}
	
	
	//Create a method with parameters and return value
	int sum(int x,int y){
		return x+y;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		add add1=new add();
		int r =add1.sum(2, 3);
		System.out.println(r);
		///add1.dsiplay();
	}

}
