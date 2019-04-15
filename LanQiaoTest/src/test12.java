import java.util.Scanner;

public class test12 {
	public long getNum(int j,int i){
		long s=1,s1=1;
		for(int m=1;m<=j;m++)
			s*=m;
		for(int n=i-j;n<=i-1;n++)
			s1*=n;
		return s1/s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		test12 t=new test12();
		for(int i=1;i<=n;i++){
			for(int j=0;j<=i-1;j++)
				System.out.print(t.getNum(j, i)+" ");
			System.out.println();
		}	
		
		in.close();
	}

}
