import java.util.Scanner;

public class test39 {

	public void result(int num[][],int i,int j,int direction){
		if(i==j&&i==0){
			if(direction>=5) direction=5;
			else direction=3;	
		}else{
			
		}
		switch(direction){
			case 1:result(num, i, j, direction); break;
			case 2:result(num, i, j, direction) ; break;
			case 3:result(num, i, j, direction); break;
			case 4:result(num, i, j, direction); break;
			case 5:result(num, i, j, direction); break;
			case 6:result(num, i, j, direction); break;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int m=in.nextInt();
		int n=in.nextInt();
		int num[][]=new int[m][n];
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++)
				num[i][j]=in.nextInt();
		in.close();
	}

}
