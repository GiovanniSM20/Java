package controller;

import javax.swing.JOptionPane;

public class Ex3 {

	public static void main(String[] args) {
		double texto1 = Double.parseDouble(JOptionPane.showInputDialog("Digite teu valor em dollar: "));
			double dollar = texto1 * 1.72;
				JOptionPane.showMessageDialog(null,"O valor digitado em real é: " + dollar);
	}

}
