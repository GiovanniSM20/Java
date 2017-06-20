package controller;

import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class Abas extends JFrame{
				
	JTabbedPane abas = new JTabbedPane();
	
	JLabel label1 = new JLabel("Painel 1");
	JPanel painel1 = new JPanel();
			
	JLabel label2 = new JLabel("Painel 2");
	JPanel painel2 = new JPanel();
			
	JLabel label3 = new JLabel("Painel 3");
	JPanel painel3 = new JPanel();
	
	ImageIcon iconAbrir = new ImageIcon("img/abrir.png");
	ImageIcon iconAjuda = new ImageIcon("img/ajuda.png");
	ImageIcon iconChocolate = new ImageIcon("img/chocolate.jpg");
	
	public static void main(String []args) {
		new Abas();
	
	}
	
	public Abas() {
	
	super("Exemplo Abas");
	
	painel1.add(label1);
	painel2.add(label2);	
	painel3.add(label3);

	abas.addTab("Abrir", iconAbrir, painel1, "Primeiro painel");
	abas.addTab("Ajuda", iconAjuda, painel2, "Segundo painel");
	abas.addTab("Chocolate", iconChocolate, painel3, "Terceiro painel");
	
	Container container = getContentPane();
	container.add(abas);
	
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setSize(300, 400);
	setVisible(true);
	
	}
}



