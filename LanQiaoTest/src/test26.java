import java.util.Scanner;

public class test26 {
	public void getString(StringBuffer s,int index,int end){
		StringBuffer sb=new StringBuffer(s.toString());
		s.append((char)('A'+index-1));
		s.append(sb);
		if(index==end) {System.out.println(s);return;}
		getString(s, index+1, end);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		test26 t=new test26();
		t.getString(new StringBuffer(""), 1, n);
	}

}
