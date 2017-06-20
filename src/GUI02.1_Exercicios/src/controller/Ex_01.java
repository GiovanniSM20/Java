package controller;

import javax.swing.JOptionPane;

public class Ex_01 {
	public static void main(String[] args){
		
		String texto1 = JOptionPane.showInputDialog("Digite o seu nome completo");
		
		String texto2 = JOptionPane.showInputDialog("Digite o seu sexo");
		
		JOptionPane.showMessageDialog(null, "Seu nome é: "+ texto1 + ". \nSeu sexo é: "+ texto2+".");
	}

}
