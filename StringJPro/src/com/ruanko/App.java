package com.ruanko;

public class App {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		char ch1[]={'a','b','c'};
		char ch2[]={'d','e','f'};
		MyString a=new MyString();
		char ch3[]=new char [ch1.length+ch2.length];
		ch3=a.link(ch1,ch2);
		System.out.print("连接后：");
		for(int i=0;i<ch3.length;i++)
			System.out.print(ch3[i]);
		ch3=a.antitone(ch1,ch2);
		System.out.println("");
		System.out.print("反序后：");
		for(int i=0;i<ch3.length;i++)
			System.out.print(ch3[i]);	
	}

}
