import java.util.Scanner;

public class test35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]=new int[10001];
		Scanner in=new Scanner(System.in);
		int l=in.nextInt();
		int n=in.nextInt();
		long begintime=System.currentTimeMillis();
		for(int i=1;i<=n;i++){
			int begin=in.nextInt();
			int end=in.nextInt();
			for(int j=begin;j<=end;j++)
				num[j]=-1;
		}
		int s=0;
		for(int i=0;i<=l;i++){
			if(num[i]!=-1) s++;
		}
		System.out.println(s);
		
		
		
		
		long endtime=System.currentTimeMillis();
		
		System.out.println();
		System.out.println(endtime-begintime+"ms");
	}

}
