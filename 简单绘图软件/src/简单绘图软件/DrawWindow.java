package 简单绘图软件;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class DrawWindow extends JFrame{
	
	DrawWindow(){
		this.setTitle("绘图软件");
		this.setSize(600,500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DrawWindow dw=new DrawWindow();
		dw.setVisible(true);
	}

}
