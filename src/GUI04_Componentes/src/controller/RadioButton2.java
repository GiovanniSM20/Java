package controller;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class RadioButton2 extends JFrame {
	
	ImageIcon iconHomem = new ImageIcon("img/homem.jpg");
	ImageIcon iconMulher = new ImageIcon("img/homem.jpg");
	JLabel label = new JLabel(iconHomem);
	JRadioButton radioHomem = new JRadioButton("Homem");
	JRadioButton radioMulher = new JRadioButton("Mulher");
	ButtonGroup group = new ButtonGroup();
	
	public RadioButton2 (){
	super("Exemplo RadioButton");
	
	label.setPreferredSize(new Dimension(150, 300));
	
	
	radioHomem.setMnemonic(KeyEvent.VK_H);
	radioHomem.setActionCommand("Homem");
	radioHomem.setSelected(true);
	
	radioMulher.setMnemonic(KeyEvent.VK_M);
	radioMulher.setActionCommand("Mulher");
	
	group.add(radioHomem);
	group.add(radioMulher);

	radioHomem.addActionListener(new ActionListener() {
	
	
		public void actionPerformed(ActionEvent e) {
			label.setIcon(iconHomem);
		}
	});
	
	radioMulher.addActionListener(new ActionListener() {
		
		
		public void actionPerformed(ActionEvent e) {
			label.setIcon(iconMulher);
		}
	});
	
		JButton botao = new JButton("Ok");
		botao.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, group.getSelection().getActionCommand(),
				"Exemplo RadioButton2", JOptionPane.INFORMATION_MESSAGE);
			}
		});
	
		JPanel radioPainel = new JPanel( new GridLayout(2, 1));
		radioPainel.add(radioHomem);
		radioPainel.add(radioMulher);
		
		Container container = getContentPane();
		
		container.add(radioPainel, BorderLayout.WEST);
		container.add(label, BorderLayout.CENTER);
		container.add(label, BorderLayout.SOUTH);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 400);
		setVisible(true);
	}
	public static void main(String[] args) {
		new RadioButton2();
	}
}
