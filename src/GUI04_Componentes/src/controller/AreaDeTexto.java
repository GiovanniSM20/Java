package controller;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class AreaDeTexto extends JFrame {
	
		public static void main(String[] args) {
				new AreaDeTexto();
		}
public AreaDeTexto(){
	super ("Área de Texto");
JLabel label = new JLabel("Digite uma mensagem");
JTextArea areaDeTexto = new JTextArea(10, 30);

JPanel painel = new JPanel();
painel.add(label);
painel.add(areaDeTexto);

add(painel);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
pack();
setVisible(true);

}
}

