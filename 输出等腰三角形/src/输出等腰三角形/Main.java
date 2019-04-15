package 输出等腰三角形;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int p=input.nextInt();
		for(int m=1;m<=p;m++){
			for(int n=1;n<=p-m;n++)
				System.out.print(" ");
			for(int n = 1;n<=2*m-1;n++)
				System.out.print("*");
			System.out.println();
		}
		input.close();
	}

}
