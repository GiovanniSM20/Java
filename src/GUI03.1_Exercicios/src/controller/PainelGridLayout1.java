package controller;

import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PainelGridLayout1 extends JFrame
{
	public static void main(String[] args) 
	{
		new PainelGridLayout1();
	}
	public PainelGridLayout1()
	{
		super();
		
		ImageIcon icone1 = new ImageIcon("img/ic_curtir.gif");
		ImageIcon icone2 = new ImageIcon("img/ic_onoff.jpg");
		ImageIcon icone3 = new ImageIcon("img/ic_youtube.png");
		
		JLabel labelTexto = new JLabel ("Texto e imagem no painel");
		JLabel label1 = new JLabel (icone1);
		JLabel label2 = new JLabel (icone2);
		JLabel label3 = new JLabel (icone3);
		
		JPanel painelIcones = new JPanel();
		painelIcones.add(label1);
		painelIcones.add(label2);
		painelIcones.add(label3);
		
		JPanel painelPrincipal = new JPanel();
		painelPrincipal.setLayout(new GridLayout(2,1));
		painelPrincipal.add(labelTexto);
		add(painelPrincipal);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);		
	}
	
}