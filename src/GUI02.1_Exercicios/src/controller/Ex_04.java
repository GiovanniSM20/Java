package controller;

import javax.swing.JOptionPane;

public class Ex_04 {
	public static void main(String[] args){
		
		String nT = JOptionPane.showInputDialog("Informe um número.");
		int n = Integer.parseInt(nT);
		
		int nA = n-1;
		int nS = n+1;
		
		JOptionPane.showMessageDialog(null, "O antecessor é " + nA +".\nO sucessor é " + nS+".");
	}

}
