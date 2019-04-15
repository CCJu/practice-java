import java.util.Scanner;

public class test24 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		StringBuffer s=new StringBuffer();
		if(n>=3600){
			s.append(n/3600+":");
			n%=3600;
			s.append(n/60+":");
			s.append(n%60);		
		}else{
			s.append(0+":");
			if(n>=60){
				s.append(n/60+":");
				s.append(n%60);
			}else{
				s.append(0+":");
				s.append(n);
			}
		}
		System.out.println(s);	
	}

}
