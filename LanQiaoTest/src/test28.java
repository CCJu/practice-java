import java.util.Scanner;

public class test28{
	
	public int[] multiply(int result[],int a[],int numLength){	
		if(numLength==1){
			for(int i=0;i<100;i++)
				result[i]=result[i]*a[0];
		}else if(numLength==2){
			int b[]=new int[100];
			for(int i=0;i<100;i++){
				if(i+1<100){
					b[i+1]=result[i]*a[1];
					result[i]=result[i]*a[0];
				}
			}
			result=add(result, b, null, null, numLength);
		}else if(numLength==3){
			int b[]=new int[100];
			int c[]=new int[100];
			for(int i=0;i<100;i++){
				if(i+2<100){
					c[i+2]=result[i]*a[2];
					b[i+1]=result[i]*a[1];
					result[i]=result[i]*a[0];
				}
			}
			result=add(result, b, c, null, numLength);
		}else if(numLength==4){
			int b[]=new int[100];
			int c[]=new int[100];
			int d[]=new int[100];
			for(int i=0;i<100;i++){
				if(i+3<100){
					d[i+3]=result[i]*a[3];
					c[i+2]=result[i]*a[2];
					b[i+1]=result[i]*a[1];
					result[i]=result[i]*a[0];
				}
			}
			result=add(result, b, c, d, numLength);
		}		
		return result;
	}
	public int[] add(int a[],int b[],int c[],int d[],int numLength){
		if(numLength==4){
			for(int i=0;i<100;i++)
				a[i]=a[i]+b[i]+c[i]+d[i];
		}else if(numLength==3){
			for(int i=0;i<100;i++)
				a[i]=a[i]+b[i]+c[i];
		}else if(numLength==2){
			for(int i=0;i<100;i++)
				a[i]=a[i]+b[i];
		}
		return a;
	}
	public  void getResult(int result[]){
		int carry = 0;
		for(int i=0;i<100;i++){
			if(i!=99){
				result[i+1]+=result[i]/10;
				result[i]%=10;
			}else{
				carry=result[99]/10;
				result[99]%=10;
			}
		}
		int t=99;
		for(int i=99;i>=0;i--)
			if(result[i]!=0){ t=i;break;}
		if(carry!=0) System.out.print(carry);
		for(int i=t;i>=0;i--)
			System.out.print(result[i]);
	}
	public int getNumArray(int num[],int n){
		int i=0;
		while(n>0){
			 num[i]=n%10;
			 n/=10;
			 i++;
		}
		return i;
	}
	public static void main(String[] args) {
		
		//TODO Auto-generated meth
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		test28 t=new test28();
		int result[]=new int[100];
		result[0]=1;
		for(int i=1;i<=n;i++){
			int numLength;
			int a[]=new int[100];
			numLength=t.getNumArray(a, i);
			result=t.multiply(result, a, numLength);
		}
		t.getResult(result);
		in.close();
	}

}
