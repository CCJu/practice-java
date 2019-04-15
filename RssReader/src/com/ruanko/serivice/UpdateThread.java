package com.ruanko.serivice;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;

import javax.swing.JOptionPane;

import com.ruanko.model.Channel;


public class UpdateThread extends Thread{
	private final static int TIMEOUT=5*1000;
	private final static int DELAY_TIME=300*1000;
	private final static int BUFFER_SIZE=65536;
	public void run(){
		//取出频道信息列表
		List<Channel> al=Channel.getList();
		//进行遍历
		for (Channel channel : al) {
			URL url;
			try {
				//创建File对象
				File file=new File(channel.getFilePath());
				url = new URL(channel.getIp());
				HttpURLConnection huc;
				huc = (HttpURLConnection) url.openConnection();
				UpdateThread u=new UpdateThread();
				//进行下载
				if(u.hasNewRSS(huc, file)){
					u.saveAs(u.download(huc), file);
					JOptionPane.showMessageDialog(null, "更新成功");
				}
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			
			sleep(DELAY_TIME);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * 将指定网址的文件下载保存到dest路径的文件去
	 * @param src
	 * @param dest
	 */
	public void upDate(String src,String dest){
		try {
			File file=new File(dest);
			FileOutputStream fos=new FileOutputStream(file);
			URL url=new URL(src);
			HttpURLConnection huc=(HttpURLConnection) url.openConnection();
			huc.setConnectTimeout(TIMEOUT);
			huc.connect();
			InputStream in=huc.getInputStream();
			byte []buf=new byte[1024];
			int n;
			while((n=in.read(buf, 0, 1024))>0)
				fos.write(buf);
			in.close();
			fos.close();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * 将文件保存到缓冲区去
	 * @param huc
	 * @return
	 */
	private ByteBuffer download(HttpURLConnection huc){
		ByteBuffer bb=ByteBuffer.allocate(BUFFER_SIZE);
		try {	
			huc.setConnectTimeout(5000);
			huc.connect();
			InputStream in=huc.getInputStream();
			byte []buf=new byte[1024];
			int n;
			while((n=in.read(buf, 0, 1024))>0)
				bb.put(buf);
			bb.flip();
			in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return bb;
		
	}
	/**
	 * 将缓冲区的信息保存到文件中去
	 * @param buffer
	 * @param file
	 */
	private synchronized void saveAs(ByteBuffer buffer,File file){
		try {	
			FileOutputStream fos=new FileOutputStream(file);
			FileChannel fc=fos.getChannel();
			fc.write(buffer);
			fc.close();
			fos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	/**
	 * 判断网站是否有最新的信息
	 * @param httpConn
	 * @param file
	 * @return
	 */
	private boolean hasNewRSS(HttpURLConnection httpConn,File file){
		boolean b=false;
		long current=System.currentTimeMillis();
		long httLastModified=httpConn.getHeaderFieldDate("Last-Modified", current);
		long fileLastModified=file.lastModified();
		if(httLastModified>fileLastModified)
			b=true;
		return b;
	}
}
