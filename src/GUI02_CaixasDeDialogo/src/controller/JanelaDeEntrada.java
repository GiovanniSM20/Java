package controller;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class JanelaDeEntrada {
	public static void main(String[] args) {
		 
		String texto1 =  JOptionPane.showInputDialog(null, "Janela de Entrada 1");
		JOptionPane.showMessageDialog(null, "Você digitou: " + texto1);
		
		String texto2 =  JOptionPane.showInputDialog(null, "Janela de Entrada 2");
		JOptionPane.showMessageDialog(null, "Você digitou: " + texto2);
		
		String texto3 =  JOptionPane.showInputDialog(null, "Janela de Entrada 3", "Valor inicial da janela de entrada 3");
		JOptionPane.showMessageDialog(null, "Você digitou: " + texto3);
		
		String texto4 =  JOptionPane.showInputDialog(null, "Janela de Entrada 4", "Valor inicial da janela de entrada 4");
		JOptionPane.showMessageDialog(null, "Você digitou: " + texto4);
		
		String texto5 =  JOptionPane.showInputDialog(null, "Janela de Entrada 5", "Título da janela de entrada 5",  JOptionPane.QUESTION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Você digitou: " + texto5);
		
		ImageIcon iconFoto = new ImageIcon("img/chocolate.jpg");
		String[] vetString = {"Fabrício", "Rodrigo", "Xicão", "PC"};
		Object objeto = JOptionPane.showInputDialog(null, "Janela de Entrada 6", "Título da Janela de Entrada 6", JOptionPane.PLAIN_MESSAGE, iconFoto, vetString, vetString[3]);
		JOptionPane.showMessageDialog(null, "Você selecionou: " + objeto);
		
	}

}



		
		