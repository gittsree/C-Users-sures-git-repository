package object_class_method_constructor;

public class construtcor_overloading {

	int x;
	int y=4;
	
	construtcor_overloading(int x, int y){
		this.x=x;
		this.y=y;
		System.out.println(x+y);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		construtcor_overloading co1=new construtcor_overloading(3,4);

	}

}
