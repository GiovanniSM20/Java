package Exerciciosequencia;

import util.Teclado;

public class Exercicio23 {

	public static void main(String[] args) {
		
		int num, soma = 0;
		double media;
		for (int i = 0; i<20; i++) {
			num = Teclado.lerInt("Digite um n�mero");
			soma += num;
		}
		media = soma/20;
		System.out.println("A m�dia � " + media);
		
		
	}

}
