import java.util.Scanner;

public class test44 {

	public void getResult(int num[][],int n){

			for(int i=n-2;i>=0;i--)
				for(int j=0;j<=i-1;j++){
					if(num[i+1][j]>=num[i+1][j+1])
						num[i][j]+=num[i+1][j];
					else
						num[i][j]+=num[i+1][j+1];
				}
			System.out.println(num[0][0]+(num[1][0]>num[1][1]?num[1][0]:num[1][1]));
	}
	public static void main(String[] args) {
		// TODO Auto	-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int num[][]=new int[n][n];
		for(int i=0;i<n;i++)
			for(int j=0;j<=i;j++)
				num[i][j]=in.nextInt();
		test44 t=new test44();
		t.getResult(num, n);
		in.close();
	}

}
