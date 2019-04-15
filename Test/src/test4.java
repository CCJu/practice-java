import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class test4 extends JFrame{

	test4(){
		this.setTitle("welcome");
		this.setSize(400, 200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		JPanel j=new JPanel();
		j.setPreferredSize(new Dimension(400,200));
		JTextField jt=new JTextField(10);
		j.add(jt);
		JButton jb=new JButton("送出");
		j.add(jb);
		jb.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String s=jt.getText();
				double b=Double.parseDouble(s);
				System.out.println(b);
			}
		});
		this.add(j);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test4 s=new test4();
		s.setVisible(true);
	}

}
