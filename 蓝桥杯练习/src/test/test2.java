package test;

public class test2 {
	public static boolean exist(String str,char n){
		boolean b=true;
		for(int i=0;i<str.length();i++)
			if(str.charAt(i)==n){
				b=false;
			}
		return b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="12212";
		int num[]={1,2,2,1,2};
		for(int i=1;i<num.length;i++){
			String ss=s.substring(0,i);
			String c=num[i]+"";
			if(exist(ss,c.charAt(0)))
				System.out.println("yes");
			else
				System.out.println("no");
				
		}
		
	}

}
