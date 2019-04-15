import java.util.ArrayList;
import java.util.Scanner;

public class test25 {
	
	public void getResult(int num[][],int index,boolean result){
		int length=num.length;
		if(result){
			for (int i=0;i<length;i++) 
				if(num[index-2][i]==1) System.out.print(i+1+" ");		
			return;
		}
		if(index==length){
			for (int i=0;i<length;i++) 
				if(num[index-1][i]==1) System.out.print(i+1+" ");		
			return ;
		}
		boolean b=true;
		int []res=new int[length];
		for(int i=0;i<length;i++)
			res[i]=num[index-1][i];
		Out:
		for(int i=0;i<length;i++){
			if(i==index-1) continue;
			for(int j=0;j<length;j++){
				if(res[i]==0) continue;
				else{
					int ij=res[j]==1?1:0;
					if(ij!=num[i][j]){
						b=false;	
						break Out;
					}	
				}
			}
		}
		getResult(num,index+1,b);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int num[][]=new int[n][n];
		ArrayList<Integer> a=new ArrayList<Integer>();
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				num[i][j]=in.nextInt();
		test25 t=new test25();
		t.getResult(num, 1, false);
				
		
	}

}
