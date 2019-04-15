package com.ruanko;

public class MyString {
	/**
	 * 
	 * @param ch1
	 * @param ch2
	 * @return 一个字符数组ch3
	 * 将ch1和ch2连接起来赋给ch3
	 */
	public static char[] link(char ch1[],char ch2[]){
		char ch3[]=new char[ch1.length+ch2.length];
		for(int i=0;i<ch1.length;i++)
			ch3[i]=ch1[i];
		int n=0;
		for(int i=ch1.length;i<ch3.length;i++,n++)
			ch3[i]=ch2[n];
		return ch3;
	}
	/**
	 * 
	 * @param ch1
	 * @param ch2
	 * @return 一个字符数组ch3
	 * 将ch1和ch2连接并反序赋给ch3
	 */
	public static char[] antitone(char ch1[],char ch2[]){
		char ch3[]=link(ch1,ch2);
		int m,n;
		for(m=0,n=ch3.length-1;m<n;m++,n--){
			char c;
			c=ch3[m];
			ch3[m]=ch3[n];
			ch3[n]=c;
		}
		return ch3;
	}
}
