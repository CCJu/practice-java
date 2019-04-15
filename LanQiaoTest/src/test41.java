import java.util.Scanner;

public class test41 {
	public void getAn(StringBuffer s,int n){
		if(n==0)
			return ;
		char c;
		if(n%2==0)
			c='+';
		else
			c='-';
		s.replace(0, s.length(),"sin("+n+c+s.toString()+")");
		n--;
		getAn(s, n);
	}
	public void getSn(int n){
		StringBuffer ss=new StringBuffer("sin(1)"+'+'+n);
		if(n==1) System.out.println(ss);
		else{
			for(int i=1;i<=n;i++){
				if(i==1) continue;
				StringBuffer s=new StringBuffer("sin("+i+")");
				getAn(s, i-1);
				ss.replace(0, ss.length(), "("+ss+")"+s+'+'+(n-i+1));
				//System.out.println(s.toString());
			}
			System.out.println(ss);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		test41 t=new test41();
		t.getSn(n);
		in.close();
	}

}
