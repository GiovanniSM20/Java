package controller;

import javax.swing.JOptionPane;

public class Ex_02 {
	public static void main(String[] args){
		
		String x1 = JOptionPane.showInputDialog("Informe um n�mero");
		String x2 = JOptionPane.showInputDialog("Informe um n�mero");
		String x3 = JOptionPane.showInputDialog("Informe um n�mero");
		String x4 = JOptionPane.showInputDialog("Informe um n�mero");
		
		int v1 = Integer.parseInt(x1);
		int v2 = Integer.parseInt(x2);
		int v3 = Integer.parseInt(x3);
		int v4 = Integer.parseInt(x4);
		
		int soma = v1+v2+v3+v4;
		int multi = v1*v2*v3*v4;
		
		JOptionPane.showMessageDialog(null, "O resultado da adi��o dos valores � "+ soma+ 
				".\nO resultado da multiplica��o dos valores � "+multi+".");
		
	}

}
