import java.util.Scanner;

public class test51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		StringBuffer s=new StringBuffer(in.next());
		for(int i=0;i<s.length();i++){
			char c=s.charAt(i);
			if(c>='A'&&c<='Z') System.out.print((char)(c+32));
			if(c>='a'&&c<='z') System.out.print((char)(c-32));
		}
		in.close();
	}

}
