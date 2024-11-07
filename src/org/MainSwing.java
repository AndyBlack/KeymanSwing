package org;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainSwing {

	public static void main(String[] args) {
		JFrame frm;
		JPanel panel;
		JTextField text;
		frm = new JFrame();
		panel = new JPanel();
		text = new JTextField(30);
		frm.add(panel);
		panel.add(text);
		frm.setTitle("Keymnan Java Swing testing");
		frm.setSize(400, 150);
		frm.setLocationRelativeTo(null);
		frm.setVisible(true);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
