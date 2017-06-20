package controller;

import javax.swing.JOptionPane;

public class Ex4 {

	public static void main(String[] args) {
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite teu valor: "));
		int antec = num1 - 1;
		int suc = num1 + 1;
			JOptionPane.showMessageDialog(null,"O antecessor do valor digitado é: " + antec + " O sucessor do valor digitado é: " + suc);
	}

}
