import java.util.Scanner;

public class test50 {
	
	public int[][] getResult(int m,int s,int n,int a[][],int b[][]){
		int c[][]=new int[m][n];
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++){
				for(int k=0;k<s;k++)
					c[i][j]+=a[i][k]*b[k][j];
				
				
			}
		return c;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int m=in.nextInt();
		int s=in.nextInt();
		int n=in.nextInt();
		int a[][]=new int[m][s];
		int b[][]=new int[s][n];
		for(int i=0;i<m;i++)
			for(int j=0;j<s;j++)
				a[i][j]=in.nextInt();
		for(int i=0;i<s;i++)
			for(int j=0;j<n;j++)
				b[i][j]=in.nextInt();
		int c[][]=new test50().getResult(m, s, n, a, b);
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++)
				System.out.print(c[i][j]	+" ");	
			System.out.println();
		}
		in.close();
	}

}
