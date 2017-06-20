package controller;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class ExercicioJanelasEPaineis extends JFrame{
	public ExercicioJanelasEPaineis(){
		ImageIcon icone1 = new ImageIcon("img/2015-Tesla-Model-S-P90D-PLACEMENT.jpg");
		ImageIcon icone2 = new ImageIcon("img/fordmustang.jpg");
		ImageIcon icone3 = new ImageIcon("img/campg.jpg");
		
		JLabel labelTexto11 = new JLabel("Fabricante: Tesla");
		JLabel labelTexto12 = new JLabel("Modelo: S");
		JLabel labelTexto13 = new JLabel("Ano: 2015");
		JLabel label1 = new JLabel(icone1);
		
		JLabel labelTexto21 = new JLabel("Fabricante: Ford");
		JLabel labelTexto22 = new JLabel("Modelo: Mustang");
		JLabel labelTexto23 = new JLabel("Ano: 2014");
		JLabel label2 = new JLabel(icone2);
		
		JLabel labelTexto31 = new JLabel("Fabricante: Volkswagen");
		JLabel labelTexto32 = new JLabel("Modelo: Golf");
		JLabel labelTexto33 = new JLabel	("Ano: 2011");
		JLabel label3 = new JLabel(icone3);
		
		JPanel painel1 = new JPanel();
		JPanel painel1T = new JPanel();
		painel1T.setLayout(new GridLayout(3,1));
		painel1T.add(labelTexto11);
		painel1T.add(labelTexto12);
		painel1T.add(labelTexto13);
		painel1.add(painel1T);
		painel1.add(label1);
		
		JPanel painel2 = new JPanel();
		JPanel painel2T = new JPanel();
		painel2T.setLayout(new GridLayout(3,1));
		painel2T.add(labelTexto21);
		painel2T.add(labelTexto22);
		painel2T.add(labelTexto23);
		painel2.add(painel2T);
		painel2.add(label2);
		
		JPanel painel3 = new JPanel();
		JPanel painel3T = new JPanel();
		painel3T.setLayout(new GridLayout(3,1));
		painel3T.add(labelTexto31);
		painel3T.add(labelTexto32);
		painel3T.add(labelTexto33);
		painel3.add(painel3T);
		painel3.add(label3);
		
		JTabbedPane abas = new JTabbedPane();

		
		abas.addTab("Carro 1", null, painel1, "Primeiro painel");
		abas.addTab("Carro 2", null, painel2, "Segundo painel");
		abas.addTab("Carro 3", null, painel3, "Terceiro painel");
		
		Container container = getContentPane();
		container.add(abas);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000, 1000);
		setVisible(true);
	}
	public static void main(String[] args){
		new ExercicioJanelasEPaineis();
	}

}
