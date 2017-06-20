package controller;

import util.Teclado;

public class Teste {

	public static void main(String[] args) {
		
		String nome;
		nome = Teclado.lerTexto("Pergunta");
		
		int num;
		num = Teclado.lerInt("Diga um número:");
		
		double sal;
		sal = Teclado.lerDouble("Diga o seu salário:");

	}

}
