package hello;

import java.io.File;
import java.io.FilenameFilter;

public class FileName implements FilenameFilter{
	String str=null;
	FileName(String s){
		str="."+s;
	}
	@Override
	public boolean accept(File dir, String name) {
		// TODO Auto-generated method stub
		return name.endsWith(str);
	}

}
