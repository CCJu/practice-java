import java.util.Scanner;

public class test34 {
	public void getResult(String address[],int n){
		for(int i=1;i<=n;i++){
			move(address[2*i-2],address[2*i-1]);
		}
	}
	public void move(String begin,String end){
		int x=Math.abs(begin.charAt(0)-end.charAt(0));
		int y=Math.abs(begin.charAt(1)-end.charAt(1));
		System.out.print(Math.min(x, y)+Math.abs(x-y)+" ");
		if(x==y||x==0||y==0) System.out.print(1+" ");
		else System.out.print(2+" ");
		if(x==0||y==0) System.out.print(1+" ");
		else System.out.print(2+" ");
		if((x%2==0&&y%2==0)||(x%2!=0&&y%2!=0)) {
			if(x==y)System.out.print(1+" ");
			else 	System.out.print(2+" ");;
		}
		else System.out.print("Inf");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		String address[]=new String[2*n];
		for(int i=0;i<2*n;i++)
			address[i]=in.next();
		new test34().getResult(address, n);
		in.close();
	}	

}
