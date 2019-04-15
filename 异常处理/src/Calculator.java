import java.util.*;
public class Calculator {

	public static int plus(int a,int b){
		return(a+b);
	}
	public static double minus(int a,int b){
		return(a-b);
	}
	public static double multiply(int a,int b){
		return(a*b);
	}
	public static double divide(int a,int b){
		return(a/b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("请输入运算符号：");
		String c=input.next();
		System.out.print("请输入被操作数a的值：");
		int a=input.nextInt();
		System.out.print("请输入操作数b的值：");
		int b=input.nextInt();
		switch(c){
			case "+":System.out.println("a+b="+plus(a,b));break;
			case "-":System.out.println("a-b="+minus(a,b));break;
			case "*":System.out.println("a*b="+multiply(a,b));break;
			case "/":{
						int result = 0;
						try{
							result=a/b;
						}catch(Exception e){
							e.printStackTrace();
							System.out.println("被0除"+e);
						}
						System.out.println("a/b="+result);
					}break;
			default:System.out.println("无该运算符号！！！");break;
		}		
		input.close();
	}

}
