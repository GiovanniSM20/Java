package controller;

import javax.swing.JOptionPane;

public class Exercicio3 
{
	public static void main(String[] args) 
	{
		double dolar = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o numero do pre�o em dolar"));
		double real = dolar * 1.7f;
		System.out.println("Esse valor em real � R$" + (real));
		
	}
}
