import java.util.Scanner;

public class Main {
	int a[];
	Main(){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		a=new int[n];
		for(int i=0;i<a.length;i++)
			a[i]=in.nextInt();
		in.close();
	}
	
	public void sort(int begin,int end){
		if(begin>=end)
			return ;
		int flag=a[begin];
		int i=begin,j=end,t;
		while(i!=j){
			while(i<j){
				if(a[j]<flag)
					break;
				j--;	
			}
			while(i<j){
				if(a[i]>flag)
					break;
				i++;
			}
			
			t=a[i];
			a[i]=a[j];
			a[j]=t;
		}
		a[begin]=a[i];
		a[i]=flag;
		sort(begin,i-1);
		sort(i+1,end);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m=new Main();
		m.sort(0, m.a.length-1);
		for (int i : m.a) {
			System.out.print(i+" ");
		}
		
	}

}
