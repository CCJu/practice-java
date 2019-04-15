import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

public class FileDemo1 {
	/**
	 * 
	 * RandomAccessFile支持随机访问文件，可以访问文件的任意位置
	 * （1）java文件模型
	 * 		以byte byte byte存储的，是数据的集合
	 * （2）打开文件
	 * 		"rw"(读写),"r"（只读）
	 * 		RamdomAcessFile raf=new RandomAccessFile(File,"rw");
	 * 		打开时，文件指针在开头pointer=0；
	 * （3）写和读方法
	 * 		raf.write(int); 读只读一个字节，同时指针指向下一个位置，准备再次写入
	 * 		int n=raf.read();写也只写一个字节
	 * （4）文件读写完成后以一定要关闭（不关闭会出现错误）
	 */
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		File file=new File("demo");
		if(!file.exists())
			file.mkdir();
		File file0=new File(file,"raf.dat");
		if(!file0.exists())
			file0.createNewFile();
		RandomAccessFile raf=new RandomAccessFile(file0,"rw");
		System.out.println(raf.getFilePointer());
		raf.write('a');// 只写一个字节，且每写完一个字节指针后移
		System.out.println(raf.getFilePointer());
		raf.write('b');
		System.out.println(raf.getFilePointer());
		int n=78;
		raf.write(n>>>24);
		raf.write(n>>>16);
		raf.write(n>>>8);
		raf.write(n);
		System.out.println(raf.getFilePointer());
		//也可以直接写入一个int
		raf.writeInt(n);
		String s="中";
		byte []utf=s.getBytes("utf-8");
		raf.write(utf);
		System.out.println(raf.getFilePointer());
		raf.seek(0);//将指针的位置移到开头
		byte []by=new byte[(int)raf.length()];//.length返回的类型为一个Long型，强制转化为int类型
		raf.read(by);
		System.out.println(Arrays.toString(by));
		String s1=new String(by);
		System.out.println(s1);
		raf.close();
	}

}
