import java.util.Scanner;

public class test21 {
	public int[][] multiply(int a[][],int b[][]){
		int s[][]=new int[a.length][a.length];
		for(int i=0;i<s.length;i++)
			for(int j=0;j<s.length;j++){
				int ss=0;
				for(int num=0;num<s.length;num++)
					ss+=a[i][num]*b[num][j];
				s[i][j]=ss;
			}
				
		return s;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		test21 t=new test21();
		int n=in.nextInt();
		int m=in.nextInt();
		int a[][]=new int[n][n];
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				a[i][j]=in.nextInt();
		int s[][]=new int[n][n];
		s=a;
		for(int i=1;i<m;i++){
			s=t.multiply(s, a);
		}
		for (int[] is : s) {
			for (int i : is) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}
