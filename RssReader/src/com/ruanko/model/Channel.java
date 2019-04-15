package com.ruanko.model;

import java.util.*;
/**
 * 创建Channel类来保存频道的信息
 * 包括频道的名称，频道保存的文件名，以及文件更新的网址
 * @author mac1
 *
 */
public class Channel {
	private static List<Channel> list=new ArrayList<Channel>();
	private String name;
	private String filePath;
	private String ip;
	public Channel(String name, String filePath,String ip) {
		this.name = name;
		this.filePath = filePath;
		this.ip=ip;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public static List<Channel> getList() {
		return list;
	}
	public static void setList(List<Channel> list) {
		Channel.list = list;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	
}
