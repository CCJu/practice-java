
public class test7 {
	public int[] getPrimenum(int end){
		int []num=new int[(end-1)/2+1];
		int index=0;
		for(int i=1;i<=end;i++){
			if(i==2||i==3||i==5||i==7) {num[index]=i;index++;}
			if(i%2!=0&&i%3!=0&&i%5!=0&&i%7!=0) {num[index]=i;index++;}
		}
		return num;
	}
	public int[] getPrimenum2(int end){
		int []num=new int[((end-1)/2+1)];
		int index=0;
		for(int i=1;i<=end;i++){
			boolean a=true;
			for(int j=2;j<i;j++)
				if(i%j==0) {a=false; break;}
			if(a) {num[index]=i;index++;}
		}
		return num;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test7 t=new test7();
		int a[]=t.getPrimenum2(100);
		for (int i : a) {
			System.out.print(i+" ");
		}
		a=t.getPrimenum(100);
		System.out.println();
		for (int i : a) {
			System.out.print(i+" ");
		}
	}

}
