package controller;

import java.text.NumberFormat;

import javax.swing.JOptionPane;

public class Ex_03 {
	public static void main(String[] args){
		
		String xD = JOptionPane.showInputDialog("Informe um valor em d�lar (apenas com n�meros, virgulas e pontos)");
		
		double dolar = Double.parseDouble(xD);
		double real = dolar*1.72;
		NumberFormat f = NumberFormat.getCurrencyInstance();
		
		JOptionPane.showMessageDialog(null, "O valor em real � "+ f.format(real));
	}

}
