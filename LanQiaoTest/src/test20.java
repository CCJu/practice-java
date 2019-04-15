import java.util.Scanner;

public class test20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int x1,y1,m1,n1;int x2,y2,m2,n2;
		x1=in.nextInt();
		y1=in.nextInt();
		m1=in.nextInt();
		n1=in.nextInt();
		
		x2=in.nextInt();
		y2=in.nextInt();
		m2=in.nextInt();
		n2=in.nextInt();

		long startTime = System.currentTimeMillis();//获取当前时间
		
		double d1,s1,s2,max;
		d1=Math.sqrt((m1-x1)*(m1-x1)+(n1-y1)*(n1-y1));
		s1=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1))+Math.sqrt((x2-m1)*(x2-m1)+(y2-n1)*(y2-n1));
		s2=Math.sqrt((m2-x1)*(m2-x1)+(n2-y1)*(n2-y1))+Math.sqrt((m2-m1)*(m2-m1)+(n2-n1)*(n2-n1));
		max=Math.abs((m1-x1))+Math.abs((n1-y1));
		if(s1>=d1&&s1<=max&&s2>=d1&&s2<=max)
			System.out.println(Math.abs(y2-n2)*Math.abs(x2-m2));
		else{
			if(s1>max&&s2>max){
				System.out.println(0);
			}
			if(s1>max&&s2<=max){
				if(x2>=m1){
					if(y2>=n1)
						System.out.println((m1-m2)*(n1-n2));
					else if(y2>y1)
						;
				}else{
					
				}
			}
		}
		
		
		long endTime = System.currentTimeMillis();
		System.out.println("程序运行时间："+(endTime-startTime)+"ms");
	}

}
