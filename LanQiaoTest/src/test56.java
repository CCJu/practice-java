import java.util.Scanner;

public class test56 {
	
	public void multiply(int a[],int b[],int s1_length,int s2_length){
		int s[]=new int[200];
		for(int i=0;i<s2_length;i++){
			int n=b[i];
			int nn[]=new int[200];
			for(int j=0,k=i;j<s1_length;j++,k++)
				nn[k]=a[j]*n;
			add(s, nn);
		}
		int n=move(s);
		if(n==-1)
			show(s);
		else{
			System.out.print(n);
			show(s);
		}
			
	}
	public void show(int a[]){
		int n=0;
		for(int i=a.length-1;i>=0;i--)
			if(a[i]!=0){ n=i;break;}	
		for(int i=n;i>=0;i--)
			System.out.print(a[i]);
	}
	
	public int move(int a[]){
		for(int i=0;i<199;i++){
			if(a[i]>=10){
				a[i+1]+=a[i]/10;
				a[i]%=10;
			}else
				continue;
		}
		if(a[199]>=10){int n=a[199]/10;a[199]%=10; return n;}
		else return -1;
	}
	
	public void add(int a[],int b[]){
		for(int i=0;i<200;i++)
			a[i]=a[i]+b[i];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
	
		int a[]=new int[200];
		a[0]=3; a[1]=2; a[2]=1;
		int b[]=new int[200];
		b[0]=3; b[1]=2; b[2]=1;
		test56 t=new test56();	
		t.multiply(a, b, 3, 3);
		in.close();
		System.out.println();
		System.out.println(123*123);
	}

}
