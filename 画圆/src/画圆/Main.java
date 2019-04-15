package 画圆;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int r=input.nextInt();
		for(int m=0;m<=2*r;m++){
			for(int n=0;n<=2*r;n++){
				if(Math.sqrt((m-r)*(m-r)+(n-r)*(n-r))>=r-1&&Math.sqrt((m-r)*(m-r)+(n-r)*(n-r))<=r+1)System.out.print("**");
				else System.out.print("  ");
			}
			System.out.println();
		}
		input.close();
	}

}
