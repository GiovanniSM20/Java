package controller;

import javax.swing.JOptionPane;

public class Exercicio2 
{
	public static void main(String[] args) 
	{
		int n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero"));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite outro numero"));
		int n3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite outro numero"));
		int n4 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite outro numero"));
		
		System.out.println("A soma dos numeros é : " + (n1 + n2 + n3 + n4 ));
		System.out.println("A multiplicação dos numeros é : " + (n1 * n2 * n3 * n4));
	}
	

}
