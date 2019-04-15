import java.util.Scanner;

public class test53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int num[]=new int[n];
		int nn=0;
		for(int i=0;i<n;i++){
			num[i]=in.nextInt();
			if(num[i]!=0) nn++;
		}
		if(nn==0)
		System.out.println(0);
		else{
			System.out.println(nn);
			for (int i : num) 
				if(i!=0)
					System.out.print(i+" ");
		}
		in.close();
	}

}
