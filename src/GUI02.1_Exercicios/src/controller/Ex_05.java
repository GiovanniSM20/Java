package controller;

import javax.swing.JOptionPane;

public class Ex_05 {
	public static void main(String [] args){
		
		String nT = JOptionPane.showInputDialog("Informe um n�mero");
		
		int n = Integer.parseInt(nT);
		
		if (n>20){
			int nM = n/2;
			JOptionPane.showMessageDialog(null, "A metade do n�mero digitado � " + nM);
		}else{
			JOptionPane.showMessageDialog(null, "Foi digitado o n�mero "+n);
		}
	}

}
