import java.util.Scanner;

public class test31 {

	public void result(StringBuffer []road,int cost[],int pp[]){
		for (int i : pp) {
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in=new Scanner(System.in);
		int nc=in.nextInt();
		int dc=in.nextInt();
		int nr=in.nextInt();
		StringBuffer []road=new StringBuffer[nr];
		int cost[]=new int[nr];
		for(int i=1;i<=nr;i++){
			road[i-1]=new StringBuffer();
			road[i-1].append(in.nextInt());
			road[i-1].append(in.nextInt());
			cost[i-1]=in.nextInt();
		}
		int pp[]=new int[in.nextInt()];
		for(int i=0;i<pp.length;i++)
			pp[i]=in.nextInt();	
		for (StringBuffer i : road) {
			System.out.print(i+" ");
		}
		System.out.println();
		for (int i : cost) {
			System.out.print(i+" ");
		}
		System.out.println();
		for (int i : pp) {
			System.out.print(i+" ");
		}
		
		
		
		in.close();
	}	

}
