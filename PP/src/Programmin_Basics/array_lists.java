package Programmin_Basics;

import java.util.ArrayList;

public class array_lists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list=new ArrayList<>(2);
		list.add(0, "Apple");
		list.add("Banana");
		list.add("chicoo");
		System.out.println(list);
		list.set(1, "Grapes");
		System.out.println(list);
		list.remove(0);
		System.out.println(list);
		
		System.out.println(list.size());
		list.add(0, "Apple");
		list.sort(null);

		System.out.println(list);
	}

}
