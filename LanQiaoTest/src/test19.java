import java.util.Scanner;

public class test19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//long startTime = System.currentTimeMillis();//获取当前时间
		
		Scanner in=new Scanner(System.in);
		String s=in.next();
		String s1=in.next();
		long startTime = System.currentTimeMillis();//获取当前时间
		if(s.length()!=s1.length())
			System.out.println(1);
		else{
			if(s.equals(s1))
				System.out.println(2);
			else{ 
				boolean b=true;
				for(int i=0;i<s.length();i++){
					if((s.charAt(i)!=s1.charAt(i))&&Math.abs(s.charAt(i)-s1.charAt(i))!=32)
						b=false;
				}
				if(b)
					System.out.println(3);
				else
					System.out.println(4);
			}
		}
		
		in.close();
		long endTime = System.currentTimeMillis();
		System.out.println("程序运行时间："+(endTime-startTime)+"ms");
	}

}
