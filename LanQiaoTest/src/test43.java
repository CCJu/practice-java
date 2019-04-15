import java.util.Arrays;
import java.util.Scanner;

public class test43 {

	public void getResult(int num[],int begin,int end,int k){
		int n[]=new int[end-begin+1];
		for(int i=begin-1,j=0;i<end;i++,j++)
			n[j]=num[i];
		Arrays.sort(n);
		System.out.println(n[end-begin-k+1]);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int num[]=new int[n];
		for(int i=0;i<n;i++){
			num[i]=in.nextInt();
		}
		n=in.nextInt();
		int test[][]=new int[n][3]; 
		for(int i=0;i<n;i++)
			for(int j=0;j<3;j++)
				test[i][j]=in.nextInt();
		in.close();
		test43 t=new test43();
		for(int i=0;i<n;i++)
			t.getResult(num, test[i][0], test[i][1], test[i][2]);
	}

}
