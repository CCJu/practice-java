package com.ruanko.serivice;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jdom.input.SAXBuilder;

import com.ruanko.dao.NewsDao;
import com.ruanko.dao.impl.FileDaoImpl;
import com.ruanko.model.News;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;

public class RssSerivice {
	private NewsDao newsDao;
	public RssSerivice(){
		newsDao=new FileDaoImpl();
	}
	/**
	 * 调用FileDaoImpl类中的save方法来判断是否保存成功
	 * @param list
	 * @return
	 */
	public boolean save(List<News> list){
		boolean f;
		if(newsDao.save(list))
			f=true;
		else 
			f=false;
		return f;
	}
	/**
	 * 对指定路径的XML文件进行解析，返回document对象
	 * @param filePath
	 * @return
	 */
	public Document load(String filePath){
		SAXBuilder sb=new SAXBuilder(false);
		Document doc = null;
		try {
			doc=sb.build(new File(filePath));
		} catch (JDOMException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return doc;
	}
	/**
	 * 将Element对象解析为News对象
	 * @param item
	 * @return
	 */
	private News itemToNews(Element item){
		News news=new News();
		news.setTitle(item.getChildText("title").trim());
		news.setLink(item.getChildText("link"));
		news.setAuthor(item.getChildText("author"));
		news.setPubDate(item.getChildText("pubDate"));
		news.setDescription(item.getChildText("description"));
		return news;
	}
	/**
	 * 调用itemToNews方法，将解析的News对象保存到列表中
	 * @param doc
	 * @return
	 */
	public ArrayList<News> parse(Document doc){
		News news=null;
		ArrayList<News> newsList=new ArrayList<News>();
		Element root=doc.getRootElement();
		Element e=root.getChild("channel");
		@SuppressWarnings("unchecked")
		List <Element>eList=e.getChildren("item");
		for (Element element : eList) {
			news=itemToNews(element);
			newsList.add(news);
		}
		return newsList;
	}
	/**
	 * 为News 对象创建toString方法
	 * @param news
	 * @return
	 */
	public String newsToString(News news){
		return news.getTitle()+"\r\n"+
				news.getLink()+"\r\n"+
				news.getAuthor()+"\r\n"+
				news.getPubDate()+"\r\n"+
				"----------------------------------------------------------------"+"/r/n"+
				news.getDescription()+"\r\n"+"\r\n";
	}
}
