import java.util.Scanner;

public class test22 {
	public int[] getPrimenum(int end){
		int []num=new int[(end-1)/2+1];
		int index=0;
		for(int i=1;i<=end;i++){
			if(i==2||i==3||i==5||i==7) {num[index]=i;index++;}
			if(i%2!=0&&i%3!=0&&i%5!=0&&i%7!=0) {num[index]=i;index++;}
		}
		return num;
	}
	public static void main(String []args){
		Scanner in=new Scanner(System.in);
		int begin=in.nextInt();
		int end=in.nextInt();
		StringBuffer s;
		int num[]=new test22().getPrimenum(end);
		for (int i : num) {
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i=begin;i<=end;i++){
			s=new StringBuffer();
			s.append(i+"=");
			int t=i;
			for(int j=1;j<num.length;j++){
				if(num[j]==0||t==1) { System.out.println(s.deleteCharAt(s.length()-1));break;}
				if(t%num[j]==0) {s.append(num[j]+"*"); t/=num[j]; j=0;}
			}
		}
		in.close();
	}
}
