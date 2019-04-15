package com.ruanko.bms.ui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import  javax.swing.*;

@SuppressWarnings("serial")
public class BankUI extends JFrame{
	private JPanel welcomePanel;
	private JPanel workPanel;
	private JPanel bankPanel;
	private JButton openAnAccount;
	private JButton openNewCard;
	private JButton accountOperation;
	private JButton accountQuery;
	BankUI(){
		this.setTitle("银行管理系统");
		this.setSize(700,500);
		ImageIcon imageIcon=new ImageIcon("Image/picasa.png");
		Image image=imageIcon.getImage();
		this.setIconImage(image);
		Dimension screenSize=Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation((screenSize.width-700)/2,(screenSize.height-500)/2);
		this.setContentPane(getContentPanel());
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	private JPanel getWelcomePanel(){
		welcomePanel=new JPanel();
		welcomePanel.setPreferredSize(new Dimension(700,180));
		welcomePanel.setOpaque(false);
		String str="欢迎进入银行管理系统";
		JLabel jl=new JLabel(str);
		welcomePanel.add(jl);
		return welcomePanel;
	}
	public JPanel getWorkPanel(){
		workPanel=new JPanel();
		workPanel.setPreferredSize(new Dimension(700,300));
		workPanel.setOpaque(false);
		workPanel.add(getOpenAnAccount());
		openNewCard=new JButton("办理银行卡");
		workPanel.add(openNewCard);
		accountOperation=new JButton("账户操作");
		workPanel.add(accountOperation);
		accountQuery=new JButton("账务查询");
		workPanel.add(accountQuery);
		return workPanel;
	}
	public JButton getOpenAnAccount(){
		openAnAccount=new JButton("开户");
		openAnAccount.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(e.getSource()==openAnAccount){
					new AddCustomerUI(BankUI.this);
				}
			}	
		});
		return openAnAccount;
	}
	public JPanel getContentPanel(){
		bankPanel=new MyPanel();
		bankPanel.add(getWelcomePanel());
		bankPanel.add(getWorkPanel());
		return bankPanel;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankUI bui=new BankUI();
		bui.setVisible(true);
	}
}
