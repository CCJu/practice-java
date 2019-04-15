package com.ruanko;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
@SuppressWarnings("serial")
public class JMainFrame extends JFrame implements ActionListener{
	/**
	 * @param args
	 */
	private JPanel mainPanel;
	private JPanel addPanel1;
	private JPanel addPanel2;
	private JPanel addPanel3;
	private JPanel addPanel4;
	private JPanel addPanel5;
	private JPanel tablePanel;
	private JTextField saveAddress;
	private JTextField num;
	private JTextField name;
	private JTextField phoneNumber;
	private JTextField emailAddress;
	private JTextField address;
	private JRadioButton sex0;
	private JRadioButton sex1;
	private JComboBox relationshipBox;
	private JButton addNewPerson;	
	private JButton refer;
	private JButton show;
	private JButton out;
	private JButton removeFile;
	private JTextField personName;
	private DefaultTableModel table;
	private JTable a;
	/**
	 * JmainFrame的构造方法
	 */
	JMainFrame(){
		//设置窗口标题
		this.setTitle("通讯录");
		//设置窗口大小
		this.setSize(600, 500);
		//设置关闭按钮
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//设置主窗口欢迎信息
		JLabel lable=new JLabel("欢迎进入通讯录系统");
		//设置欢迎信息大小
		lable.setFont(new Font("",Font.ITALIC,60));
		this.getContentPane().add(lable);
		
		//将image文件夹内的图片替换为图标
		ImageIcon imageIcon=new ImageIcon("image/adress-book-32.png");
		Image image=imageIcon.getImage();
		this.setIconImage(image);
		
		//获得屏幕大小，并通过方法来使窗口居中
		Dimension screenSize=Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation((screenSize.width-600)/2, (screenSize.height-500)/2);
		
		//调用构造方法为MyPanel面板设置背景图片
		mainPanel=new MyPanel();
		
		//在addPanel1容器中，创建联系人路径的文本输入框
		addPanel1=new JPanel(new FlowLayout(FlowLayout.LEFT));
		//将addPanel1透明化
		addPanel1.setOpaque(false);      
		addPanel1.add(new JLabel("联系人路径："));
		saveAddress=new JTextField(40);
		saveAddress.setText("files/out.txt");
		addPanel1.add(saveAddress);
		
		//在addPanel2容器中，创建联系人编号的文本输入框
		addPanel2=new JPanel(new FlowLayout(FlowLayout.LEFT));
		//将addPanel2透明化
		addPanel2.setOpaque(false);  
		addPanel2.add(new JLabel("编号："));
		num=new JTextField(10);
		addPanel2.add(num);
		
		//在addPanel2容器中，创建联系人姓名的文本输入框
		addPanel2.add(new JLabel("姓名："));
		name=new JTextField(10);
		addPanel2.add(name);
		
		//在addPanel2容器中，创建联系人手机号的文本输入框
		addPanel2.add(new JLabel("手机号："));
		phoneNumber=new JTextField(10);
		addPanel2.add(phoneNumber);
		
		//在addPanel3容器中，创建联系人email地址的文本输入框
		addPanel3=new JPanel(new FlowLayout(FlowLayout.LEFT));
		//将addPanel3透明化
		addPanel3.setOpaque(false);  
		addPanel3.add(new JLabel("email："));
		emailAddress=new JTextField(10);
		addPanel3.add(emailAddress);
		
		//在addPanel3容器中，创建联系人地址的文本输入框
		addPanel3.add(new JLabel("地址："));
		address=new JTextField(26);
		addPanel3.add(address);
		
		//在addPanel4容器中，创建联系人性别的选择按钮（只能选择一个不能多选）
		addPanel4=new JPanel(new FlowLayout(FlowLayout.LEFT));
		//将addPanel4透明化
		addPanel4.setOpaque(false);  
		addPanel4.add(new JLabel("性别："));
		sex0=new JRadioButton("男",true);
		sex1=new JRadioButton("女",false);
		ButtonGroup group=new ButtonGroup();
		group.add(sex0);
		group.add(sex1);
		addPanel4.add(sex0);
		addPanel4.add(sex1);
		
		//在addPanel4容器中，创建联系人关系的下拉按钮
		addPanel4.add(new JLabel("关系："));
		String []relationship={"同事","同学","亲戚","朋友"};
		relationshipBox=new JComboBox(relationship);
		addPanel4.add(relationshipBox);
		
		//创建新增联系人的按钮，用来添加新的联系人
		addNewPerson=new JButton("新增联系人");
		addNewPerson.addActionListener(this);
		addPanel4.add(addNewPerson);
		removeFile=new JButton("清空所有联系人");
		removeFile.addActionListener(this);
		addPanel4.add(removeFile);
		
		//创建一个addPanel5容器，在其中添加要查询的联系人姓名的文本输入框
		addPanel5=new JPanel(new FlowLayout(FlowLayout.LEFT));
		//将addPanel5透明化
		addPanel5.setOpaque(false);  
		addPanel5.add(new JLabel("联系人姓名："));
		personName=new JTextField(10);
		addPanel5.add(personName);
		
		//创建查询，查看，导出联系人的按钮，并都添加监听器，都添加到addPanel5容器中
		refer=new JButton("查询联系人");
		refer.addActionListener(this);
		addPanel5.add(refer);
		show=new JButton("查看联系人");
		show.addActionListener(this);
		addPanel5.add(show);
		out=new JButton("导出联系人");
		out.addActionListener(this);
		addPanel5.add(out);
		
		//将addPanel1,addPanel2,addPanel3,addPanel4,addPanel5容器添加到mainPanel容器中去
		mainPanel.add(addPanel1);
		mainPanel.add(addPanel2);
		mainPanel.add(addPanel3);
		mainPanel.add(addPanel4);
		mainPanel.add(addPanel5);
		
		//创建用来显示联系人信息的表格,并添加到mainPanel中去
		String [] str={"姓名","手机号","邮箱"};
		table=new DefaultTableModel();
		table.addColumn(str[0]);
		table.addColumn(str[1]);
		table.addColumn(str[2]);
		a=new JTable(table);
		JScrollPane tableScrollPane=new JScrollPane(a); 
		tableScrollPane.setPreferredSize(new Dimension(580,250));
		tablePanel=new JPanel(new FlowLayout(FlowLayout.LEFT));
		tablePanel.add(tableScrollPane);
		mainPanel.add(tablePanel);
		
		//将mainPanel容器内的内容添加到顶级容器JMainframe中去
		this.add(mainPanel);
	}
	@Override
	/**
	 * 
	 */
	public void actionPerformed(ActionEvent arg0) {
		//对新增联系人按钮进行响应
		if(arg0.getSource()==addNewPerson){
			//判断是不是输入了所有的信息，没输入完则继续输入，输入完毕就保存到文本
			if(textIsEmpty()==false){
				//对文本框中的信息进行判断，是否已经保存过（根据电话号码来判断是不是重复）
				String str=textToString();
				Contacts c=Contacts.strToContacts(str);
				//将文件内的信息临时保存在列表ContactsList中（以Contacts对象的形式保存）
				FileHandle.addContacts();
				if(Contacts.getContactsList().contains(c)) 	
					JOptionPane.showMessageDialog(null, "该电话号码已被占用！！！");
				else{
					FileHandle.writeFile(str);
					JOptionPane.showMessageDialog(null, "成功添加联系人");
					//保存完毕后清空文本框，以便下一次输入
					num.setText("");
					name.setText("");
					phoneNumber.setText("");
					emailAddress.setText("");
					address.setText("");
				}
				//清空用来临时保存联系人信息的列表ContactsList（为了保证列表中保存的都是最新的信息）
				Contacts.getContactsList().clear();
			}else
				JOptionPane.showMessageDialog(null, "您的信息没有输入完！！！请继续输入");
		}
		//对查询联系人按钮进行响应
		if(arg0.getSource()==refer){
			//将文件中的信息临时保存在列表ContactsList中
			FileHandle.addContacts();
			if(personName.getText().equals("")){
				//清空表格table中的内容
				while(table.getRowCount()>0)
					table.removeRow(0);
				//将ContactsList中保存的部分信息在表格中显示
				String []showInformation=new String[3];
				for(Contacts c:Contacts.getContactsList()){
					showInformation[0]=c.getName();
					showInformation[1]=c.getPhoneNumber();
					showInformation[2]=c.getEmailAddress();
					table.addRow(showInformation);
				}
			}else{
				String n=personName.getText();
				Contacts o=new Contacts();
				o.setName(n);
				//在保存临时信息的列表中判断是否存在该联系人（按姓名来搜索判断）
				if(Contacts.getContactsList().contains(o)) 
					JOptionPane.showMessageDialog(null, "通讯录中无该联系人！！！");
				//存在就将该联系人的部分信息输出表格中
				else{
					while(table.getRowCount()>0)
						table.removeRow(0);
					int i=0;
					//遍历出该联系人的索引
					for (Contacts m :Contacts.getContactsList() ) {
						if(m.getName().equals(o.getName())) break;
						i++;
					}
					//将部分信息存储到数组中
					String []showInformation=new String[3];
					showInformation[0]=Contacts.getContactsList().get(i).getName();
					showInformation[1]=Contacts.getContactsList().get(i).getPhoneNumber();
					showInformation[2]=Contacts.getContactsList().get(i).getEmailAddress();
					table.addRow(showInformation);
				}
			}
			//显示完毕后弹出成功显示的窗口
			JOptionPane.showMessageDialog(null, "成功显示");	
			//清空用来临时保存联系人信息的列表（为了保证列表中保存的都是最新的信息）
			Contacts.getContactsList().clear();
		}
		//对查看联系人按钮进行响应
		if(arg0.getSource()==show){
			//将文件中的信息临时保存在列表ContactsList中
			FileHandle.addContacts();
			//判断表格中是否有被选中的行
			if(a.getSelectedRow()!=-1){
				//将被选中行的索引传递给i
				int i=a.getSelectedRow();
				//弹出一个窗口，窗口中包含被选中行的联系人的详细信息
				showOwnInformation(i);
			}else					//表格中没有被选中的行就弹出提示框
				JOptionPane.showMessageDialog(null, "未选中表格中的内容！！！");
			//清空用来临时保存联系人信息的列表（为了保证列表中保存的都是最新的信息）
			Contacts.getContactsList().clear();
		}
		//对导出联系人按钮进行响应
		if(arg0.getSource()==out){
			FileHandle.addContacts();
			//输入要导出的路径
			String str=saveAddress.getText();
			//文件保存路径不为空且表格中有数据就将信息另存到指定的位置，否则弹出相应的提示信息
			if(!str.equals("")){
				if(table.getRowCount()>0){
					File file=new File(str);
					FileWriter fileWriter;
					try {
						fileWriter = new FileWriter(file,true);
						for (Contacts  c: Contacts.getContactsList())
							fileWriter.write(c.toString()+"\n");
						fileWriter.close();
						JOptionPane.showMessageDialog(null, "成功导出！！！");
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}else 
					JOptionPane.showMessageDialog(null, "表格中没有导出的信息！！！");
			}else
				JOptionPane.showMessageDialog(null, "未输入保存路径！！！");
		}
		//对清空所有联系人按钮进行响应
		if(arg0.getSource()==removeFile){
			FileHandle.remove();
		}
	}
	/**
	 * 创建一个用来显示详细信息的容器，并通过索引将内容显示到容器中去
	 * @param i （为要显示的联系人的索引）
	 */
	public void showOwnInformation(int i){
		JFrame showJFrame=new JFrame();
		showJFrame.setTitle("详细信息");
		showJFrame.setSize(250,300);
		JPanel jp=new JPanel(new FlowLayout(FlowLayout.LEFT));
		jp.add(new JLabel("编号："));
		JTextField num=new JTextField(15);
		jp.add(num);
		num.setText(Contacts.getContactsList().get(i).getNum());
		jp.add(new JLabel("姓名："));
		JTextField name=new JTextField(15);
		jp.add(name);
		name.setText(Contacts.getContactsList().get(i).getName());
		jp.add(new JLabel("电话："));
		JTextField phoneNumber=new JTextField(15);
		jp.add(phoneNumber);
		phoneNumber.setText(Contacts.getContactsList().get(i).getPhoneNumber());
		jp.add(new JLabel("邮箱："));
		JTextField emailAddress=new JTextField(15);
		jp.add(emailAddress);
		emailAddress.setText(Contacts.getContactsList().get(i).getEmailAddress());
		jp.add(new JLabel("住址："));
		JTextField address=new JTextField(15);
		jp.add(address);
		address.setText(Contacts.getContactsList().get(i).getAddress());
		jp.add(new JLabel("性别："));
		JTextField sex=new JTextField(15);
		jp.add(sex);
		sex.setText(Contacts.getContactsList().get(i).getSex());
		jp.add(new JLabel("关系："));
		JTextField relationship=new JTextField(15);
		jp.add(relationship);
		relationship.setText(Contacts.getContactsList().get(i).getRelationship());
		showJFrame.add(jp);
		Dimension screenSize=Toolkit.getDefaultToolkit().getScreenSize();
		showJFrame.setLocation((screenSize.width-250)/2, (screenSize.height-200)/2);
		showJFrame.setVisible(true);
	}
	/**
	 * 判断文本框中是否输入了内容（是否都为空）
	 * @return 都不为空则返回true
	 */
	public boolean textIsEmpty(){
		boolean a=true;
		if(!num.getText().equals(""))
			if(!name.getText().equals(""))
				if(!phoneNumber.getText().equals(""))
					if(!emailAddress.getText().equals(""))
						if(!address.getText().equals(""))
							a=false;
		return a;
	}
	/**
	 * 将文本框中的内容连接为字符串
	 * @return 连接后的字符串
	 */
	public String textToString(){
		String sexStr=null;
		if(sex0.isSelected()) sexStr="男";
		else if(sex1.isSelected()) sexStr="女";
		String relationshipStr=relationshipBox.getSelectedItem().toString();
		String str=num.getText()+"##"+name.getText()+"##"+phoneNumber.getText()+"##"+emailAddress.getText()+"##"+address.getText()+"##"+sexStr+"##"+relationshipStr;
		return str;
	}
	
	
	public static void main(String[] args) {
		JMainFrame frame=new JMainFrame();
		//使窗口可显示
		frame.setVisible(true);
	}

}