import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JScrollPane;

public class test3 extends JFrame{
//JScrollPane,J
	test3(){
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
		this.setVisible(true);
		//设置关闭方式
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new test3();
	}

}
