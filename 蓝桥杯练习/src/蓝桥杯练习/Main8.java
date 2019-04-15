package 蓝桥杯练习;

import java.util.*;
public class Main8 {
	public static int[] getArray(int num[]){
		int n[]=new int[num.length];
		String s="";
		for(int i=0;i<num.length;i++)
			s+=num[i];
		
		n[0]=-1*num[0];
		for(int i=1;i<num.length;i++){
			String ss=s.substring(0,i);
			String c=num[i]+"";
			if(!exist(ss,c.charAt(0))){
				System.out.println(ss.lastIndexOf(c.charAt(0))+" "+i);
				n[i]=getTypeNum(s,ss.lastIndexOf(c.charAt(0)), i);
				System.out.println(ss.lastIndexOf(c.charAt(0))+" "+i);
			}
			else
				n[i]=-1*num[i];
		}
			
		return n;
	}
	public  static int getTypeNum(String str,int index,int index1){
		int s=0;
		str=str.substring(index, index1);
		char c;
		if(index1>index){
			for(int i=1;i<index1-index;i++){
				c=str.charAt(i);
				if(i+1<index1){ if(str.indexOf(c,i+1)==-1) s++;}
				else s++;		
			}
		}
		return s;
	}	
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
		int num[]={1,1,2,3,2,3,1,2,2,2,3,1};	
		num=getArray(num);
		for (int i : num) {
			System.out.print(i+" ");
		}
	}

}
