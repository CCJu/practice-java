import java.util.Scanner;

public class test14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++)
			a[i]=in.nextInt();
		int index=in.nextInt();
		boolean b=false;
		for(int i=0;i<a.length;i++)
			if(index==a[i]){
				b=true;
				System.out.println(i+1);
				break;
			}
		if(!b)
			System.out.println("-1");
		in.close();
				
	}	

}
