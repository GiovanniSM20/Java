package controller;

import javax.swing.JOptionPane;

public class Ex_07 {

	public static void main(String[] args){
		
		String nT = JOptionPane.showInputDialog("Informe um n�mero");
		
		int n = Integer.parseInt(nT);
		int m = 1;
		int s = 0;
		for(int i=1; i<11; i++){
			 s = n*m;
			 JOptionPane.showMessageDialog(null, "O n�mero "+ n+" multiplicado por " +m+" � igual a " + s);
			m = m+1;
			
		}
		
	}

}
