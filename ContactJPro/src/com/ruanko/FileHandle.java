package com.ruanko;

import java.io.*;

import javax.swing.JOptionPane;
public class FileHandle {
	private static File file;
	private static FileWriter fileWriter;
	private static BufferedReader bufferReader;
	/**
	 * 将字符串str写入指定的文件中
	 * @param str
	 */
	public static void writeFile(String str){
		try {
			file=new File("files/","out.txt");
			if(file.exists()&&file.isFile()){
				fileWriter=new FileWriter(file,true);
				fileWriter.write(str+"\n");
				fileWriter.close();
			}else
				file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	/**
	 * 读取文件中的字符串（按行读取），将字符串按照指定格式分割，以Contacts对象的形式存入contactsList内
	 */
	public static void addContacts(){
		try {
			bufferReader=new BufferedReader(new FileReader(new File("files/out.txt")));
			String str=null;
			try {
				while((str=bufferReader.readLine())!=null)
					Contacts.getContactsList().add(Contacts.strToContacts(str));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * 将文件删除并在创建一个同名的文件
	 * 功能：清空文件里的内容
	 */
	public static void remove(){
		file=new File("files/out.txt");
		if(file.exists())
			if(file.isFile()){
				file.delete();
				JOptionPane.showMessageDialog(null, "成功清空所有联系人！！！！");
			}
		if(!file.exists())
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
