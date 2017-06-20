package controller;

import javax.swing.JOptionPane;

public class Ex_09 {
	public static void main(String[] args){
		String nome [] = new String [5];
		String profissao [] = new String [5];
		for(int i = 0; i < 5; i++){
			nome [i] = JOptionPane.showInputDialog("Digite o seu nome");
			profissao [i] = JOptionPane.showInputDialog("Digite a sua profissão");
			JOptionPane.showMessageDialog(null, "A pessoa: "+nome[i]+" Tem a profissão: "+profissao[i]);
		}
		
	}

}
