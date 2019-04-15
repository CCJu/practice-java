package com.ruanko.view;

import javax.swing.JOptionPane;

import com.ruanko.model.Channel;
import com.ruanko.serivice.UpdateThread;

public class Start {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//将列表中保存的频道信息清空
		Channel.getList().clear();
		//创建新的频道列表对象，给用户选择指定的频道，添加完毕后开始创建JMainFrame对象对查看的xml文件进行解析，显示
		new SelectedList();
		//提示用户选择自己要订阅的频道
		JOptionPane.showMessageDialog(null, "请选择要订阅的内容！！");
		//启动线程对用户添加的频道进行内容更新
		new UpdateThread().start(); 
	}

}
