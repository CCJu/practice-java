import java.util.Scanner;

public class test15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			Scanner in=new Scanner(System.in);
			int n=in.nextInt();
			if(n!=1){
			int a[]=new int[n];
			int max=0,min=0,s=0;
			for(int i=0;i<a.length;i++){
				a[i]=in.nextInt();
				s+=a[i];
				if(i==1){
					if(a[1]>a[0]) {
						max=a[1];
						min=a[0];
					}else{
						max=a[0];
						min=a[1];
					}
				}
				if(i>1){
					if(a[i]>max) max=a[i];
					if(a[i]<min) min=a[i];
				}
			}
			System.out.println(max);
			System.out.println(min);
			System.out.println(s);
			in.close();
			
			}else{
				int num=in.nextInt();
				System.out.println(num);
				System.out.println(num);
				System.out.println(num);
			}
		
	}


}


