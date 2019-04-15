package com.ruanko;

import java.io.*;
public class FileHandle {
	/**
	 * 读文件进行读操作
	 * @param fileName
	 * @return
	 */
	public boolean readFiles(String fileName) {
		try{
		File file=new File(fileName);
		BufferedReader m=new BufferedReader(new FileReader(file));
		String l=null;
		//读文件
		while((l=m.readLine())!=null)
			System.out.println(l);
		//关闭文件
		m.close();
		return true;
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
		return false;
	}
	/**
	 * 对文件进行写操作
	 * @param fileName
	 * @param s
	 * @return
	 */
	public boolean writeFiles(String fileName,String s){
		try{
			File file=new File(fileName);
			BufferedWriter m=new BufferedWriter(new FileWriter(file));
			//写文件
			m.write(s);
			//关闭文件
			m.close();
			return true;
		}catch(IOException e){
			e.printStackTrace();
		}
		return false;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
	}
}