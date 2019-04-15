import java.util.Scanner;

public class test5 {
	
	public static void  main(String []args){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int left=1,right=1;
		int s=0;
		if(n==1||n==2)
			System.out.println(1);
		else{
			for(int i=3;i<=n;i++){
				s=(left+right)%10007;
				left=right;
				right=s;
			}
			System.out.println(s);
		}
	}
}