import java.io.*;

public class FileDemo5 {
	/**
	 * 创建DataOutputStream对象（该类可以向文件内写入基本类型的数据int。。。）
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		File file =new File("demo/world.txt");
		DataOutputStream dos=new DataOutputStream(new FileOutputStream(file));
		dos.writeInt(10);
		dos.writeChar('e');
		//向文件中写入utf-8编码方式的字符串
		dos.writeUTF("中国");
		//以utf-16be的方式将字符串写入文件中去
		//dos.writeChars("中国");
		dos.flush();
		dos.close();
		FileDemo2.printHex("demo/world.txt");
	}

}
