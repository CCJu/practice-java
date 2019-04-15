package 蓝桥杯练习;

import java.util.Scanner;

public class Main3 {
	int a[]=new int[2];
	String b[]=new String[21];
	String c[]=new String[5];
	Main3(){
		c[0]="ten";c[1]="twenty";
		c[2]="thirty";
		c[3]="fourty";
		c[4]="fifty";
		b[0]="zero";b[1]="one";
		b[2]="two"; b[3]="three";
		b[4]="four";b[5]="five";
		b[6]="six";b[7]="seven";
		b[8]="eight";b[9]="nine";
		b[10]="ten";b[11]="eleven";
		b[12]="twelve";b[13]="thirteen";
		b[14]="fourteen";b[15]="fifteen"; 
		b[16]="sixteen";b[17]="seventeen";
		b[18]="eighteen";b[19]="nineteen";
		b[20]="twenty";
		Scanner input=new Scanner(System.in);
		for(int i=0;i<2;i++){
			a[i]=input.nextInt();
		}
		input.close();
	}
	public String readNum(int a){
		String num="";
		if(a<=20){
			num=b[a];
		}else{
			num=c[(a/10)-1]+b[a%10];
		}
		return num;
	}
	public void read(){
		if(!readNum(a[1]).equals("zero"))
		System.out.println(readNum(a[0])+" "+readNum(a[1]));
		else
			System.out.println(readNum(a[0])+" "+"o'clock");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main3().read();
	}

}
