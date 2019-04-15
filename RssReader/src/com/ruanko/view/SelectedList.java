package com.ruanko.view;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import com.ruanko.model.Channel;
@SuppressWarnings("serial")
public class SelectedList extends JFrame{
	private JRadioButton b1,b2,b3,b4,b5,b6,b7,b8;
	private JButton okButton;
	private JButton allSelectedButton;
	private int i=0;
	//创建频道列表面板
	public SelectedList(){
		//设置面板标题
		this.setTitle("频道列表");
		//设置大小
		this.setSize(600,400);
		//设置面板居中
		Dimension screenSize=Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation((screenSize.width-600)/2,(screenSize.height-400)/2);
		//设置关闭状态
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		//设置主面板
		this.setContentPane(getPanel());
		//设置可见
		this.setVisible(true);
	}
	public JPanel getPanel(){
		//创建主面板，并为其设置背景
		JPanel jp=new MyPanel();
		//隐藏面板
		jp.setOpaque(false);
		//设置为表格布局
		jp.setLayout(new GridLayout(5,2,10,10));
		//设置大小
		jp.setPreferredSize(new Dimension(580,350));
		//为主面板添加个个按钮面板
		jp.add(getPanel1());
		jp.add(getPanel2());
		jp.add(getPanel3());
		jp.add(getPanel4());
		jp.add(getPanel5());
		jp.add(getPanel6());
		jp.add(getPanel7());
		jp.add(getPanel8());
		jp.add(getButtonPanel1());
		jp.add(getButtonPanel2());
		return jp;
	}
	/**
	 * 创建面板为其设置流式布局，设置隐藏面板，设置大小，添加按钮
	 * @return
	 */
	public JPanel getPanel1(){
		JPanel panel=new JPanel(new FlowLayout(FlowLayout.CENTER));
		panel.setOpaque(false);
		panel.setPreferredSize(new Dimension(580,30));
		panel.add(getButton1());
		return panel;
	}
	/**
	 * 创建按钮
	 * @return
	 */
	public JRadioButton getButton1(){
		b1=new JRadioButton("腾讯-笑话      ");
		return b1;
	}
	/**
	 * 创建面板为其设置流式布局，设置隐藏面板，设置大小，添加按钮
	 * @return
	 */
	public JPanel getPanel2(){
		JPanel panel=new JPanel(new FlowLayout(FlowLayout.CENTER));
		panel.setOpaque(false);
		panel.setPreferredSize(new Dimension(580,30));
		panel.add(getButton2());
		return panel;
	}
	/**
	 * 创建按钮
	 * @return
	 */
	public JRadioButton getButton2(){
		b2=new JRadioButton("腾讯-星座      ");
		return b2;
	}
	/**
	 * 创建面板为其设置流式布局，设置隐藏面板，设置大小，添加按钮
	 * @return
	 */
	public JPanel getPanel3(){
		JPanel panel=new JPanel(new FlowLayout(FlowLayout.CENTER));
		panel.setOpaque(false);
		panel.setPreferredSize(new Dimension(580,30));
		panel.add(getButton3());
		return panel;
	}
	/**
	 * 创建按钮
	 * @return
	 */
	public JRadioButton getButton3(){
		b3=new JRadioButton("腾讯-国际新闻");
		return b3;
	}
	/**
	 * 创建面板为其设置流式布局，设置隐藏面板，设置大小，添加按钮
	 * @return
	 */
	public JPanel getPanel4(){
		JPanel panel=new JPanel(new FlowLayout(FlowLayout.CENTER));
		panel.setOpaque(false);
		panel.setPreferredSize(new Dimension(580,30));
		panel.add(getButton4());
		return panel;
	}
	/**
	 * 创建按钮
	 * @return
	 */
	public JRadioButton getButton4(){
		b4=new JRadioButton("腾讯-社会新闻");
		return b4;
	}
	/**
	 * 创建面板为其设置流式布局，设置隐藏面板，设置大小，添加按钮
	 * @return
	 */
	public JPanel getPanel5(){
		JPanel panel=new JPanel(new FlowLayout(FlowLayout.CENTER));
		panel.setOpaque(false);
		panel.setPreferredSize(new Dimension(580,30));
		panel.add(getButton5());
		return panel;
	}
	/**
	 * 创建按钮
	 * @return
	 */
	public JRadioButton getButton5(){
		b5=new JRadioButton("新浪-军事新闻");
		return b5;
	}
	/**
	 * 创建面板为其设置流式布局，设置隐藏面板，设置大小，添加按钮
	 * @return
	 */
	public JPanel getPanel6(){
		JPanel panel=new JPanel(new FlowLayout(FlowLayout.CENTER));
		panel.setOpaque(false);
		panel.setPreferredSize(new Dimension(580,30));
		panel.add(getButton6());
		return panel;
	}
	/**
	 * 创建按钮
	 * @return
	 */
	public JRadioButton getButton6(){
		b6=new JRadioButton("新浪-体育      ");
		return b6;
	}
	/**
	 * 创建面板为其设置流式布局，设置隐藏面板，设置大小，添加按钮
	 * @return
	 */
	public JPanel getPanel7(){
		JPanel panel=new JPanel(new FlowLayout(FlowLayout.CENTER));
		panel.setOpaque(false);
		panel.setPreferredSize(new Dimension(580,30));
		panel.add(getButton7());
		return panel;
	}
	/**
	 * 创建按钮
	 * @return
	 */
	public JRadioButton getButton7(){
		b7=new JRadioButton("新浪-汽车      ");
		return b7;
	}
	/**
	 * 创建面板为其设置流式布局，设置隐藏面板，设置大小，添加按钮
	 * @return
	 */
	public JPanel getPanel8(){
		JPanel panel=new JPanel(new FlowLayout(FlowLayout.CENTER));
		panel.setOpaque(false);
		panel.setPreferredSize(new Dimension(580,30));
		panel.add(getButton8());
		return panel;
	}
	/**
	 * 创建按钮
	 * @return
	 */
	public JRadioButton getButton8(){
		b8=new JRadioButton("新浪-育儿      ");
		return b8;
	}
	/**
	 * 创建面板为其设置流式布局，设置隐藏面板，设置大小，添加确认按钮
	 * @return
	 */
	public JPanel getButtonPanel2(){
		JPanel buttonPanel=new JPanel(new FlowLayout(FlowLayout.CENTER));
		buttonPanel.setOpaque(false);
		buttonPanel.setPreferredSize(new Dimension(580,30));
		buttonPanel.add(getOkButton());
		return buttonPanel;
	}
	/**
	 * 创建面板为其设置流式布局，设置隐藏面板，设置大小，添加全选按钮
	 * @return
	 */
	public JPanel getButtonPanel1(){
		JPanel buttonPanel=new JPanel(new FlowLayout(FlowLayout.CENTER));
		buttonPanel.setOpaque(false);
		buttonPanel.setPreferredSize(new Dimension(580,30));
		buttonPanel.add(getAllSelsectedButton());
		return buttonPanel;
	}
	/**
	 * 创建全选按钮，为其添加监听器
	 * @return
	 */
	public JButton getAllSelsectedButton(){
		allSelectedButton=new JButton("全选");
		allSelectedButton.setPreferredSize(new Dimension(100,50));
		allSelectedButton.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				i++;
				//单击全部选择，再次单击就全部取消
				if(i%2 !=0){
					b1.setSelected(true);
					b2.setSelected(true);
					b3.setSelected(true);
					b4.setSelected(true);
					b5.setSelected(true);
					b6.setSelected(true);
					b7.setSelected(true);
					b8.setSelected(true);
				}else{
					b1.setSelected(false);
					b2.setSelected(false);
					b3.setSelected(false);
					b4.setSelected(false);
					b5.setSelected(false);
					b6.setSelected(false);
					b7.setSelected(false);
					b8.setSelected(false);
				}
			}
		});
		return allSelectedButton;
	}
	/**
	 * 添加确认添加按钮，并为其添加监听器
	 * @return
	 */
	public JButton getOkButton(){
		okButton=new JButton("确认添加");
		//设置大小
		okButton.setPreferredSize(new Dimension(100,50));
		okButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//判断个个按钮的选择状态，若选中就向保存频道信息的静态列表中添加该频道的信息
				if(b1.isSelected()){
					Channel c=new Channel("腾讯-笑话","newRssFiles/rss_fool.xml","http://joke.qq.com/fool/rss_fool.xml");
					Channel.getList().add(c);
				}
				if(b2.isSelected()){
					Channel c=new Channel("腾讯-星座","newRssFiles/rss_12star.xml","http://astro.lady.qq.com/12star/rss_12star.xml");
					Channel.getList().add(c);
				}
				if(b3.isSelected()){
					Channel c=new Channel("腾讯-国际新闻","newRssFiles/rss_newswj.xml","http://news.qq.com/newsgj/rss_newswj.xml");
					Channel.getList().add(c);
				}
				if(b4.isSelected()){
					Channel c=new Channel("腾讯-社会新闻","newRssFiles/rss_newssh.xml","http://news.qq.com/newssh/rss_newssh.xml");
					Channel.getList().add(c);
				}
				if(b5.isSelected()){
					Channel c=new Channel("新浪-军事新闻","newRssFiles/hot_roll.xml","http://rss.sina.com.cn/roll/mil/hot_roll.xml");
					Channel.getList().add(c);
				}
				if(b6.isSelected()){
					Channel c=new Channel("新浪-体育","newRssFiles/england.xml","http://rss.sina.com.cn/sports/global/england.xml");
					Channel.getList().add(c);
				}
				if(b7.isSelected()){
					Channel c=new Channel("新浪-汽车","newRssFiles/auto.xml","http://rss.sina.com.cn/news/allnews/auto.xml");
					Channel.getList().add(c);
				}
				if(b8.isSelected()){
					Channel c=new Channel("新浪-育儿","newRssFiles/news.xml","http://rss.sina.com.cn/baby/news/news.xml");
					Channel.getList().add(c);
				}
				//创建解析，显示XML文件的面板
				JMainFrame jmf=new JMainFrame();
				//设置该面板可见
				jmf.setVisible(true);
				//在选择完频道信息后设置频道信息面板隐藏
				SelectedList.this.setVisible(false);
			}
		});
		return okButton;
	}
}