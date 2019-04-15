package 把一个浮点数转化为人民币读法;
import java.util.*;
public class Main {
	static char []num0={'零','壹','贰','叁','肆','伍','陆','柒','捌','玖'};
	static char []num1={'分','角'};
	static char []num2={'元','十','百','千'};
	public static char[] replace(double n){
		if(n>=1&&n<2) num2[0]='万';
		else if(n>=2) num2[0]='亿';
		return num2;
	}
	/**
	 * 
	 * 对输入的double类型的数进行截取，并转化为整数连接起来，从后至前一直为十分位，分位，个位，十位。。。。。。。。
	 * @param n
	 * @return int []num
	 */
	public static int[] cutOut(double n){
		long n1=(long)n;
		long n2=(long) Math.round((n-n1)*100);
		int []num;
		long a0=n1;
		int p=2;
		for(;a0>0;p++) a0/=10;
		num=new int[p];
		for(int c=0;n2>0;n2/=10,c++) num[c]=(int) (n2%10);
		for(int c=2;n1>0;n1/=10,c++) num[c]=(int) (n1%10);
		return num;
	}
	/**
	 * 将已经连接好的串转变为汉字读法
	 * @param n
	 */
	public static void strToHan(double n){
		int []num=cutOut(n);
		String p0="";
		for(int i=0;i<num.length;i++){
			double n1=(i-2)/4.0;
			if(num[i]==0){
				if(i+1<num.length&&num[i+1]==0) continue;
			}else{
				if(i<=1) p0=num1[i]+p0;										
				else {replace(n1); p0=num2[(i-2)%4]+p0;}					
				p0=num0[num[i]]+p0;
			}
			p0=" "+p0;
		}
		System.out.println(p0);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		double n0=input.nextDouble();
		if(n0<=999999999999.99) strToHan(n0);
		else System.out.println("数据过大请重新输入！！！");
		input.close();
	}

}
