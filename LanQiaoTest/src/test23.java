import java.util.Scanner;

public class test23 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int m,n;
		m=in.nextInt();
		n=in.nextInt();
		String a[]={"zero","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen","twenty","thirty","forty","fifty"};
		
		String s="";
		if(m<=20){ 
			s+=a[m]+" ";
			if(n<=20) 
				s+=a[n];
			else{
				s+=a[n/10-2+20]+" "+a[n%10];
			}
		}else{
			s+=a[m/10-2+20]+" "+a[m%10]+" ";
			if(n<=20) 
				s+=a[n];
			else{
				s+=a[n/10-2+20]+" "+a[n%10];
			}
		}
		System.out.println(s);
		in.close();
		
	}

}
