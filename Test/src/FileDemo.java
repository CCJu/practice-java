import java.io.*;

public class FileDemo {

	/**
	 * 列出指定目录（包括其子目录）的所有文件
	 * @param dir
	 * @throws IOException
	 */
	public static void listDirectory(File dir) throws IOException{
		if(!dir.exists())
			throw new IllegalArgumentException("目录"+dir+ "不存在");
		else if(!dir.isDirectory())
			throw new IllegalArgumentException(dir+"不是目录");
		/*String []filesName=dir.list();
		for (String string : filesName) {
			System.out.println(string);
		}*/
		File []files=dir.listFiles();
		if(files!=null&&files.length>0)
			for (File file : files) {
				if(file.isDirectory()) 
					listDirectory(file);
				if(file.isFile()) 
					System.out.println(file);
			}
	}

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		FileDemo.listDirectory(new File("files"));
	}

}
