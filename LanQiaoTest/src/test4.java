import java.util.Scanner;

public class test4 {
	
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int r=in.nextInt();
		double pi=Math.atan(1.0)*4;
		double m=pi*r*r;
		String s=m+"";
		int begin=s.indexOf('.');
		//System.out.println(s+" ");
		if(s.charAt(begin+8)>='5'){
			s=(m+0.0000001)+"";
			System.out.println(s.substring(0,begin+8));
		}
		else
			System.out.println(s.substring(0, begin+8));
		
		
//		m=Double.parseDouble(s.substring(0,begin+8));
//		s=s.substring(begin+8,begin+9);
//		if(Double.parseDouble(s)>=5)
//			System.out.println((m+0.0000001+"").substring(0,begin+8));
//		else
//			System.out.println(m);
		in.close();
	}
}
