import java.util.Scanner;

public class test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		long l=in.nextLong();
		if(l==0)
			System.out.println(0);
		else{
			StringBuffer s=new StringBuffer();
			long i;
			while(l>0){
				i=l%16;
				if(i>=0&&i<=9)
					s.insert(0, i+"");
				else if(i>=10&&i<=16){
					s.insert(0, (char)('A'+i-10));
				}
				l/=16;
			}
			System.out.println(s);
		}
		in.close();
	}

}
