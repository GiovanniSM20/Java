package controller;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class Carros extends JFrame {
	JTabbedPane teste1 = new JTabbedPane();

	JLabel label1 = new JLabel("Fabricante: Max");
	JLabel label12 = new JLabel("Modelo: max tub");
	JLabel label13 = new JLabel("Ano: 2005");
	JLabel label14 = new JLabel("Motor: 2.0");
	JLabel label15 = new JLabel("Preço: R$ 50.000 CONTO");
	JPanel painel1 = new JPanel();

	ImageIcon carro1 = new ImageIcon("img/maxresdefault.jpg");
	JLabel label16 = new JLabel(carro1);

	JLabel label2 = new JLabel("Fabricante: relampago marquinos");
	JPanel painel2 = new JPanel();
	JLabel label22 = new JLabel("Modelo: kkkl");
	JLabel label23 = new JLabel("Ano: 2010");
	JLabel label24 = new JLabel("Motor: 2.0");
	JLabel label25 = new JLabel("Preço: R$ 150.000.00,3");
	ImageIcon carro2 = new ImageIcon("img/relampagpo marquinhos.jpg");
	JLabel label26 = new JLabel(carro2);

	JLabel label3 = new JLabel("Fabricante: Mateee");
	JLabel label32 = new JLabel("Modelo: loll");
	JLabel label33 = new JLabel("Ano: 2005");
	JLabel label34 = new JLabel("Motor: 6.78");
	JLabel label35 = new JLabel("Preço: é mais de 8 mil");
	JPanel painel3 = new JPanel();
	ImageIcon carro3 = new ImageIcon("img/MaterCars.jpg");
	JLabel label36 = new JLabel(carro3);

	public Carros() {
		super("CARROS");
		// começo do painel1
		painel1.add(label1);
		painel1.add(label12);
		painel1.add(label13);
		painel1.add(label14);
		painel1.add(label15);
		painel1.add(label16);
		painel1.setLayout(new GridLayout(5,1));
		// começo do painel2
		painel2.add(label2);
		painel2.add(label22);
		painel2.add(label23);
		painel2.add(label24);
		painel2.add(label25);
		painel2.add(label26);
		painel2.setLayout(new GridLayout(5,1));
		// começo do painel3
		painel3.add(label3);
		painel3.add(label32);
		painel3.add(label33);
		painel3.add(label34);
		painel3.add(label35);
		painel3.add(label36);
		painel3.setLayout(new GridLayout(5,1));

		teste1.addTab("max", null, painel1, "Primeiro CARRO");
		teste1.addTab("relampago marquinhos", null, painel2, "Segundo CARRO");
		teste1.addTab("mate", null, painel3, "Terceiro CARRO");

		Container container = getContentPane();
		container.add(teste1);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(980,600);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Carros();
	}

}
