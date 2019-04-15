
import java.util.Scanner;

public class test37 {
	int a=0;
	public void getArea(int num[][],int i,int j){
		if(i<0||i>9||j<0||j>9)
			return;
		else
			if(num[i][j]==0||num[i][j]==-1) return;
		if(num[i][j]>0){a++;num[i][j]=-1;}
		getArea(num, i+1, j);
		getArea(num, i-1, j);
		getArea(num, i, j+1);
		getArea(num, i, j-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int startx=in.nextInt();
		int starty=in.nextInt();
		int num[][]=new int[10][10];
		for(int i=0;i<10;i++)
			for(int j=0;j<10;j++)
				num[i][j]=in.nextInt();
		long start=System.currentTimeMillis();
		test37 t=new test37();
		t.getArea(num, startx-1, starty-1);
		System.out.println(t.a);
		in.close();
		long end=System.currentTimeMillis();
		System.out.println(end-start+"ms");
	}

}
