import java.util.Scanner;

public class test45 {
	int s=0;
	public void getResult(int repay,int lend,int leave){
		if(repay==0&&lend==0){
			s++;
			return;
		} 
		if(repay==0&&lend>leave)
			return;
		if(leave==0)
			getResult(repay-1, lend, leave+1);
		else if(leave>0){
			if(repay-1>=0)
				getResult(repay-1, lend, leave+1);
			if(lend-1>=0)
				getResult(repay, lend-1, leave-1);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int repay=in.nextInt();
		int lend=in.nextInt();
		test45 t=new test45();t.getResult(repay,lend,0);
		System.out.println(t.s);
		in.close();
	}

}
