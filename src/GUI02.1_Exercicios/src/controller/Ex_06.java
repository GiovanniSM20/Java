package controller;

import javax.swing.JOptionPane;

public class Ex_06 {
	public static void main(String[] args){
		
		String c = JOptionPane.showInputDialog("Informe a capital do Brasil");
	
		if(c.equals("Bras�lia")){
			JOptionPane.showMessageDialog(null, "A resposta est� certa");
		}else{
			JOptionPane.showMessageDialog(null, "A resposta est� errada");
		}
	}

}
