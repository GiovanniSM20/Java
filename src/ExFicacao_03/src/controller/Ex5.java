package controller;

import javax.swing.JOptionPane;

public class Ex5 {

	public static void main(String[] args) {

		int num1 = Integer.parseInt(JOptionPane
				.showInputDialog("Digite um numero"));

		if (num1 > 20) {
			double m = num1 / 2;
			JOptionPane.showMessageDialog(null, "A metade do teu numero �: "
					+ m);
		} else {
			JOptionPane.showMessageDialog(null, " Seu n�mero sem altera��o: "
					+ num1);
		}

	}
}