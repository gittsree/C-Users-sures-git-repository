package Programmin_Basics;

public class Remove_white_spaces_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="This- i2 s- a -we ird- str ing";
        String Replaced=str.replaceAll("\\s","");
        System.out.println(Replaced);
	}

}
