import java.io.*;

public class FileDemo3 {
	public static void main(String[] args){
		// TODO Auto-generated method stub
		File file=new File("demo/hello.txt");
		try {
			if(!file.exists())
				file.createNewFile();
			FileOutputStream fos=new FileOutputStream(file);	
			fos.write('a');
			fos.write('b');
			byte []b="中国".getBytes("utf-8");
			fos.write(b);
			int n=89;
			fos.write(n>>>24);
			fos.write(n>>>16);
			fos.write(n>>>8);
			fos.write(n);
			fos.flush();
			fos.close();
			FileDemo2.printHex("demo/hello.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e){
			e.printStackTrace();
		}
		
	}

}
