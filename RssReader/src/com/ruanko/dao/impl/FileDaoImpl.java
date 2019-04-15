package com.ruanko.dao.impl;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import com.ruanko.dao.NewsDao;
import com.ruanko.model.News;
import com.ruanko.serivice.RssSerivice;
public class FileDaoImpl implements NewsDao {
	//定义默认的文件导出的另存地址（不可修改）
	private final String s="files/rss.txt";
	/**
	 * 读取列表中保存的信息，将信息存入默认的文件中
	 * return （boolean）文件是否另存成功
	 */
	@Override
	public boolean save(List<News> list) {
		// TODO Auto-generated method stub
		boolean f=true;
		try {
			//打开输入流
			FileWriter fw=new FileWriter(new File(s),true);
			BufferedWriter bw=new BufferedWriter(fw);
			//遍历列表，将信息写入文件
			for (News news : list) {
				bw.write(new RssSerivice().newsToString(news)+"\n");
			}
			//刷新缓存，关闭输入流
			bw.flush();
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			f=false;
			e.printStackTrace();
		}
		return f;
	}
	
}
