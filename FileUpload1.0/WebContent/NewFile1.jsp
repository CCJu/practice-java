<%@page import="java.io.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String path="/Users/mac1/Desktop/web 应用程序/FileUpload1.0/WebContent/";
		String fileName=path+session.getId();
		File file=new File(fileName);
		try{
			if(file.exists()) {file.delete();file.createNewFile();}
			else file.createNewFile();
			InputStream is=request.getInputStream();
			FileOutputStream fos=new FileOutputStream(file);
			byte []b=new byte[1000];
			int i;
			while((i=is.read(b))!=-1){
				fos.write(b,0,i);
			}
			is.close();
			fos.close();
		}catch(IOException e){
			out.println(e);
		}
	%>
	<%	
		String s=null;
		try{
			RandomAccessFile raf=new RandomAccessFile(file,"r");
			for(int i=1;i<=2;i++){
				byte []b=raf.readLine().getBytes("ISO-8859-1");
				s=new String(b);
			}
			int postion=s.lastIndexOf('"');
			fileName=s.substring(0, s.length()-1);
			postion=fileName.lastIndexOf('"');
			s=fileName.substring(postion+1,fileName.length());
			fileName=path+s;
			File f=new File(fileName);
			if(f.exists()) {f.delete();f.createNewFile();}
			else f.createNewFile();
			raf.seek(0);//定位到文件开头的位置
			long forthEndPosition=0;
			int forth=1,n;
			while((n=raf.readByte())!=-1&&(forth<=4)){
				if(n=='\n'){
					forthEndPosition=raf.getFilePointer();
					forth++;
				}
			}
			RandomAccessFile raf2=new RandomAccessFile(f,"rw");
			raf2.seek(raf.length());
			long end=raf.getFilePointer();
			long mark=end;
			int j=1;
			while((mark>=0)&&(j<=6)){
				mark--;
				raf.seek(mark);
				n=raf.readByte();
				if(n=='\n'){
					end=raf.getFilePointer();
					j++;
				}
			}
			raf.seek(forthEndPosition);
			long startPoint=raf.getFilePointer();
			while(startPoint<end-1){
				n=raf.readByte();
				raf2.write(n);
				startPoint=raf.getFilePointer();
			}
			raf.close();
			raf2.close();
		}catch(IOException e){
			out.println(e);
		}
		
	%>
</body>
</html>