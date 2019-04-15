package com.ruanko;
import java.util.Scanner;
public class Menu {
	/**
	 * 通过调用FileHandle类中的readFiles（）方法来对文件进行读取
	 */
	public static void readFile(){
		Scanner in=new Scanner(System.in);
		//输入要读的文件名
		System.out.print("请输入要读写的文件名：");
		String s=in.next();
		//创建FileHandle类的实例来进行读入操作
		FileHandle fh=new FileHandle();
		if(!fh.readFiles(s)) System.out.println("文件读入失败");
		in.close();
	}
	/**
	 * 通过调用FileHandle类中的writeFiles（）方法来对文件进行写入
	 */
	public static void writeFile(){
		Scanner in=new Scanner(System.in);
		//输入要写的文件的名
		System.out.print("请输入要书写的文件名：");
		String s=in.next();
		System.out.print("请输入要写入的内容：");
		String s1=in.next();
		//创建FileHandle类的实例来进行操作
		FileHandle fh=new FileHandle();
		if(!fh.writeFiles(s,s1)) System.out.println("文件写入失败");
		in.close();
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 输出菜单，来进行相关操作
		 */
		System.out.println("----------------------------------");
		System.out.println("1.读文件");
		System.out.println("2.写文件");
		System.out.print("请输入相关序号来完成操作：");
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		/**
		 * 根据输入的序号来进行选择相关功能
		 */
		switch(n){
			case 1:readFile(); break;
			case 2:writeFile(); break;
			default :System.out.println("输入错误！！！！！！"); break;
		}
		input.close();
	}

}