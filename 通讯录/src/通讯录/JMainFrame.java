package 通讯录;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
@SuppressWarnings("serial")
public class JMainFrame extends JFrame{
	private JPanel mainPanel;
	private JTextField saveAddress;
	private JTextField num;
	private JTextField name;
	private JTextField phoneNumber;
	private JTextField emailAddress;
	private JTextField address;
	private JTextField referName;
	private JButton addNewPerson;
	private JButton removeAllPerson;
	private JButton refer;
	private JButton show;
	private JButton out;
	private JRadioButton sex0;
	private JRadioButton sex1;
	private JComboBox<String> relationshipBox;
	private DefaultTableModel dtm;
	private JTable jt;
	private ArrayList<Contact> result;
	
	JMainFrame(){
		//设置标题
		this.setTitle("通讯录");
		//设置大小
		this.setSize(600,500);
		//设置关闭状态
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//使窗口居中
		Dimension screenSize=Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation((screenSize.width-600)/2, (screenSize.height-500)/2);
		//将文件夹内的图片设置为图标
		ImageIcon imageIcon=new ImageIcon("image/adress-book-32.png");
		Image image=imageIcon.getImage();
		this.setIconImage(image);
		//创建主面板
		mainPanel=new MyPanel();
		//将addPanel1，addPanel2，addPanel3，addPanel4，addPanel5添加到主面板
		mainPanel.add(getAddPanel1());
		mainPanel.add(getAddPanel2());
		mainPanel.add(getAddPanel3());
		mainPanel.add(getAddPanel4());
		mainPanel.add(getAddPanel5());
		//在mainPanel面板添加用来显示信息的表格
		dtm=new DefaultTableModel();
		String [] str={"姓名","手机号","邮箱"};
		dtm.addColumn(str[0]);
		dtm.addColumn(str[1]);
		dtm.addColumn(str[2]);
		jt=new JTable(dtm);
		JScrollPane tableScrollPane=new JScrollPane(jt); 
		tableScrollPane.setPreferredSize(new Dimension(580,250));
		mainPanel.add(tableScrollPane);
		//将主面板添加到窗口中
		this.add(mainPanel);
	}
	/**
	 *创建面板addPanel1，并添加组件
	 * @return 面板addPanel1
	 */
	private JPanel getAddPanel1(){
		JPanel addPanel1=new JPanel();
		//设置面板透明化
		addPanel1.setOpaque(false);
		//添加路径文本框，并设置内容
		addPanel1.add(new JLabel("路径："));
		saveAddress=new JTextField(44);
		saveAddress.setText("files/contact.txt");
		addPanel1.add(saveAddress);
		return addPanel1;
	}
	/**
	 * 创建面板addPanel2，并添加组件
	 * @return 面板addPanel2
	 */
	private JPanel getAddPanel2(){
		JPanel addPanel2=new JPanel();
		//设置面板透明化
		addPanel2.setOpaque(false);
		//添加序号，姓名，电话文本框
		addPanel2.add(new JLabel("序号："));
		num=new JTextField(10);
		addPanel2.add(num);
		addPanel2.add(new JLabel("姓名："));
		name=new JTextField(12);
		addPanel2.add(name);
		addPanel2.add(new JLabel("电话："));
		phoneNumber=new JTextField(12);
		addPanel2.add(phoneNumber);
		return addPanel2;
	}
	/**
	 * 创建面板addPanel3，并添加组件
	 * @return 面板addPanel3
	 */
	private JPanel getAddPanel3(){
		JPanel addPanel3=new JPanel();
		//设置面板透明化
		addPanel3.setOpaque(false);
		//添加email和地址文本框
		addPanel3.add(new JLabel("email："));
		emailAddress=new JTextField(18);
		addPanel3.add(emailAddress);
		addPanel3.add(new JLabel("地址："));
		address=new JTextField(20);
		addPanel3.add(address);
		return addPanel3; 
	}
	/**
	 * 创建面板addPanel4，并添加组件
	 * @return 面板addPanel4
	 */
	private JPanel getAddPanel4(){
		JPanel addPanel4=new JPanel(new FlowLayout(FlowLayout.LEFT));
		//设置面板透明化
		addPanel4.setOpaque(false);
		//添加性别的单选按钮,默认为男性
		addPanel4.add(new JLabel("性别"));
		sex0=new JRadioButton("男",true);
		sex1=new JRadioButton("女",false);
		ButtonGroup group=new ButtonGroup();
		group.add(sex0);
		group.add(sex1);
		addPanel4.add(sex0);
		addPanel4.add(sex1);
		//添加关系的下拉按钮
		addPanel4.add(new JLabel("关系"));
		String []relationship={"同学","朋友","亲戚","同事"};
		relationshipBox=new JComboBox<String>(relationship);
		addPanel4.add(relationshipBox);
		//添加新增联系人按钮和清空联系人按钮
		addPanel4.add(getAddNewPersonButton());
		addPanel4.add(getRemoveAllPerson());
		return addPanel4;
	}
	/**
	 * 创建面板addPanel5，并向其中添加一些组件
	 * @return 面板addPanel5
	 */
	private JPanel getAddPanel5(){
		JPanel addPanel5=new JPanel(new FlowLayout(FlowLayout.LEFT));
		//设置面板透明化
		addPanel5.setOpaque(false);
		addPanel5.add(new JLabel("联系人姓名："));
		referName=new JTextField(10);
		//添加联系人姓名文本框
		addPanel5.add(referName);
		//添加查询联系人按钮
		addPanel5.add(getRefer());
		//添加查看联系人按钮
		addPanel5.add(getShow());
		//添加导出联系人按钮
		addPanel5.add(getOut());
		return addPanel5;
	}
	/**
	 * 创建新增联系人按钮并为其添加监听器
	 * @return 新增联系人按钮
	 */
	private JButton getAddNewPersonButton(){
		addNewPerson=new JButton("新增联系人");
		addNewPerson.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(e.getSource()==addNewPerson){
					//判断是不是联系人的所有信息都输入完全,是的就保存到文件中，否则就弹出提示窗口
					if(textIsEmpty()==false){
						String str=null;
						//将文本框中输入的内容连接为字符串
						str=num.getText()+"##"+name.getText()+"##"+phoneNumber.getText()+"##"+emailAddress.getText()+"##"+address.getText();
						//调用FileOperation中的静态方法将字符串写入文件中
						FileOperation.saveContact(str, "files/contact.txt");
						JOptionPane.showMessageDialog(null, "成功保存！");
					}else
						JOptionPane.showMessageDialog(null, "您的信息没有输入完！！！请继续输入");
				}
			}
		});
		return addNewPerson;
	}
	/**
	 * 创建清空联系人按钮，并为其添加监听器
	 * @return 清空联系人按钮
	 */
	private JButton getRemoveAllPerson(){
		removeAllPerson=new JButton("清空联系人");
		removeAllPerson.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//清空用来保存联系人信息文件中的内容
				FileOperation.remove();
			}
		});
		return removeAllPerson;
	}
	/**
	 * 创建查询联系人按钮并为其添加监听器
	 * @return 查询联系人按钮
	 */
	private JButton getRefer(){
		refer=new JButton("查询联系人");
		refer.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//取出联系人姓名文本框中的内容
				String str=referName.getText();
				//判断联系人文本框中的内容是否为空，为空就取出所有联系人的信息存到列表result中，否则就只取出该联系人的信息存入列表result中
				if(str.equals(""))
					result =FileOperation.getContacts("files/contact.txt");
				else 
					result =FileOperation.getReferContacts(str);
				//如果列表为空，弹出提示信息,否则清空表格输出列表result中的指定内容到表格中
				if(result==null)
					JOptionPane.showMessageDialog(null ,"信息不存在！");
				else
					//清空表格
					while(dtm.getRowCount()>0)
						dtm.removeRow(0);
				//输出信息到表格
				for(int i=0;i<result.size();i++){
					Contact contact=result.get(i);
					String[] data={contact.getName(),contact.getPhoneNumber(),contact.getEmailAddress()};			
					dtm.addRow(data);
				}
			}
		});
		return refer;
	}
	/**
	 * 创建查看联系人按钮并为其添加监听器
	 * @return 查看联系人按钮
	 */
	private JButton getShow(){
		show=new JButton("查看联系人");
		show.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int selectRow=jt.getSelectedRow();
				//判断表格中是否有行被选中，没有的话弹出提示信息，有的话弹出被选中联系人的详细信息
				if(selectRow==-1)
					JOptionPane.showMessageDialog(null, "请在所有联系人选中想查看的具体联系人");
                else{
                		Contact  contact=result.get(selectRow);
                		//弹出联系人详细信息的窗口
                    showInfor(contact);
                }
			}
		});
		return show;
	}
	/**
	 * 创建导出联系人按钮并为其添加监听器
	 * @return 导出联系人按钮
	 */
	private JButton getOut(){
		out=new JButton("导出联系人");
		out.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//取出路径文本框中的内容
				String filePath=saveAddress.getText();
				//将files/contact.txt内的内容以Contact对象的形式保存在result列表中
				result=FileOperation.getContacts("files/contact.txt");
				//将文件files/contact.txt的内容另存到filePath文件中去
				if(FileOperation.saveContact(result,filePath)==true)
					//弹出导出成功的信息
					JOptionPane.showMessageDialog(null,"成功导出！！");
				else
					//弹出导出失败的信息
					JOptionPane.showMessageDialog(null,"导出失败！！");		
			}
		});
		return out;
	}
	/**
	 * 弹出一个窗口，用来显示联系人的详细信息
	 * @param contact
	 */
	private void showInfor(Contact contact){
		JFrame showJFrame=new JFrame();
		showJFrame.setTitle("详细信息");
		showJFrame.setSize(250,300);
		JPanel jp=new JPanel(new FlowLayout(FlowLayout.LEFT));
		jp.add(new JLabel("编号："));
		JTextField num=new JTextField(15);
		jp.add(num);
		num.setText(contact.getNum());
		jp.add(new JLabel("姓名："));
		JTextField name=new JTextField(15);
		jp.add(name);
		name.setText(contact.getName());
		jp.add(new JLabel("电话："));
		JTextField phoneNumber=new JTextField(15);
		jp.add(phoneNumber);
		phoneNumber.setText(contact.getPhoneNumber());
		jp.add(new JLabel("邮箱："));
		JTextField emailAddress=new JTextField(15);
		jp.add(emailAddress);
		emailAddress.setText(contact.getEmailAddress());
		jp.add(new JLabel("住址："));
		JTextField address=new JTextField(15);
		jp.add(address);
		address.setText(contact.getAddress());
		jp.add(new JLabel("性别："));
		JTextField sex=new JTextField(15);
		jp.add(sex);
		sex.setText(contact.getSex());
		jp.add(new JLabel("关系："));
		JTextField relationship=new JTextField(15);
		jp.add(relationship);
		relationship.setText(contact.getRelationship());
		showJFrame.add(jp);
		Dimension screenSize=Toolkit.getDefaultToolkit().getScreenSize();
		showJFrame.setLocation((screenSize.width-250)/2, (screenSize.height-200)/2);
		showJFrame.setVisible(true);
	}
	/**
	 * 判断联系人信息的文本框是不是输入完了，全部输入完了就反回true，否则返回false
	 * @return
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
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JMainFrame j=new JMainFrame();
		j.setVisible(true);
	}

}