package com.ruanko.bms.ui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import com.ruanko.bms.model.Customer;


@SuppressWarnings("serial")
public class AddCustomerUI extends JDialog{
	private JTextField name;
	private JTextField dateForBirth;
	private JTextField id;
	private JTextField address;
	private JTextField phoneNumber;
	private JTextField emailAddress;
	private JTextField information;
	private JRadioButton sex0;
	private JRadioButton sex1;
	private JButton okButton;
	private JButton cancelButton;
	private JPanel contentPanel;
	AddCustomerUI(Frame owner){
		super(owner);
		this.setModal(true);
		this.setTitle("开户");
		this.setLayout(new FlowLayout());
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setSize(400,400);
		Dimension screenSize=Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation((screenSize.width-400)/2,(screenSize.height-400)/2 );

		this.setContentPane(getContentPanel());
		this.setVisible(true);
	}
	private JPanel getContentPanel(){
		contentPanel=new MyPanel();
		contentPanel.add(getTitlePanel());
		contentPanel.add(getNamePanel());
		contentPanel.add(getSexPanel());
		contentPanel.add(getDatePanel());
		contentPanel.add(getIdPanel());
		contentPanel.add(getAddressPanel());
		contentPanel.add(getPhonePanel());
		contentPanel.add(getEmailPanel());
		contentPanel.add(getHintPanel());
		contentPanel.add(getInformationPanel());
		return contentPanel;
	}
	private JPanel getTitlePanel(){
		JPanel titlePanel=new JPanel(new FlowLayout(FlowLayout.CENTER));
		titlePanel.setOpaque(false);
		titlePanel.setPreferredSize(new Dimension(400,30));
		titlePanel.add(new JLabel("用户信息"));
		return titlePanel;
	}
	private JPanel getNamePanel(){
		JPanel namePanel=new JPanel(new FlowLayout(FlowLayout.CENTER));
		namePanel.setPreferredSize(new Dimension(400,30));
		namePanel.setOpaque(false);
		namePanel.add(new JLabel("姓名：      "));
		name=new JTextField(15);
		namePanel.add(name);
		return namePanel;
	}
	private JPanel getSexPanel(){
		JPanel sexPanel=new JPanel(new FlowLayout(FlowLayout.CENTER));
		sexPanel.setOpaque(false);
		sexPanel.setPreferredSize(new Dimension(400,30));
		sexPanel.add(new JLabel("性别：        "));
		sex0=new JRadioButton("男",true);
		sex0.setPreferredSize(new Dimension(90,30));
		sex1=new JRadioButton("女",false);
		sex1.setPreferredSize(new Dimension(90,30));
		ButtonGroup bg=new ButtonGroup();
		bg.add(sex0);
		bg.add(sex1);
		sexPanel.add(sex0);
		sexPanel.add(sex1);
		return sexPanel;
	}
	private JPanel getDatePanel(){
		JPanel datePanel=new JPanel(new FlowLayout(FlowLayout.CENTER));
		datePanel.setOpaque(false);
		datePanel.setPreferredSize(new Dimension(400,30));
		datePanel.add(new JLabel("出生日期："));
		dateForBirth=new JTextField(15);
		datePanel.add(dateForBirth);
		return datePanel;
	}
	private JPanel getIdPanel(){
		JPanel idPanel=new JPanel(new FlowLayout(FlowLayout.CENTER));
		idPanel.setOpaque(false);
		idPanel.setPreferredSize(new Dimension(400,30));
		idPanel.add(new JLabel("身份证号："));
		id=new JTextField(15);
		idPanel.add(id);
		return idPanel;
	}
	private JPanel getAddressPanel(){
		JPanel addressPanel=new JPanel(new FlowLayout(FlowLayout.CENTER));
		addressPanel.setOpaque(false);
		addressPanel.setPreferredSize(new Dimension(400,30));
		addressPanel.add(new JLabel("地址：      "));
		address=new JTextField(15);
		addressPanel.add(address);
		return addressPanel;
	}
	private JPanel getPhonePanel(){
		JPanel phonePanel=new JPanel(new FlowLayout(FlowLayout.CENTER));
		phonePanel.setOpaque(false);
		phonePanel.setPreferredSize(new Dimension(400,30));
		phonePanel.add(new JLabel("电话：      "));
		phoneNumber=new JTextField(15);
		phonePanel.add(phoneNumber);
		return phonePanel;
	}
	private JPanel getEmailPanel(){
		JPanel emailPanel=new JPanel(new FlowLayout(FlowLayout.CENTER));
		emailPanel.setOpaque(false);
		emailPanel.setPreferredSize(new Dimension(400,30));
		emailPanel.add(new JLabel("邮箱：      "));
		emailAddress=new JTextField(15);
		emailPanel.add(emailAddress);
		return emailPanel;
	}
	private JPanel getHintPanel(){
		JPanel hintPanel=new JPanel(new FlowLayout(FlowLayout.CENTER));
		hintPanel.setOpaque(false);
		hintPanel.setPreferredSize(new Dimension(400,30));
		cancelButton=new JButton("取消");
		cancelButton.setPreferredSize(new Dimension(140,30));
		hintPanel.add(getOkButton());
		hintPanel.add(cancelButton);
		return hintPanel;
	}
	private JPanel getInformationPanel(){
		JPanel informationPanel=new JPanel(new FlowLayout(FlowLayout.CENTER));
		informationPanel.setOpaque(false);
		informationPanel.setPreferredSize(new Dimension(400,30));
		information=new JTextField(24);
		informationPanel.add(information);
		return informationPanel;
	}
	private JButton getOkButton(){
		okButton=new JButton("确认");
		okButton.setPreferredSize(new Dimension(140,30));
		okButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Customer c=new Customer(name.getText(),sex0.isSelected()?"男":"女",dateForBirth.getText(),id.getText(),address.getText(),phoneNumber.getText(),emailAddress.getText());
				if(c.creat()==true){ 
					System.out.println(c.toString());
					JOptionPane.showMessageDialog(AddCustomerUI.this,"开户成功！");
				}
				else{
					information.setText(c.getInformation());
					JOptionPane.showMessageDialog(AddCustomerUI.this,"开户失败！");
				}		
			}
		});
		return okButton;
	}
}