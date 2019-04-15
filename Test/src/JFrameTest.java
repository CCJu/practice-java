import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class JFrameTest extends JFrame{
	private JPanel mainPanel;
	private JTable jt;
	private DefaultTableModel dtm;
	private JScrollPane jsp;
	JFrameTest(){
		//设置窗口标题
				this.setTitle("通讯录");
				
				this.setSize(600, 500);
				
				this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				JLabel lable=new JLabel("欢迎进入通讯录系统");
				
				lable.setFont(new Font("",Font.ITALIC,60));
				this.getContentPane().add(lable);
				
				Dimension screenSize=Toolkit.getDefaultToolkit().getScreenSize();
				this.setLocation((screenSize.width-600)/2, (screenSize.height-500)/2);
				this.setVisible(true);
				
				mainPanel.add(get());
				this.add(mainPanel);
	}
	public JScrollPane get(){
		if(jsp==null){
		dtm=new DefaultTableModel();
		dtm.addColumn("");
		dtm.addColumn("");
		dtm.addColumn("");}
		jt=new JTable(dtm);
		jsp=new JScrollPane(jt);
		jsp.setPreferredSize(new Dimension(580,250));
		return jsp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrameTest j=new JFrameTest();
	}

}
