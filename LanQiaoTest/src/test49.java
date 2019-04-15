
import java.util.Scanner;

public class test49 {
	public void getNum(StringBuffer s,int num[]){
		for(int i=0;i<s.length();i++){
			char c=s.charAt(i);
			if(c>='a'&&c<='z')
				num[c-'a']++;
			if(c>='A'&&c<='Z')
				num[c-'A']++;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		StringBuffer s=new StringBuffer(in.next());
		StringBuffer s0=new StringBuffer(in.next());
		int a[]=new int[26];
		int b[]=new int[26];
		test49 t=new test49();
		t.getNum(s, a);
		t.getNum(s0, b);
		boolean bb=true;
		for(int i=0;i<26;i++)
			if(a[i]!=b[i]){
				bb=false;
				break;
			}
		if(bb)
			System.out.println("Y");
		else
			System.out.println("N");
		in.close();
	}

}
