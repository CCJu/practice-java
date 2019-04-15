import java.util.Scanner;

public class test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int i=in.nextInt();
		if(i%2==0){
			int o;
			for(int m=1;m<=9;m++)
				for(int n=0;n<=9;n++){
					o=i-(m+n)*2;
					if(o<=9&&o>=0) System.out.println(""+m+n+o+n+m);
					else continue;
				}
			i/=2;
			for(int m=1;m<=9;m++)
				for(int n=0;n<=9;n++){
					o=i-m-n;
					if(o<=9&&o>=0) System.out.println(""+m+n+o+o+n+m);
					else continue;
				}
		}
		else{
			int o;
			for(int m=1;m<=9;m++)
				for(int n=0;n<=9;n++){
					o=i-(m+n)*2;
					if(o<=9&&o>=0) System.out.println(""+m+n+o+n+m);
					else continue;
				}
		}
		in.close();
	}

}
