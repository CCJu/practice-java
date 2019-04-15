import java.util.Scanner;

public class test42 {

	public void getResult(StringBuffer s,int length,int num){
		int flag=0;
		int i=0,j,end;
		if(length%2==0)
			end=length/2;
		else
			end=(length-1)/2;
		while(i<end){
			j=length-1-i;
			char c=s.charAt(i);
			char c0=s.charAt(j);
			if(c==c0)
				i++;
			else{
				int t=j-1;
				while(true){
					c0=s.charAt(t);
					if(c0==c){
						
						num+=(j-t);break;
					}
					t--;
					if(t==i){
						flag++;break;
					}
				}
			}
				
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		StringBuffer s=new StringBuffer(in.next());
		long start=System.currentTimeMillis();
		int length=s.length();
		new test42().getResult(s,length,0);
		in.close();
		long end=System.currentTimeMillis();
		System.out.println(end-start+" ms");
	}

}
