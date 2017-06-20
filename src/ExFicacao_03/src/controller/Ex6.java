package controller;

import javax.swing.JOptionPane;

public class Ex6 {

	public static void main(String[] args) {
		String capital = JOptionPane.showInputDialog("Diga a capital do Brasil: ");
			if (capital.equals("Brasilia")){
				JOptionPane.showInputDialog(null, "VOCÊ É EXPERTÃO");
			}else{
				JOptionPane.showInputDialog(null, "VOCÊ É BURRÃO OTARO");
			}
	}

}