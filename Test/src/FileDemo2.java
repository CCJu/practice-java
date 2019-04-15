import java.io.FileInputStream;
import java.io.IOException;

public class FileDemo2 {
	/**
	 * 字节流，字符流
	 * 	1。字节流
	 * 	（1）InputStream，OutputStream（连个父类为抽象类）
	 * 	（2）读到结尾（EOF=End）或者-1结束
	 * 	（3）
	 * 
	 */
	//以字节流读取文件(将内容转化为16进制输出)
	public static void printHex(String fileName)throws IOException{
		FileInputStream file=new FileInputStream(fileName);
		int b;
		int i=0;
		while((b=file.read())!=-1){
			//只有一位数的话在前面补0
			if(b<=0xf) System.out.print("0");
			System.out.print(Integer.toHexString(b)+" ");
			i++;
			if(i%10==0) System.out.println();
		}
		file.close();
	}
	//将文件读到字节数组里去
	public static void printByByteArray(String fileName)throws IOException{
		FileInputStream file=new FileInputStream(fileName);
		byte []b=new byte[8*1024];
		int bytes=file.read(b,0,b.length);
		//因为字节数组b可能放不满，bytes返回的是实际读取的字节数
		int j=0;
		for(int i=0;i<bytes;i++){
			if(b[i]<0xf) System.out.print("0");
			System.out.print(Integer.toHexString(b[i] &0xff)+" ");
			j++;
			if(j%10==0) System.out.println();
		}
		file.close();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileDemo2.printHex("files/imooc/1.txt");
			System.out.println();
			FileDemo2.printByByteArray("files/imooc/1.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
