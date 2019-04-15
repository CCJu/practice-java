import java.util.Scanner;

public class test38 {
	int maxSum=0;
	public void result(int num[][],int indexRow,int s,int n,int lastCheckColumn){
		if(s>maxSum) maxSum=s;
		if(indexRow>n){
//			System.out.println(maxSum);
			return;
		}
		if(indexRow==0){
			s+=num[0][0];
			result(num, indexRow+1, s, n,0);
		}else{
			result(num, indexRow+1, s+num[indexRow][lastCheckColumn], n,  lastCheckColumn);
			result(num, indexRow+1, s+num[indexRow][lastCheckColumn+1], n,  lastCheckColumn+1);
		}	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int num[][]=new int[n][n];
		for(int i=0;i<n;i++)
			for(int j=0;j<=i;j++)
				num[i][j]=in.nextInt();
		test38 t=new test38();t.result(num, 0, 0, n-1,0);
		System.out.println(t.maxSum);
		in.close();
	}

}
