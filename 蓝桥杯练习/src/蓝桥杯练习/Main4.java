package 蓝桥杯练习;

import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=in.nextInt();
		}
		int index=in.nextInt(),hh=0;
		for(int i=0;i<n;i++){
			if(a[i]==index){
				hh=i+1;
				System.out.println(hh);
				break;
			}
		}
		if(hh==0) System.out.println("-1");
		in.close();
		
	}

}
