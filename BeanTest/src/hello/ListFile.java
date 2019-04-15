package hello;

import java.io.*;;

public class ListFile {
	private String extendsName=null;

	public String getExtendsName() {
		return extendsName;
	}

	public void setExtendsName(String extendsName) {
		this.extendsName = extendsName;
	}
	public String[] listFile(){
		File file=new File("/Users/mac1/Desktop/web 应用程序/BeanUseTest/WebContent");
		FileName f=new FileName(extendsName);
		String file_name[]=file.list(f);
		return file_name;
	}
}
