package controller;

import javax.swing.JOptionPane;

public class Ex2 {

	public static void main(String[] args) {
		int texto1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um num inteiro: "));
		int texto2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro: "));
		int texto3 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro: "));
		int texto4 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro: "));
			int adicao = + texto1 + texto2 + texto3 + texto4;
			int multi = texto1 * texto2 * texto3 * texto4;
			JOptionPane.showMessageDialog(null,"A soma de todos os numeros é: " + adicao +
												" A multiplicação de todos os numeros é: " + multi);
		
		
	}

}
