package com.ruanko.view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import com.ruanko.model.Channel;
import com.ruanko.model.News;
import com.ruanko.serivice.RssSerivice;

@SuppressWarnings("serial")
public class JMainFrame extends JFrame {
	private JPanel mainPanel;
	private JPanel operationPanel;
	private JPanel tablePanel;
	private JPanel textAreaPanel;
	private JComboBox<String> jcb;
	private JButton readButton;
	private JButton outButton;
	private JScrollPane jsp;
	private JTable jt;
	private DefaultTableModel dft;
	private JTextArea jta;
	private ActionListener al;
	JMainFrame(){
		//设置标题
		this.setTitle("RSS阅读器");
		//设置大小
		this.setSize(800,680);
		//替换图标
		ImageIcon imageIcon=new ImageIcon("images/rss.png");
		Image image=imageIcon.getImage();
		this.setIconImage(image);
		//设置居中
		Dimension screenSize=Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation((screenSize.width-800)/2,(screenSize.height-680)/2);
		//将mainPanel设置为主面板
		this.setContentPane(getMainPanel());
		//设置关闭方式
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	/**
	 * 创建主面板（流式布局左对齐）为其添加个个属性，
	 * @return
	 */
	public JPanel getMainPanel(){
		mainPanel=new MyPanel();
		mainPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		mainPanel.add(getMenu());
		mainPanel.add(getOperationPanel());
		mainPanel.add(getTablePanel());	
		mainPanel.add(getTextAreaPanel());
		return mainPanel;
	}
	/**
	 * 创建菜单
	 * @return
	 */
	public JMenuBar getMenu(){
		JMenuBar jmb=new JMenuBar();
		jmb.setOpaque(false);
		JMenu jm=new JMenu("文件");
		JMenuItem j=new JMenuItem("读取");
		//为读取按钮添加监听器
		j.addActionListener(getAl());
		JMenuItem j1=new JMenuItem("导出");
		//为导出按钮添加监听器
		j1.addActionListener(getAl1());
		JMenu jm1=new JMenu("帮助");
		JMenuItem j2=new JMenuItem("使用方法");
		jm1.add(j2);
		//为使用方法按钮添加监听器
		j2.addActionListener(getAl2());
		jm.add(j);
		jm.add(j1);
		jmb.add(jm);
		jmb.add(jm1);
		return jmb;
	}
	/**
	 * 对ActionListener实例化，并实现弹出使用说明面板的功能
	 * @return
	 */
	public ActionListener getAl2(){
		al=new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JFrame showJFrame=new JFrame();
				showJFrame.setVisible(true);
				showJFrame.setTitle("使用说明");
				showJFrame.setSize(400,170);
				Dimension screenSize=Toolkit.getDefaultToolkit().getScreenSize();
				showJFrame.setLocation((screenSize.width-400)/2,(screenSize.height-300)/2);
				JTextArea ja=new JTextArea();
				showJFrame.add(ja);
				ja.setPreferredSize(new Dimension(400,200));
				String s="\n"+"\n"+"  1.在频道选择面板选择想收听的频道"+"\n"
						+ "  2.在下拉框中选择想查看的频道"+"\n"
						+ "  3.单击读取按钮或单击文件中的读取按钮"+"\n"
						+ "  4.单击表格中的具体新闻，详细新闻会显示在文本框中"+"\n"
						+ "  5.如果想将新闻保存下来单击另存按钮或文件中的另存按钮"+"\n";
				ja.setText(s);
			}
		};
		return al;
	}
	/**
	 * 创建操作面板，对其添加个个属性
	 * @return
	 */
	public JPanel getOperationPanel(){
		operationPanel=new JPanel(new FlowLayout(FlowLayout.CENTER));
		operationPanel.setOpaque(false);
		operationPanel.setPreferredSize(new Dimension(800,30));
		operationPanel.add(new JLabel("站点:"));
		//添加下拉框
		jcb=new JComboBox<String>();
		for (Channel s : Channel.getList()) {
			jcb.addItem(s.getName());
		}
		operationPanel.add(jcb);
		operationPanel.add(getReadButton());
		operationPanel.add(getOutButton());
		return operationPanel;
	}
	/**
	 * 对ActionListener实例化，并实现导出文件的功能
	 * @return
	 */
	public ActionListener getAl1(){
		al=new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				boolean b=new RssSerivice().save(JMainFrame.this.getSelectedNews());
				if(b==true)
					JOptionPane.showMessageDialog(null, "导出成功！！");
				else
					JOptionPane.showMessageDialog(null, "导出失败！！");
			}
		};
		return al;
	}
	/**
	 * 在主面板上添加导出按钮，并对其添加监听器
	 * @return
	 */
	public JButton getOutButton(){
		outButton=new JButton("导出");
		outButton.addActionListener(getAl1());
		return outButton;
	}
	/**
	 * 对ActionListener实例化，并实现读取按钮功能
	 * @return
	 */
	public ActionListener getAl(){
		al=new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//清空表格
				while(dft.getRowCount()>0)
					dft.removeRow(0);
				ArrayList<News> al=JMainFrame.this.getSelectedNews();
				String []showInformation=new String[4];
				//将News对象的信息添加到表格中去
				for (News news : al) {
					showInformation[0]=news.getTitle();
					showInformation[1]=new SimpleDateFormat("yyy-MM-dd").format(new Date());
					showInformation[2]=news.getPubDate();
					showInformation[3]=news.getAuthor();
					dft.addRow(showInformation);
				}
				JOptionPane.showMessageDialog(null, "显示成功");
			}
		};
		return al;
	}
	/**
	 * 在主面板上添加读取按钮，并对其添加监听器
	 * @return
	 */
	public JButton getReadButton(){
		readButton=new JButton("读取");
		readButton.addActionListener(getAl());
		return readButton;
	}
	/**
	 * 创建用来显示表格的面板，对其添加监听器，若鼠标选中了表格中的某一行，对该条新闻进行详细内容的显示
	 * @return
	 */
	public JPanel getTablePanel(){
		tablePanel=new JPanel();
		tablePanel.setPreferredSize(new Dimension(800,280));
		tablePanel.setOpaque(false);
		//创建表格
		dft=new DefaultTableModel();
		jt=new JTable(dft);
		jt.addMouseListener(new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub	
			}
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub	
			}
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub	
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				int index=jt.getSelectedRow();
				//若选中了表格，调用RssSerivice类中的newsToString方法将该行的信息显示到文本域中
				if(e.getClickCount()==1&&index!=-1){
					ArrayList<News> al=JMainFrame.this.getSelectedNews();
					String s=new RssSerivice().newsToString(al.get(index));
					jta.setText(s);
				}
			}
		});
		JScrollPane jsp=new JScrollPane(jt);
		jsp.setPreferredSize(new Dimension(780,270));
		//将表头添加入表格
		String []s={"主题","接受时间","发布时间","作者"};
		for (String string : s) {
			dft.addColumn(string);
		}
		tablePanel.add(jsp);
		return tablePanel;
	}
	/**
	 * 得到频道下拉框中选中的频道信息
	 * @return 保存该频道内容的列表
	 */
	public ArrayList<News> getSelectedNews(){
		String s=(String) jcb.getSelectedItem();
		int t=0;
		for(int i=0;i<Channel.getList().size();i++){
			if(s.equals(Channel.getList().get(i).getName()))
				t=i;
		}
		RssSerivice rs=new RssSerivice();
		ArrayList<News> al=rs.parse(rs.load(Channel.getList().get(t).getFilePath()));
		return al;
	}
	/**
	 * 创建显示文本域的面板
	 * @return
	 */
	public JPanel getTextAreaPanel(){
		textAreaPanel=new JPanel();
		//设置大小
		textAreaPanel.setPreferredSize(new Dimension(790,280));
		//textAreaPanel.setOpaque(false);
		jta=new JTextArea();
		jta.setLineWrap(true);
		//将文本域封装为带滚动条的表格
		jsp=new JScrollPane(jta);
		jsp.setPreferredSize(new Dimension(780,270));
		textAreaPanel.add(jsp);
		return textAreaPanel;
	}
}
