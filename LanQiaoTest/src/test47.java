import java.util.Scanner;

public class test47 {

	public void getResult(int n,int m,int road[][]){
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				if(road[j][0]==i+1){ System.out.print(1+" ");continue;}
				if(road[j][1]==i+1){ System.out.print(-1+" ");continue;}
				System.out.print(0+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int m=in.nextInt();
		int road[][]=new int[m][2];
		for(int i=0;i<m;i++){
			road[i][0]=in.nextInt();
			road[i][1]=in.nextInt();
		}
		new test47().getResult(n, m, road);
		in.close();
	}

}
