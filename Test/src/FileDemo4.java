import java.io.*;

public class FileDemo4 {
	/**
	 * 将thisFile文件中的内容复制到otherFile文件中
	 * @param thisFile
	 * @param otherFile
	 * @throws IOException
	 */
	public static void copyFile(File thisFile,File otherFile)throws IOException{
		if(!thisFile.exists())
			throw new IllegalArgumentException(thisFile+"不存在");
		if(!thisFile.isFile())
			throw new IllegalArgumentException(otherFile+"不是文件");
		FileInputStream fis=new FileInputStream(thisFile);
		FileOutputStream fop=new FileOutputStream(otherFile);
		byte []b=new byte[8*1024];
		int p;
		while((p=fis.read(b, 0, b.length))!=-1);
			fop.write(b);
		fop.flush();
		fop.close();
		fis.close();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileDemo4.copyFile(new File("files/imooc/1.txt"), new File("demo/hello.txt"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
