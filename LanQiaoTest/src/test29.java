import java.util.Scanner;

public class test29 {
	public void result(int s1,int s2,int v1,int v2,int t,int s,int l,int time){
		if(s1==s2&&s1==l){
			System.out.println("D");
			System.out.println(time);
			return ;
		}else{
			if(s1==l){
				System.out.println("R");
				System.out.println(time);
				return ;
			}
			if(s2==l){
				System.out.println("T");
				System.out.println(time);
				return ;
			}
		}
		if((s1-s2)>=t)
			result(s1, s2+v2*s, v1, v2, t, s, l, time+s);
		else
			result(s1+v1, s2+v2, v1, v2, t, s, l, time+1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int v1,v2,t,s,l;
		v1=in.nextInt();
		v2=in.nextInt();
		t=in.nextInt();
		s=in.nextInt();
		l=in.nextInt();
		new test29().result(0, 0, v1, v2, t, s, l, 0);
	}

}
