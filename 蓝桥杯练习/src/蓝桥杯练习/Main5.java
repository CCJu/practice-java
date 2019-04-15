package 蓝桥杯练习;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class Main5 {
	Vector<String> v=new Vector<String>();
	public String getS(){
		String str="";
		Iterator<String> it=v.iterator();
		while(it.hasNext()){
			str+=it.next();
		}
		return str;
	}
	public void input(){
		Scanner in=new Scanner(System.in);
		String n=in.nextInt()+"";
		int k=in.nextInt();
		for(int i=0;i<n.length();i++){
			v.add(n.charAt(i)+"");
		}
		for(int i=0;i<k;i++){
			v.add("#");
		}
		in.close();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main5 m=new Main5();
		int i=0,max=1;
		while(i<100){
			boolean boo=true;
			String str=m.getS();
			String ss[]=str.split("#");
			for (String string : ss)
				if(string.equals("")){ boo=false;break;}
			if(boo){
				int s=1;
				for (String string : ss) {
					s*=Integer.parseInt(string);
				}
				if(s>max)
					max=s;
				i++;
			}					 
		}
		System.out.println(max);
		
	}

}
