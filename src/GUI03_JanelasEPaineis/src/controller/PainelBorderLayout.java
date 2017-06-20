package controller;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class PainelBorderLayout extends JFrame {
	public PainelBorderLayout() {
	
	super("Título");
	
	ImageIcon icone1 = new ImageIcon("img/chocolate.jpg");
	ImageIcon icone2 = new ImageIcon("img/ic_onoff.jpg");
	ImageIcon icone3 = new ImageIcon("img/morango.jpg");


	JLabel labelTexto = new JLabel("Texto e imagem no painel");
	JLabel label1 = new JLabel(icone1);
	JLabel label2 = new JLabel(icone2);
	JLabel label3 = new JLabel(icone3);
	
	JPanel painelTexto = new JPanel();
	painelTexto.add(labelTexto);
	
	JPanel painelPrincipal = new JPanel();
	painelPrincipal.setLayout(new BorderLayout());
	
	painelPrincipal.add(painelTexto, BorderLayout.NORTH);
	painelPrincipal.add(label1, BorderLayout.EAST);
	painelPrincipal.add(label2, BorderLayout.WEST);
	painelPrincipal.add(label3, BorderLayout.CENTER);
	
	setContentPane(painelPrincipal);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	pack();
	setVisible(true);
}
	public static void main(String[] args) {
		new PainelBorderLayout();
	}
}

