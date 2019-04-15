package 随机生成字符串;
import java.util.*;
public class Main {
	/**
	 * 
	 * @param n
	 * 功能：生成个数为n的字符串
	 */
	public static void str(int n){
		Random random=new Random();
		for(int i=1;i<=n;i++){
			char c=(char)random.nextInt();
			for(;(c>='a'&&c<='z')||(c>'A'&&c<'Z');) 
				c=(char)random.nextInt();
			System.out.print(c);
		}
	}
	/**
	 * 
	 * @param n
	 * 功能：生成个数为n的字符串
	 */	
	public static void strRandom(int n){
		String str="";
		for(int i=1;i<=n;i++){
			int m=(int) (Math.random()*26+97);
			str+=(char)m;
		}
		System.out.println(str);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		strRandom(n);
		str(n);
		
		input.close();
	}

}
