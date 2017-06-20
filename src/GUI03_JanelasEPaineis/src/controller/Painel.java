package controller;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class Painel extends JFrame {
	public Painel() {
	
	super("Título");
	
	ImageIcon icone1 = new ImageIcon("img/ic_youtube.png");
	ImageIcon icone2 = new ImageIcon("img/ic_onoff.jpg");
	ImageIcon icone3 = new ImageIcon("img/ic_download.gif");


	JLabel labelTexto = new JLabel("Texto e imagem no painel");
	JLabel label1 = new JLabel(icone1);
	JLabel label2 = new JLabel(icone2);
	JLabel label3 = new JLabel(icone3);
	
	JPanel painel = new JPanel();
	painel.add(labelTexto);
	painel.add(label1);
	painel.add(label2);
	painel.add(label3);
	
	add(painel);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	pack();
	setVisible(true);
}
	public static void main(String[] args) {
		new Painel();
	}
}

