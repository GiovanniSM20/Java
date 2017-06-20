package controller;

import javax.swing.JOptionPane;

public class Ex_06 {
	public static void main(String[] args){
		
		String c = JOptionPane.showInputDialog("Informe a capital do Brasil");
	
		if(c.equals("Brasília")){
			JOptionPane.showMessageDialog(null, "A resposta está certa");
		}else{
			JOptionPane.showMessageDialog(null, "A resposta está errada");
		}
	}

}
