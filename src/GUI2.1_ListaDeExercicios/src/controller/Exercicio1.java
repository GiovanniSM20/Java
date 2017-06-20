package controller;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Exercicio1 
{
	public static void main(String[] args) 
	{
		ImageIcon iconFoto1 = new ImageIcon("img/bin.png");
		String [] vetString = {"Homem", "Mulher"};
		Object objeto = JOptionPane.showInputDialog(null, "Qual seu gênero ?", "Pergunta 1", 
				JOptionPane.PLAIN_MESSAGE,
				iconFoto1, vetString, vetString[0]);
		JOptionPane.showMessageDialog(null, "Você selecionou: " + objeto);
		
	}

}
