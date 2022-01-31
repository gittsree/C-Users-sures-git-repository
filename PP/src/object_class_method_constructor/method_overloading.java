package object_class_method_constructor;

//Having multiple methods with same name is called method overloading
public class method_overloading {
	
	int x;
	int y;
 int z;
	
	int sum (){
		x=2;
		y=3;
		int z=  x+y;
		return z;	
	}
	
	void sum(int a,int b) {
		x=a;
		y=b;
		System.out.println(x+y);
	}
	
	/*void sum(int a,int b,int c) {
		x=a;
		y=b;
		z=c;
		System.out.println(x+y+z);
		
	}*/
	
	void sum(int a,double b,int c) {
		x=a;
		y=(int) b;
		z=c;
		System.out.println(x+y+z);
	}
	

	void display(){
		System.out.println(x+y);		
		}
	
	void sum1(int x,int y){
		this.x=x;
		this.y=y;
		System.out.println(x+y);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//method_overloading mo= new method_overloading();
		//mo.sum();
		//mo.display();
	
	method_overloading mo1=new method_overloading();
	mo1.sum(2,3.3,5);
	mo1.sum1(3,9332);
	
	
	
	
	

}}
