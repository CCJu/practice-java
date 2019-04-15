import java.util.Scanner;

public class test54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int s=0;
		for(int i=0;i<n;i++)
			s+=in.nextInt();
		System.out.println(s+" "+s/n);
		in.close();
	}

}
