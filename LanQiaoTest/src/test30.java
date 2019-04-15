import java.util.Scanner;

public class test30 {
	public void get(int a[],int b[],int index,int i){
		if(index==0){
			if(i==1){
				b[0]=1;	
				for(int ii=0;ii<b.length;ii++)
					System.out.print(b[ii]);
				return ;
			}
			else{
				for(int ii=1;ii<b.length;ii++)
					System.out.print(b[ii]);
				return ;
			}			
		}
		if((a[index]+b[index]+i)>=10){ b[index]=a[index]+b[index]+i-10; i=1;}
		else{b[index]=a[index]+b[index]+i; i=0;}
		get(a, b, index-1, i);
	}
	public static void main(String[] args) {
		// T	ODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		StringBuffer s1=new StringBuffer(in.next());
		StringBuffer s2=new StringBuffer(in.next());
		StringBuffer s=new StringBuffer();
		int num1[],num2[];
		int length2=s2.length();
		int length1=s1.length();
		if(length1>length2){
			num1=new int[length1+1];
			num2=new int[length1+1];
			for(int i=1;i<num1.length;i++){
				num1[i]=s1.charAt(i-1)-'0';
				if(i>=(length1-length2+1))
					num2[i]=s2.charAt(i-(length1-length2+1))-'0';
			}
		}
		else{
			num1=new int[length2+1];
			num2=new int[length2+1];
		}	
		for (int i : num1) {
			System.out.print(i+" ");
		}
		System.out.println();
		for (int i : num2) {

			System.out.print(i+" ");
		}
		System.out.println();
		new test30().get(num1, num2,num1.length-1,0);	
	}

}
