package 蓝桥杯练习;

public class Main2 {
	 public static void main(String args[]){
		 int a,b,c,d,e;
		 a=b=c=d=e=0;
		 for(int i=1;i<=32;i++){
			 if((e+=1)==2){
				 e=0;
				 if((d+=1)==2){
					 d=0;
					 if((c+=1)==2){
					 c=0;
					 if((b+=1)==2){
						 b=0;
						 if((a+=1)==2);
						 else
							 System.out.println(a+""+b+c+d+e);
					 }else
						 System.out.println(a+""+b+c+d+e);		 
				 }
				 else
					 System.out.println(a+""+b+c+d+e);
			 }else
				 System.out.println(a+""+b+c+d+e);
			 }else
				 System.out.println(a+""+b+c+d+e);
		 }
	
	 }
	 
}
