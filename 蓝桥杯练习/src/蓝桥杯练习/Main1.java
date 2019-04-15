package 蓝桥杯练习;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	double num=Math.sqrt(5000000);
//	System.out.println(num);
	long time = System.currentTimeMillis();
	Scanner input=new Scanner(System.in);
	int n=input.nextInt();
	for(int a=0;a<2236;a++){
		for(int b=0;b<2236;b++)
			for(int c=0;c<2236;c++)
				for(int d=0;d<2236;d++)
					if(n==a*a+b*b+c*c+d*d)
						System.out.println(a+" "+b+" "+c+" "+d);
	}
	long time1 = System.currentTimeMillis();   
	System.out.println(time1-time);
	input.close();
	}
}
