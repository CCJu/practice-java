import java.util.Scanner;

public class test13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a[][]=new int[n][n];
		a[0][0]=1;
		a[1][0]=1;a[1][1]=1;
		for(int i=2;i<n;i++){
			a[i][0]=1;
			a[i][i]=1;
			for(int j=1;j<n-1;j++){
				a[i][j]=a[i-1][j]+a[i-1][j-1];
			}
		}
		for (int[] is : a) {
			for (int i : is) {
				if(i!=0)
					System.out.print(i+" ");
				else
					break;
			}
			System.out.println();
		}
		in.close();
	}

}
