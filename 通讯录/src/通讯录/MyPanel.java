package 通讯录;

import java.awt.*;

import javax.swing.*;

@SuppressWarnings("serial")
public class MyPanel extends JPanel{
	Image im; 
	public MyPanel() 
	{ 
		im=Toolkit.getDefaultToolkit().getImage("image/timg.jpg");
	} 
	public void paintComponent(Graphics g) 
	{ 
		super.paintComponent(g); 
		int imWidth=im.getWidth(this);
		//定义图片的宽度、高度 
		int imHeight=im.getHeight(this); 
		int FWidth=getWidth(); 
		//定义窗口的宽度、高度 
		int FHeight=getHeight();
		int x=(FWidth-imWidth)/2; 
		int y=(FHeight-imHeight)/2;//计算图片的坐标,使图片显示在窗口正中间 
		g.drawImage(im,x,y,null);//绘制图片 
	} 
}
