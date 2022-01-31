package object_class_method_constructor;

//Create a class employee
public class employee {
	// create variables in a class
    int empid;
	String empname;
	
	//Create a method in a class
	void display() {
		System.out.println(empid);
		System.out.println(empname);
	}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //To access variables or methods from class we need to create a object
		//Create a object
	
		employee emp1=new employee();
		emp1.empid=23;
		emp1.empname="Sri";
		emp1.display();
		
		employee emp2=new employee();
		emp2.empid=2;
		emp2.empname="Sri";
		emp2.display();
		
	}

}
