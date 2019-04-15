package hello;
import java.io.*;
public class Read {
	private String path;
	private String fileName;
	private String finalPath;
	public String[] getFileList(){
		File file=new File(path);
		return file.list();
	}			
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getFinalPath() {
		return finalPath;
	}
	public void setFinalPath(String finalPath) {
		this.finalPath = finalPath;
	}
}
