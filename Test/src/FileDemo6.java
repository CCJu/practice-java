import java.io.*;
public class FileDemo6 {
	/**
	 * DataInputStream读文件，可以直接读取一个int，char，String类型的数据（将FileInputStream类包装而来）
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		DataInputStream dis=new DataInputStream(new FileInputStream("demo/world.txt"));
		int i=dis.readInt();
		System.out.println(i);
		i=dis.readInt();
		System.out.println(i);
		char c=dis.readChar();
		System.out.println(c);
		String s=dis.readUTF();
		System.out.println(s);
		dis.close();
	}

}
