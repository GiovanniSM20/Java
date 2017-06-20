package controller;

import javax.swing.JOptionPane;

public class Ex1 {

	public static void main(String[] args) {
		String texto1 = JOptionPane.showInputDialog("Qual seu nome? ");		
		String texto2 = JOptionPane.showInputDialog("Qual o seu sexo? ");
			JOptionPane.showMessageDialog(null,"Seu nome completo é: " + texto1 + " Seu sexo é: " + texto2);
		
		
	}

}
