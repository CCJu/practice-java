package test;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="123#43634##658";
		String s[]=str.split("#");
		for (String string : s) {
			System.out.println(string);
		}
	}

}
