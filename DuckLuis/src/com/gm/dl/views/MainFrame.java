package com.gm.dl.views;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainFrame extends JFrame {

	public MainFrame()
	{
		JPanel jp = new JPanel();
		JLabel label = new JLabel("Hallo World");
		label.setSize(100, 30);
		jp.add(label);
		this.add(jp);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300, 400);
		this.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainFrame mf =  new MainFrame();
	}

}
