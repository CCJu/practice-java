package 入门;

import java.util.Scanner;
 
public class Test {
	int n;
	double a[][],l[][],u[][];
	//初始化
	public Test() {
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		a=new double[n][n];
		l=new double[n][n];
		u=new double[n][n];
		for(int i=0;i<n;i++) 
			for(int j=0;j<n;j++)
				a[i][j]=in.nextDouble();
		in.close();
	}
	//直接三角分解
	public void resolve() {
		//U1i=A1i,Li1=A1i/U11
		for(int i=0;i<n;i++) {
			u[0][i]=a[0][i];
			if(i>0) l[i][0]=a[i][0]/a[0][0];
			l[i][i]=1;
		}
		//从第二行算起
		for(int i=1;i<n;i++) {
			int nn=i-1;
			//计算U矩阵的第i行
			 for(int mm=i;mm<n;mm++) {
				 u[i][mm]=a[i][mm];
				 for(;nn>=0;nn--) {
					 u[i][mm]-=u[nn][mm]*l[mm][nn];
				 }
			 }
			//计算L矩阵的第i列
			 if(i!=3) {
				 for(int mm=n-i-1;mm<n;mm++) {
					 nn=i-1;
					 l[mm][i]=a[mm][i];
					 for(;nn>=0;nn--) {
						l[mm][i]-=l[mm][nn]*u[nn][i];
					 }
					 l[mm][i]/=u[i][i];
				 }
			 }
		}
	}
	//输出
	public void show(double [][]n ) {
		for (double[] ds : n) {
			for (double d : ds) 
				System.out.print(d+"	");
			System.out.println();
		}
	}
	public static void  main(String []args){
		Test t=new Test();
		t.resolve();
		t.show(t.l);
		System.out.println();
		t.show(t.u);
	}
}
//4
//2 10 0 -3
//-3 -4 -12 13
//1 2 3 -4
//4 14 9 -13