import java.util.Scanner;

public class test48 {

	public void getResult(int num[],int n){
		int max=num[0];
		int index=0;
		for(int i=0;i<n;i++)
			if(num[i]>max){max=num[i];index=i;}
		System.out.println(max+" "+index);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int num[]=new int[n];
		for(int i=0;i<n;i++)
			num[i]=in.nextInt();
		new test48().getResult(num, n);
	}

}
