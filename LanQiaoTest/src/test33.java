
import java.util.Scanner;

public class test33 {
	int result=0;
	int white[]=new int[4];
	int black[]=new int[4];
	public void putWhite(int num[][],int index){
		if(index>num.length)
			putBlack(num, 0);
		boolean b=true;
		for(int i=0;i<num.length;i++){
			b=canPut(num, index, i, "white");
			
		}
		
		
		
		
	}
	public int back(int index,String type){
		int num;
		if(type.equals("white")){
			num=white[index];
			for(int i=index;i<white.length;i++)
				white[i]=0;
		}
		else{
			num=black[index];
			for(int i=index;i<white.length;i++)
				black[i]=0;
		}
		return num;
	}
	public void putBlack(int num[][],int index){
		
		
		
		
		
	}
	public boolean canPut(int num[][],int index,int column,String type){
		boolean b=true;
		if(type.equals("white")){
			for(int i=0;i<index;i++){
				if(white[i]==column) return false;
				if((white[i]+i==index+column)||(i-white[i]==index-column)) return false;
			}
		}
		else{
			for(int i=0;i<index;i++){
				for(int j=0;j<num.length;i++)
					if(white[j]==column) return false;
				if(black[i]==column) return false;
				if((black[i]+i==index+column)||(i-black[i]==index-column)) return false;
			}
		}
		return b;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int num[][]=new int[n][n];
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				num[i][j]=in.nextInt();
		test33 t=new test33();
		t.putWhite(num,0);
		System.out.println(t.result);
		in.close();
	}

}
