
public class test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s=new StringBuffer("helloWorld");
		char c=s.charAt(3);
		s.append(c);
		s.deleteCharAt(3);
		System.out.println(s.toString());
	}

}
