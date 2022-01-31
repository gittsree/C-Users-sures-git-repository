package object_class_method_constructor;

		//Create a class employee
		public class employee1 {
			// create variables in a class
		    int empid;
			String empname;
			
			//Create a method in a class
			void display() {
				System.out.println(empid);
				System.out.println(empname);
			}	
			
			//Create a constructor
			employee1(int id, String name){
				empid=id;
				empname=name;}
				

			public static void main(String[] args) {
				// TODO Auto-generated method stub
		       //To access variables or methods from class we need to create a object
				//Create a object
				
				//Calling thru constructor
				//First create an object
				employee1 emp1=new employee1(34,"Sri");
				employee1 emp2=new employee1(11,"Keer");
				emp1.display();
				emp2.display();						
				
			}
}
