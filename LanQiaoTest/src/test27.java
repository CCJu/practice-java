import java.util.Arrays;
import java.util.Scanner;

public class test27 {
	public void get(int a[],int s){
		System.out.println();
		for (int i : a) {
			System.out.print(i+" ");
		}
		int length=a.length,index=0;
		if(length==1){
			System.out.println(s);
			return;
		}
		int b[]=new int[length-1];
		for(int i=0;i<length-1;i++){
			if(i==0) b[0]=a[0]+a[1];
			else b[i]=a[i+1];
		}
		Arrays.sort(b);
		get(b,s+a[0]+a[1]);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int num[]=new int[n];
		for(int i=0;i<n;i++){
			num[i]=in.nextInt();
		}
		long startTime=System.currentTimeMillis();
		
		Arrays.sort(num);
		new test27().get(num, 0);
		
		long endTime=System.currentTimeMillis();
		System.out.println("运行时间："+(endTime-startTime));
	}

}
