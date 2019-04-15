import java.util.Scanner;

public class test7 {
	public int getNum(char c){
		if(c>='0'&&c<='9'){
			return (c-'0');
		}else if(c>='A'&&c<='F'){
			return 10+c-'A';
		}else
			return -1;

	}
	public long getS(char c,int i){
		long l=1;
		if(i==0)
			l=1;
		else
			for(int n=1;n<=i;n++)
				l*=16;
		
		return l*getNum(c);
	}
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		String s=in.next();
		long num = 0;
		int length=s.length();
		test7 t=new test7();
		for(int i=0;i<length;i++){
			num+=t.getS(s.charAt(i), length-1-i);	
		}
		System.out.println(num);
		in.close();
	}
	
}
