import java.util.Scanner;

public class test52 {
	
	public void getResult(int a,int b){
		int min=(a>=b?b:a);
		int x=1;
		for(int i=1;i<=min;i++)
			if(a%i==0&&b%i==0) x=i;
		System.out.println(x*(a/x)*(b/x));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		new test52().getResult(a, b);

	}

}
